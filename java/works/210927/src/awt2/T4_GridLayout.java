package awt2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T4_GridLayout extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5, btn6;
	Label lbl1, lbl2, lbl3, lbl4, lbl5;
	
	public static void main(String[] args) {
		new T4_GridLayout();
	}
		
	public T4_GridLayout() {
		super("그리드");
		setSize(400, 400);
		setLayout(new GridLayout(2, 3));
		
		btn1 = new Button("1번");
		btn2 = new Button("2번");
		btn3 = new Button("3번");
		btn4 = new Button("4번");
		btn5 = new Button("5번");
		btn6 = new Button("종료");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setVisible(true);
		btn6.addActionListener(this);
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);;
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
