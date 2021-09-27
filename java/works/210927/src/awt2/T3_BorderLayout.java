package awt2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T3_BorderLayout extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5;
	
	public static void main(String[] args) {
		new T3_BorderLayout();
	}
	
	public T3_BorderLayout() {
		super("보더 레이아웃");
		setBounds(900, 200, 400, 400);
		setLayout(new BorderLayout());
		
		btn1 = new Button("북");
		btn2 = new Button("남");
		btn3 = new Button("서");
		btn4 = new Button("동");
		btn5 = new Button("종료");
		
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.CENTER);
		
		setVisible(true);
		btn5.addActionListener(this);
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
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
	
}
