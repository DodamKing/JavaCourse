package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import VO.CustomerVO;

public class TicketingView extends JFrame {
	private JLabel customerNmLbl, movieSltLbl, theaterSltLbl, dateSltLbl, timeSltLbl, charSltLbl;
	private JList movieList, theaterList;
	private JButton reserveBtn, exitBtn;
	
	CustomerVO vo;
	
	public TicketingView(CustomerVO vo) {
		super("티켓 예매");
		this.vo = vo;
		build();
	}

	private void build() {
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		// 이곳도 디비 작업 할 수 있으면 더 좋을 듯
		// 라벨
		customerNmLbl = new JLabel(vo.getName() + "고객님");
		customerNmLbl.setFont(font);
		movieSltLbl = new JLabel("영화 선택");
		movieSltLbl.setFont(font);
		theaterSltLbl = new JLabel("극장 선택");
		theaterSltLbl.setFont(font);
		dateSltLbl = new JLabel("날짜 선택");
		dateSltLbl.setFont(font);
		
		// 리스트
		DefaultListModel<String> m1 = new DefaultListModel<String>();
		m1.addElement("007 노 타임 투 다이");
		movieList = new JList(m1);
		
		DefaultListModel<String>  m2= new DefaultListModel<String>();
		m2.addElement("CGV 청주(서문)");
		m2.addElement("CGV 청주 성안길");
		m2.addElement("롯데 시네마 서청주 (아울렛)");
		theaterList = new JList(m2);
		
		// 버튼
		reserveBtn = new JButton("예매하기");
		reserveBtn.setFont(font);
		exitBtn = new JButton("종료");
		exitBtn.setFont(font);
		
		
		// 위치 설정
		customerNmLbl.setBounds(590, 10, 100, 30);
		movieSltLbl.setBounds(30, 50, 100, 30);
		theaterSltLbl.setBounds(230, 50, 100, 30);
		dateSltLbl.setBounds(430, 50, 100, 30);
		movieList.setBounds(30, 80, 180, 250);
		theaterList.setBounds(230, 80, 180, 250);
		
		
		reserveBtn.setBounds(450, 400, 100, 30);
		exitBtn.setBounds(550, 400, 100, 30);
		
		
		// 추가
		add(customerNmLbl);
		add(movieSltLbl);
		add(theaterSltLbl);
		add(dateSltLbl);
		add(movieList);
		add(theaterList);

		add(exitBtn);
		add(reserveBtn);
		
		
		setVisible(true);
		
		reserveBtn.setEnabled(false); // 다 입력 받으면 활성화 시키려함
		
		
		// 키 연결
		exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		reserveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	
	
}