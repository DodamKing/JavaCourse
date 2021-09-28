package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class T7_cardImage extends JFrame {
	JPanel pn1, pn2;
	JButton btn1, btn2, btn3, btn4 , btn5;
	
	public static void main(String[] args) {
		new T7_cardImage();
	}
	
	public T7_cardImage() {
		super("카드 레이아웃");
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CardLayout cardLayout = new CardLayout();
		setLayout(cardLayout);
		
		btn1 = new JButton("봄");
		btn1.setIcon(new ImageIcon("D:/JavaCourse/java/works/210928/source/images/1.jpg"));
		btn1.setIcon(new ImageIcon("./img/1.png"));
		btn1.setBackground(Color.green);
		btn2 = new JButton("여름");
		btn2.setIcon(new ImageIcon("D:/JavaCourse/java/works/210928/source/images/2.jpg"));
		btn2.setIcon(new ImageIcon("img/2.png"));
		btn2.setBackground(Color.blue);
		btn3 = new JButton("가을");
		btn3.setIcon(new ImageIcon("D:/JavaCourse/java/works/210928/source/images/3.jpg"));
		btn3.setIcon(new ImageIcon("img/3.png"));
		btn3.setBackground(Color.red);
		btn4 = new JButton("겨울");
		btn4.setIcon(new ImageIcon("D:/JavaCourse/java/works/210928/source/images/4.jpg"));
		btn4.setIcon(new ImageIcon("img/4.png"));
		btn4.setBackground(Color.gray);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(getContentPane());
			}
		});

		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(getContentPane());
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(getContentPane());
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(getContentPane());
			}
		});
		
		
		
	}
}
