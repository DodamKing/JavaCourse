package awt6;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T2_adapter extends Frame{
	Button btnExit;
	
	public static void main(String[] args) {
		new T2_adapter();
	}
	
	public T2_adapter() {
		super("어댑터 활용");
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		btnExit = new Button("종료");
		add(btnExit);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
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
