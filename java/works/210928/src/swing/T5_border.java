package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class T5_border extends JFrame {
	JPanel pn1, pn2;
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel lblMsg1, lblMsg2;
	
	public static void main(String[] args) {
		new T5_border();
	}
	
	public T5_border() {
		super("보더레이아웃");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		btn1 = new JButton("동");
		btn2 = new JButton("서");
		btn3 = new JButton("남");
		btn4 = new JButton("북");
		btn5 = new JButton("중앙(종료)");
		
		pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.add(btn5);
		btn5.setBounds(90, 140, 100, 30);
		
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.NORTH);
		add(pn1, BorderLayout.CENTER);
		
		setVisible(true);
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
