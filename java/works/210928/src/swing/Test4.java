package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test4 extends JFrame {
	JButton btnInput, btnOutput, btnExit;
	
	public static void main(String[] args) {
		new Test4();
	}
	
	public Test4() {
		super("플로우 레이이아웃");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btnInput = new JButton("입력");
		btnOutput = new JButton("출력");
		btnExit = new JButton("종료");
		
		add(btnInput);
		add(btnOutput);
		add(btnExit);
		
		
		setVisible(true);
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
}
	
