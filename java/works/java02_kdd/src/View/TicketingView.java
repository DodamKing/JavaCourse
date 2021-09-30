package View;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDateTime;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DAO.TicketDAO;
import VO.CustomerVO;
import VO.TicketVO;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

public class TicketingView extends JFrame {
	private String customerNm, customerID, theatherNm, movieNm, day, time, reserveDate, imgSlt, imgUrl;
	int aPerson, yPerson, person = 0, cost = 0;
	private JLabel customerNmLbl, movieSltLbl, theaterSltLbl, dateSltLbl, timeSltLbl, personSltLbl, adultLbl, youthLbl;
	private JLabel iconLbl, theater, sltTheater, date, sltDate, number, sltPerson, amount, sltAmount;
	private JList movieList, theaterList;
	private JButton reserveBtn, exitBtn;
	private JRadioButton timeRb1, timeRb2, timeRb3, timeRb4, timeRb5;
	private JRadioButton adult1, adult2, adult3, adult4, adult5;
	private JRadioButton youth1, youth2, youth3, youth4, youth5;
	
	String mid;
	JDatePickerImpl calendar = new JDatePicker().datePicker;
	CustomerVO customerVO = new CustomerVO();
	TicketVO ticketVO = new TicketVO();
	TicketDAO ticketDAO = new TicketDAO();
	private JButton confirmBtn;
	
	
	public TicketingView(String mid) {
		super("티켓 예매");
		this.mid = mid;
		build();
		getDate();
	}

