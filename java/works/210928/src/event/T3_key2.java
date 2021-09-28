package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class T3_key2 extends JFrame {
	JLabel lblMsg, lblMsg2;
	Container cont;
	
	public static void main(String[] args) {
		new T3_key2();
	}
	
	public T3_key2() {
		super("키값!! 중요해");
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		cont = getContentPane();
		
		lblMsg = new JLabel("엔터를 누르면 배경색이 변경", 0);
		lblMsg2 = new JLabel("선택한 키는: ", 0);
		lblMsg2.setFont(new Font("궁서", Font.BOLD, 16));
		
		cont.add(lblMsg, BorderLayout.CENTER);
		cont.add(lblMsg2, BorderLayout.SOUTH);
		
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				if (e.getKeyCode() == e.VK_ENTER) {
					cont.setBackground(new Color(r, g, b));
				}
				else {
					lblMsg2.setText("선택한 키는: " + e.getKeyText(e.getKeyCode())); // 키 코드는 숫자 받아서 텍스트로 받으면 바뀌나봄
					lblMsg2.setHorizontalAlignment(JLabel.CENTER);
				}
			}
		});
	}
	
}
