package awt4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T1_Button extends Frame implements WindowListener, KeyListener, ActionListener {
	Button btnPlay, btnStop, btnExit;
	
	public static void main(String[] args) {
		new T1_Button();
	}
	
	public T1_Button() {
		super("버튼 테스트");
		setBounds(900, 400, 400, 400);
		setLayout(new FlowLayout());
		
		btnPlay = new Button("시작");
		btnStop = new Button("멈춤");
		btnExit = new Button("종료");
		
		add(btnPlay); add(btnStop); add(btnExit);
		
		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		btnExit.addActionListener(this);
		
		setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
		Button btnText = (Button) e.getSource();
		if (btnText.getLabel().equals("시작")) {
			System.out.println("시작버튼");
		}

		if (btnText.getLabel().equals("멈춤")) {
			System.out.println("멈춤버튼");
		}

		if (btnText.getLabel().equals("종료")) {
			System.exit(0);
		}
	}
}
