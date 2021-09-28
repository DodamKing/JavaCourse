package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class T1_toggle extends JFrame {
	JButton btnT;
	
	public static void main(String[] args) {
		new T1_toggle();
	}
	
	public T1_toggle() {
		super("토글토글");
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnT = new JButton("실행");
		add(btnT);
		
		
		
		
		setVisible(true);
		
		
		btnT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				if (btn.getText().equals("실행")) {
					btn.setText("정지");
				}
				else btn.setText("실행");
			}
		});
	}
}
