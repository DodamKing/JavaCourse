package swing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Test3 extends JFrame {
	public static void main(String[] args) {
		new Test3();
	}
	
	public Test3() {
		super("창을 닫자");
		setBounds(200, 200, 300, 300);
		setVisible(true);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}
	
