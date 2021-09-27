package awt2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T5_Null extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5;
	
	public static void main(String[] args) {
		new T5_Null();
	}
	
	public T5_Null() {
		super("사용자 지정");
		setBounds(300,300,400,400);
		setLayout(null);
		
		btn1 = new Button("버튼1");
		btn2 = new Button("버튼2");
		btn3 = new Button("버튼3");
		btn4 = new Button("버튼4");
		btn5 = new Button("종료");
		
		btn1.setBounds(150, 100, 150, 30);
		btn2.setBounds(150, 150, 150, 30);
		btn3.setBounds(150, 200, 150, 30);
		btn4.setBounds(150, 250, 150, 30);
		btn5.setBounds(150, 300, 150, 30);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		
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
	
}
