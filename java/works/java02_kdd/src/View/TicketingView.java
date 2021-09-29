package View;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import VO.CustomerVO;
import VO.TicketVO;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class TicketingView extends JFrame {
	private String customerNm, customerID, theatherNm, movieNm, day, time, reserveDate, cost, person;
	private JLabel customerNmLbl, movieSltLbl, theaterSltLbl, dateSltLbl, timeSltLbl, personSltLbl, adultLbl, youthLbl;
	private JLabel iconLbl, theater, sltTheater, date, sltDate, number, sltperson, amount, sltAmount;
	private JList movieList, theaterList;
	private JButton reserveBtn, exitBtn;
	private JRadioButton timeRb1, timeRb2, timeRb3, timeRb4, timeRb5;
	private JRadioButton adult1, adult2, adult3, adult4, adult5;
	private JRadioButton youth1, youth2, youth3, youth4, youth5;
	
	
	CustomerVO customerVO;
	TicketVO ticketVO;
	
	public TicketingView(CustomerVO vo) {
		super("티켓 예매");
		this.customerVO = vo;
		build();
	}

	private void build() {
		setSize(850, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		Font fontB = new Font("휴먼엑스포", 1, 13);
		
		// 이미지
		ImageIcon temp_icon = new ImageIcon("img/007.jpg");
		Image temp_img = temp_icon.getImage();
		Image img = temp_img.getScaledInstance(230, 280, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(img);
		
		iconLbl = new JLabel();
		iconLbl.setIcon(icon);
		
		
		// 이곳도 디비 작업 할 수 있으면 더 좋을 듯
		// 라벨
		customerNmLbl = new JLabel(customerVO.getName() + "고객님");
		customerNmLbl.setFont(new Font("휴먼엑스토", 1, 15));
		movieSltLbl = new JLabel("영화 선택");
		movieSltLbl.setFont(fontB);
		theaterSltLbl = new JLabel("극장 선택");
		theaterSltLbl.setFont(fontB);
		dateSltLbl = new JLabel("날짜 선택");
		dateSltLbl.setFont(fontB);
		timeSltLbl = new JLabel("상영시간");
		timeSltLbl.setFont(fontB);
		personSltLbl = new JLabel("인원선택");
		personSltLbl.setFont(fontB);
		adultLbl = new JLabel("성인 (13,000)");
		adultLbl.setFont(fontB);
		youthLbl = new JLabel("청소년 (10,000)");
		youthLbl.setFont(fontB);
		theater = new JLabel("극장 :");
		theater.setFont(fontB);
		sltTheater = new JLabel(" - ");
		sltTheater.setFont(fontB);
		date = new JLabel("날짜 :");
		date.setFont(fontB);
		sltDate = new JLabel(" - ");
		sltDate.setFont(fontB);
		number = new JLabel("인원 :");
		number.setFont(fontB);
		sltperson = new JLabel(" - ");
		sltperson.setFont(fontB);
		amount = new JLabel("금액 :");
		amount.setFont(fontB);
		sltAmount = new JLabel(" - ");
		sltAmount.setFont(fontB);
		
		// 리스트
		String[] m1 = {"007 노 타임 투 다이", "보이스", "기적", "샹치와 텐 링즈의 전설", "모가디슈", "스틸워터", "캔디맨", "극장판 짱구는 못말려: 격돌! 낙서왕국과 얼추 네 명의 용사들", "인질", "극장판 포켓몬스터: 정글의 아이, 코코"};
//		DefaultListModel<String> m1 = new DefaultListModel<String>();
//		m1.addElement("007 노 타임 투 다이");
//		m1.addElement("보이스");
//		m1.addElement("기적");
//		m1.addElement("샹치와 텐 링즈의 전설");
//		m1.addElement("모가디슈");
//		m1.addElement("스틸워터");
//		m1.addElement("캔디맨");
//		m1.addElement("극장판 짱구는 못말려: 격돌! 낙서왕국과 얼추 네 명의 용사들");
//		m1.addElement("인질");
//		m1.addElement("극장판 포켓몬스터: 정글의 아이, 코코");
//		m1.addElement("해리 포터와 마법사의 돌");
//		m1.addElement("말리그넌트");
//		m1.addElement("미드나이트");
//		m1.addElement("코끼리와 나비");
//		m1.addElement("아-하: 테이크 온 미");
//		m1.addElement("잔나비 판타스틱 올드패션드 리턴즈! x 넌센스 Ⅱ");
		movieList = new JList(m1);
		
		
		DefaultListModel<String>  m2= new DefaultListModel<String>();
		m2.addElement("CGV 청주(서문)");
		m2.addElement("CGV 청주 성안길");
		m2.addElement("롯데 시네마 서청주 (아울렛)");
		m2.addElement("CGV 청주터미널");
		m2.addElement("CGV 청주지웰시티");
		m2.addElement("메가박스 청주사창");
		m2.addElement("CGV 청주율량");
		theaterList = new JList(m2);
		
		// 버튼
		reserveBtn = new JButton("예매하기");
		reserveBtn.setFont(font);
		exitBtn = new JButton("종료");
		exitBtn.setFont(font);
		
		// 라디오 버튼
		timeRb1 = new JRadioButton("9:00~10:30");
		timeRb2 = new JRadioButton("12:00~13:30");
		timeRb3 = new JRadioButton("15:00~16:30");
		timeRb4 = new JRadioButton("18:00~19:30");
		timeRb5 = new JRadioButton("21:00~22:30");
		ButtonGroup group = new ButtonGroup();
		group.add(timeRb1);
		group.add(timeRb2);
		group.add(timeRb3);
		group.add(timeRb4);
		group.add(timeRb5);
		adult1 = new JRadioButton("1명");
		adult2 = new JRadioButton("2명");
		adult3 = new JRadioButton("3명");
		adult4 = new JRadioButton("4명");
		adult5 = new JRadioButton("5명");
		youth1 = new JRadioButton("1명");
		youth2 = new JRadioButton("2명");
		youth3 = new JRadioButton("3명");
		youth4 = new JRadioButton("4명");
		youth5 = new JRadioButton("5명");
		ButtonGroup adult = new ButtonGroup();
		adult.add(adult1);
		adult.add(adult2);
		adult.add(adult3);
		adult.add(adult4);
		adult.add(adult5);
		ButtonGroup youth = new ButtonGroup();
		youth.add(youth1);
		youth.add(youth2);
		youth.add(youth3);
		youth.add(youth4);
		youth.add(youth5);
		
		JDatePickerImpl calendar = new JDatePicker().datePicker;
		
		
		// 위치 설정
		customerNmLbl.setBounds(720, 10, 100, 30);
		movieSltLbl.setBounds(30, 50, 100, 30);
		theaterSltLbl.setBounds(230, 50, 100, 30);
		dateSltLbl.setBounds(430, 50, 100, 30);
		movieList.setBounds(30, 80, 180, 250);
		theaterList.setBounds(230, 80, 180, 250);
		timeSltLbl.setBounds(30, 350, 100, 30);
		timeRb1.setBounds(40, 400, 100, 30);
		timeRb2.setBounds(140, 400, 100, 30);
		timeRb3.setBounds(240, 400, 100, 30);
		timeRb4.setBounds(40, 450, 100, 30);
		timeRb5.setBounds(140, 450, 100, 30);
		personSltLbl.setBounds(380, 350, 100, 30);
		adultLbl.setBounds(380, 380, 100, 30);
		adult1.setBounds(380, 400, 50, 30);
		adult2.setBounds(430, 400, 50, 30);
		adult3.setBounds(480, 400, 50, 30);
		adult4.setBounds(530, 400, 50, 30);
		adult5.setBounds(580, 400, 50, 30);
		youthLbl.setBounds(380, 450, 100, 30);
		youth1.setBounds(380, 470, 50, 30);
		youth2.setBounds(430, 470, 50, 30);
		youth3.setBounds(480, 470, 50, 30);
		youth4.setBounds(530, 470, 50, 30);
		youth5.setBounds(580, 470, 50, 30);
		theater.setBounds(650, 380, 100, 30);
		sltTheater.setBounds(750, 380, 100, 30);
		date.setBounds(650, 410, 100, 30);
		sltDate.setBounds(750, 410, 100, 30);
		number.setBounds(650, 450, 100, 30);
		sltperson.setBounds(750, 450, 100, 30);
		amount.setBounds(650, 490, 100, 30);
		sltAmount.setBounds(750, 490, 100, 30);
		iconLbl.setBounds(580, 70, 230, 280);
		reserveBtn.setBounds(610, 520, 100, 30);
		exitBtn.setBounds(710, 520, 100, 30);
		calendar.setBounds(420, 80, 150, 50);
		
		
		// 추가
		add(customerNmLbl);
		add(movieSltLbl);
		add(theaterSltLbl);
		add(dateSltLbl);
		add(movieList);
		add(theaterList);
		add(timeSltLbl);
		add(personSltLbl);
		add(timeRb1);
		add(timeRb2);
		add(timeRb3);
		add(timeRb4);
		add(timeRb5);
		add(personSltLbl);
		add(adultLbl);
		add(adult1);
		add(adult2);
		add(adult3);
		add(adult4);
		add(adult5);
		add(youthLbl);
		add(youth1);
		add(youth2);
		add(youth3);
		add(youth4);
		add(youth5);
		add(theater);
		add(sltTheater);
		add(date);
		add(sltDate);
		add(number);
		add(sltperson);
		add(amount);
		add(sltAmount);
		add(iconLbl);
		add(exitBtn);
		add(reserveBtn);
		add(calendar);
		
		
		setVisible(true);
		
		
//		System.out.println(calendar.getModel().getDay());
		
		
		reserveBtn.setEnabled(false); 
		
		
		//
		exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		movieList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int a = movieList.getSelectedIndex();
				ticketVO.setMovieNm(m1[a]);
				System.out.println(ticketVO.getMovieNm());
			}
		});
		
		theaterList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				theatherNm = (String) theaterList.getSelectedValuesList().get(0);
				System.out.println(theatherNm);
				ticketVO.setTheatherNm(theatherNm);
			}
		});
		
		
		timeRb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(timeRb1.isSelected()) {
					time = "09:00 ~ 10:30";
					ticketVO.setTime(time);
					System.out.println(ticketVO.getTime());
				}
			}
		});
		
		
		reserveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TicketConfirmView(ticketVO);
				dispose();
			}
		});
	}
	
	public void check() {
		if (ticketVO.getPerson() != null && ticketVO.getCustomerID() != null && ticketVO.getCustomerNm() != null && ticketVO.getDay() != null && ticketVO.getMovieNm() != null && ticketVO.getReserveDate() != null && ticketVO.getTheatherNm() != null && ticketVO.getTime() != null) {
			reserveBtn.setEnabled(true);
		} else reserveBtn.setEnabled(false);
	}
	
}