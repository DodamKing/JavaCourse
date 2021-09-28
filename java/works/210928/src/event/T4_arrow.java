package event;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T4_arrow extends JFrame {
	Container cont;
	JLabel lblMsg;
	JButton btnT;
	
	public static void main(String[] args) {
		new T4_arrow();
	}
	
	public T4_arrow() {
		super("화살표");
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cont = getContentPane();
		cont.requestFocus();
		
		lblMsg = new JLabel("방향키를 누르세요!");
		lblMsg.setFont(new Font("고딕", Font.BOLD, 15));
		lblMsg.setHorizontalAlignment(JLabel.CENTER);
		lblMsg.setVerticalAlignment(JLabel.TOP);
		cont.add(lblMsg);
		
		
		
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
//				System.out.println("너비: " + getWidth());
//				System.out.println("높이: " + getHeight());
				
				if (e.getKeyCode() == e.VK_RIGHT) {
					if (lblMsg.getX() < getWidth() - 300) {
						lblMsg.setLocation(lblMsg.getX() + 10, lblMsg.getY());
					}
				}

				else if (e.getKeyCode() == e.VK_DOWN) {
					if (lblMsg.getY() < getHeight() - 70) {
						lblMsg.setLocation(lblMsg.getX(), lblMsg.getY() + 10);
					}
				}
				
				else if (e.getKeyCode() == e.VK_UP) {
					if (lblMsg.getY() > 0 )
					lblMsg.setLocation(lblMsg.getX(), lblMsg.getY() - 10);
				}
				
				else if (e.getKeyCode() == e.VK_LEFT) {
					if (lblMsg.getX() > -200 ) {
						lblMsg.setLocation(lblMsg.getX() - 10, lblMsg.getY());
					}
				}
				
				
			}
		});
		
	}
}
