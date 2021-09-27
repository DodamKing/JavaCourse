package awt6;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T3_adapter extends Frame{
	Button btnStop, btnExit;
	
	public static void main(String[] args) {
		new T3_adapter();
	}
	
	public T3_adapter() {
		super("어댑터 활용");
		setBounds(1000, 300, 300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		btnStop = new Button("재생");
		add(btnStop);
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
		
		btnStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Button btnText = (Button) e.getSource();
				if (btnText.getLabel().equals("재생")) {
					btnText.setLabel("정지");
				}
				else if (btnText.getLabel().equals("정지")) {
					btnText.setLabel("재생");
				}
			}
		});
	}
	
}
