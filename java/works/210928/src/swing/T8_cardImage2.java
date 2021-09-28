package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class T8_cardImage2 extends JFrame {
	JPanel pn1, pn2;
	JButton btn1, btn2, btn3, btn4 , btnPre, btnNext, btnStart, btnEnd, btnExit;
	
	public static void main(String[] args) {
		new T8_cardImage2();
	}
	
	public T8_cardImage2() {
		super("카드 레이아웃 디테일");
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		pn1 = new JPanel();
		btnStart = new JButton("처음");
		btnPre = new JButton("이전");
		btnNext = new JButton("다음");
		btnEnd = new JButton("마지막");
		btnExit = new JButton("종료");
		
		pn1.add(btnStart);
		pn1.add(btnPre);
		pn1.add(btnNext);
		pn1.add(btnEnd);
		pn1.add(btnExit);
		
		pn2 = new JPanel();
		CardLayout cardLayout = new CardLayout();
		pn2.setLayout(cardLayout);
		
		btn1 = new JButton();
		btn1.setIcon(new ImageIcon("./img/1.png"));
		btn1.setBackground(Color.green);
		btn2 = new JButton();
		btn2.setIcon(new ImageIcon("img/2.png"));
		btn2.setBackground(Color.blue);
		btn3 = new JButton();
		btn3.setIcon(new ImageIcon("img/3.png"));
		btn3.setBackground(Color.red);
		btn4 = new JButton();
		btn4.setIcon(new ImageIcon("img/4.png"));
		btn4.setBackground(Color.gray);
		
		pn2.add(btn1);
		pn2.add(btn2);
		pn2.add(btn3);
		pn2.add(btn4);
		
		add(pn1, BorderLayout.NORTH);
		add(pn2, BorderLayout.CENTER);
		
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "봄 사진을 선택 하였군요!", "계절 사진", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "여름 사진을 선택 하였군요!", "계절 사진", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "가을 사진을 선택 하였군요!", "계절 사진", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "겨울 사진을 선택 하였군요!", "계절 사진", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.first(pn2);
			}
		});
		
		btnPre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(pn2);
			}
		});
		
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(pn2);
			}
		});
		btnEnd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.last(pn2);
			}
		});
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		
	}
}
