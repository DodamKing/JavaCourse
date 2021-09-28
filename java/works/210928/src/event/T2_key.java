package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class T2_key extends JFrame {
	JLabel lblMsg;
	
	public static void main(String[] args) {
		new T2_key();
	}
	
	public T2_key() {
		super("키값!! 중요해");
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cont = getContentPane();
		
		lblMsg = new JLabel("키를 누르면 배경색이 변경", 0);
		
		cont.add(lblMsg);
		
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_ENTER) {
					cont.setBackground(Color.cyan);
				}
				if (e.getKeyCode() == e.VK_SPACE) {
					cont.setBackground(Color.black);
				}
				if (e.getKeyCode() == e.VK_DELETE) {
					cont.setBackground(Color.green);
				}
			}
		});
	}
	
}
