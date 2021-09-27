package awt1;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test5 extends Frame implements WindowListener, ActionListener {
	public static void main(String[] args) {
		new Test5();
	}
	
	public Test5() {
		super("프레임 테스트5");
		setBounds(900, 250, 400, 400);
		Label lbl1 =  new Label("라벨 테스트");
		this.add(lbl1);
		
		Button btnExit = new Button("종료");
		this.add(btnExit);
		
		
		setVisible(true);
		
		addWindowListener(this);
		btnExit.addActionListener(this);
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