	private void build() {
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		Font fontB = new Font("휴먼엑스포", 1, 13);
		
		// 이미지
		ImageIcon temp_icon = new ImageIcon("img/2.png");
		Image temp_img = temp_icon.getImage();
		Image img = temp_img.getScaledInstance(230, 280, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(img);
		
		iconLbl = new JLabel();
		iconLbl.setIcon(icon);
		
		
		// 이곳도 디비 작업 할 수 있으면 더 좋을 듯
		// 라벨
		customerNmLbl = new JLabel(ticketDAO.getName(mid) + "고객님");
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
		sltPerson = new JLabel(" - ");
		sltPerson.setFont(fontB);
		amount = new JLabel("금액 :");
		amount.setFont(fontB);
		sltAmount = new JLabel(" - ");
		sltAmount.setFont(fontB);
		
		// 리스트
		DefaultListModel<String> m1 = new DefaultListModel<String>(); //영화 리스트 
		m1.addElement("007 노 타임 투 다이");
		m1.addElement("보이스");
		m1.addElement("기적");
		m1.addElement("샹치와 텐 링즈의 전설");
		m1.addElement("모가디슈");
		m1.addElement("스틸워터");
		m1.addElement("캔디맨");
		m1.addElement("극장판 짱구는 못말려: 격돌! 낙서왕국과 얼추 네 명의 용사들");
		m1.addElement("인질");
		m1.addElement("극장판 포켓몬스터: 정글의 아이, 코코");
		m1.addElement("해리 포터와 마법사의 돌");
		m1.addElement("말리그넌트");
		m1.addElement("미드나이트");
		m1.addElement("코끼리와 나비");
		m1.addElement("아-하: 테이크 온 미");
		m1.addElement("잔나비 판타스틱 올드패션드 리턴즈! x 넌센스 Ⅱ");
		movieList = new JList(m1);
		JScrollPane mPn = new JScrollPane(movieList);
		
		DefaultListModel<String>  m2= new DefaultListModel<String>(); // 영화관 리스트
		m2.addElement("CGV 청주(서문)");
		m2.addElement("CGV 청주 성안길");
		m2.addElement("롯데 시네마 서청주 (아울렛)");
		m2.addElement("CGV 청주터미널");
		m2.addElement("CGV 청주지웰시티");
		m2.addElement("메가박스 청주사창");
		m2.addElement("CGV 청주율량");
		theaterList = new JList(m2);
		JScrollPane tPn = new JScrollPane(theaterList);
		
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
		
		
		// 위치 설정
		customerNmLbl.setBounds(770, 10, 100, 30);
		movieSltLbl.setBounds(30, 50, 100, 30);
		theaterSltLbl.setBounds(230, 50, 100, 30);
		dateSltLbl.setBounds(430, 50, 100, 30);
//		movieList.setBounds(30, 80, 180, 250);
		mPn.setBounds(30, 80, 180, 250);
//		theaterList.setBounds(230, 80, 180, 250);
		tPn.setBounds(230, 80, 180, 250);
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
		youthLbl.setBounds(380, 450, 130, 30);
		youth1.setBounds(380, 470, 50, 30);
		youth2.setBounds(430, 470, 50, 30);
		youth3.setBounds(480, 470, 50, 30);
		youth4.setBounds(530, 470, 50, 30);
		youth5.setBounds(580, 470, 50, 30);
		theater.setBounds(650, 370, 50, 30);
		sltTheater.setBounds(700, 370, 180, 30);
		date.setBounds(650, 410, 50, 30);
		sltDate.setBounds(700, 410, 180, 30);
		number.setBounds(650, 450, 50, 30);
		sltPerson.setBounds(700, 450, 180, 30);
		amount.setBounds(650, 490, 50, 30);
		sltAmount.setBounds(700, 490, 180, 30);
		iconLbl.setBounds(640, 70, 230, 280);
		reserveBtn.setBounds(670, 520, 100, 30);
		exitBtn.setBounds(775, 520, 100, 30);
		calendar.setBounds(420, 80, 200, 50);
		
		
		// 추가
		getContentPane().add(customerNmLbl);
		getContentPane().add(movieSltLbl);
		getContentPane().add(theaterSltLbl);
		getContentPane().add(dateSltLbl);
//		add(movieList);
		getContentPane().add(mPn);
//		add(theaterList);
		getContentPane().add(tPn);
		getContentPane().add(timeSltLbl);
		getContentPane().add(personSltLbl);
		getContentPane().add(timeRb1);
		getContentPane().add(timeRb2);
		getContentPane().add(timeRb3);
		getContentPane().add(timeRb4);
		getContentPane().add(timeRb5);
		getContentPane().add(personSltLbl);
		getContentPane().add(adultLbl);
		getContentPane().add(adult1);
		getContentPane().add(adult2);
		getContentPane().add(adult3);
		getContentPane().add(adult4);
		getContentPane().add(adult5);
		getContentPane().add(youthLbl);
		getContentPane().add(youth1);
		getContentPane().add(youth2);
		getContentPane().add(youth3);
		getContentPane().add(youth4);
		getContentPane().add(youth5);
		getContentPane().add(theater);
		getContentPane().add(sltTheater);
		getContentPane().add(date);
		getContentPane().add(sltDate);
		getContentPane().add(number);
		getContentPane().add(sltPerson);
		getContentPane().add(amount);
		getContentPane().add(sltAmount);
		getContentPane().add(iconLbl);
		getContentPane().add(exitBtn);
		getContentPane().add(reserveBtn);
		getContentPane().add(calendar);
		
		setVisible(true);
		
		reserveBtn.setEnabled(false); 
		
		confirmBtn = new JButton("예매확인");
		confirmBtn.setFont(new Font("휴먼엑스포", Font.PLAIN, 13));
		confirmBtn.setBounds(30, 520, 100, 30);
		getContentPane().add(confirmBtn);
		
		
		// 여기서 부터 액션
		exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		movieList.addListSelectionListener(new ListSelectionListener() { // 영화 이름 저장
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				movieNm = movieList.getSelectedValue().toString();
				ticketVO.setMovieNm(movieNm);
				imgSlt = ticketVO.getMovieNm();
				System.out.println(ticketVO.getMovieNm());
				getImg();
				check();
			}
		});
		
		theaterList.addListSelectionListener(new ListSelectionListener() { // 영화관 저장
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				theatherNm = (String) theaterList.getSelectedValuesList().get(0);
				ticketVO.setTheatherNm(theatherNm);
				sltTheater.setText(ticketVO.getTheatherNm());
				check();
			}
		});
		
		
		timeRb1.addItemListener(new ItemListener() { // 라디오버튼 시간 저장
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(timeRb1.isSelected()) {
					time = "09:00 ~ 10:30";
					ticketVO.setTime(time);
					System.out.println(ticketVO.getTime());
				}
				check();
			}
		});
		timeRb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(timeRb2.isSelected()) {
					time = "12:00 ~ 13:30";
					ticketVO.setTime(time);
					System.out.println(ticketVO.getTime());
				}
				check();
			}
		});
		timeRb3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(timeRb3.isSelected()) {
					time = "15:00 ~ 16:30";
					ticketVO.setTime(time);
					System.out.println(ticketVO.getTime());
				}
				check();
			}
		});
		timeRb4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(timeRb4.isSelected()) {
					time = "18:00 ~ 19:30";
					ticketVO.setTime(time);
					System.out.println(ticketVO.getTime());
				}
				check();
			}
		});
		timeRb5.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(timeRb5.isSelected()) {
					time = "21:00 ~ 22:30";
					ticketVO.setTime(time);
					System.out.println(ticketVO.getTime());
				}
				check();
			}
		});
		
		adult1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (adult1.isSelected()) {
					aPerson = 1;
				}
				person();
				amount();
				check();
			}
		});
		adult2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (adult2.isSelected()) {
					aPerson = 2;
				}
				person();
				amount();
				check();
			}
		});
		adult3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (adult3.isSelected()) {
					aPerson = 3;
				}
				person();
				amount();
				check();
			}
			
		});
		adult4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (adult4.isSelected()) {
					aPerson = 4;
				}
				person();
				amount();
				check();
			}
		});
		adult5.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (adult5.isSelected()) {
					aPerson = 5;
				}
				person();
				amount();
				check();
			}
		});
		
		youth1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (youth1.isSelected()) {
					yPerson = 1;
				}
				person();
				amount();
				check();
			}
		});
		youth2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (youth2.isSelected()) {
					yPerson = 2;
				}
				person();
				amount();
				check();
			}
		});
		youth3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (youth3.isSelected()) {
					yPerson = 3;
				}
				person();
				amount();
				check();
			}
		});
		youth4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (youth4.isSelected()) {
					yPerson = 4;
				}
				person();
				amount();
				check();
			}
		});
		youth5.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (youth5.isSelected()) {
					yPerson = 5;
				}
				person();
				amount();
				check();
			}
		});
		
		calendar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getDate();
				check();
			}
		});
		
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "예매확인 창으로 가시겠습니까?", "imfomation", JOptionPane.OK_CANCEL_OPTION) == 0) {
					new HistoryFrame(mid);
					dispose();
				}
			}
		});
		
		reserveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "이대로 예매 하시겠습니가?", "imfomation", JOptionPane.OK_CANCEL_OPTION) == 0) {
					ticketVO.setCustomerNm(ticketDAO.getName(mid));
					ticketVO.setCustomerID(mid);
					ticketVO.setReserveDate(LocalDateTime.now().toString());
					new TicketConfirmView(mid);
					dispose();
					ticketDAO.ticketingSave(ticketVO);
				}
			}
		});
	}
	
	public void getImg() {
		if (imgSlt.equals("007 노 타임 투 다이")) {
			imgUrl = "img/007.jpg";
		}
		else if (imgSlt.equals("보이스")) {
			imgUrl = "img/보이스.jpg";
		}
		else if (imgSlt.equals("기적")) {
			imgUrl = "img/기적.jpg";
		}
		else if (imgSlt.equals("샹치와 텐 링즈의 전설")) {
			imgUrl = "img/샹치와 텐 링즈의 전설.jpg";
		}
		else if (imgSlt.equals("모가디슈")) {
			imgUrl = "img/모가디슈.jpg";
		}
		else if (imgSlt.equals("스틸워터")) {
			imgUrl = "img/스틸워터.png";
		}
		else if (imgSlt.equals("캔디맨")) {
			imgUrl = "img/캔디맨.jpg";
		}
		else if (imgSlt.equals("극장판 짱구는 못말려: 격돌! 낙서왕국과 얼추 네 명의 용사들")) {
			imgUrl = "img/짱구.jpg";
		}
		else if (imgSlt.equals("인질")) {
			imgUrl = "img/인질.jpg";
		}
		else if (imgSlt.equals("극장판 포켓몬스터: 정글의 아이, 코코")) {
			imgUrl = "img/포켓몬.jpg";
		}
		else if (imgSlt.equals("해리 포터와 마법사의 돌")) {
			imgUrl = "img/해리포터.jpg";
		}
		else if (imgSlt.equals("말리그넌트")) {
			imgUrl = "img/말리그넌트.jpg";
		}
		else if (imgSlt.equals("미드나이트")) {
			imgUrl = "img/미드나이트.jpg";
		}
		else imgUrl = "img/2.png"; 
			
		
		ImageIcon temp_icon = new ImageIcon(imgUrl);
		Image temp_img = temp_icon.getImage();
		Image img = temp_img.getScaledInstance(230, 280, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(img);
		
		iconLbl.setIcon(icon);
	}
	
	public void check() {
		if (ticketVO.getPerson() != null && ticketVO.getDay() != null && ticketVO.getMovieNm() != null && ticketVO.getTheatherNm() != null && ticketVO.getTime() != null) {
			reserveBtn.setEnabled(true);
		} else reserveBtn.setEnabled(false);
	}
	
	public void person() {
		person = aPerson + yPerson;
		ticketVO.setPerson(Integer.toString(person));
		if (!ticketVO.getPerson().equals("0")) {
			sltPerson.setText(ticketVO.getPerson());
		}
	}
	
	public void amount() {
		cost = aPerson * 13000 + yPerson * 10000;
		ticketVO.setCost(Integer.toString(cost));
		if (!ticketVO.getCost().equals("0")) {
			sltAmount.setText(ticketVO.getCost());
		}
	}
	
	public void getDate() {
		int yy = calendar.getModel().getYear();
		int mm = calendar.getModel().getMonth();
		int dd = calendar.getModel().getDay();
		day = yy + "년 " + mm + "월 " + dd + "일";
		ticketVO.setDay(day);
		sltDate.setText(ticketVO.getDay());
	}
	
	
	
}