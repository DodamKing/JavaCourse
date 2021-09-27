package awt2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T6_Null extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5;
	Label lbl1, lbl2, lbl3, lbl4, lbl5;
	
	public static void main(String[] args) {
		new T6_Null();
	}
	
	public T6_Null() {
		super("사용자 지정");
		setBounds(300,300,400,400);
		setLayout(null);
		
		int x = 150, y = 100, w = 150, h = 30;
		
		btn1 = new Button("버튼1");
		btn2 = new Button("버튼2");
		btn3 = new Button("버튼3");
		btn4 = new Button("버튼4");
		btn5 = new Button("종료");
		
		btn1.setBounds(x, y, w, h);
		btn2.setBounds(x, y+50, w, h);
		btn3.setBounds(x, y+100, w, h);
		btn4.setBounds(x, y+150, w, h);
		btn5.setBounds(x, y+200, w, h);
		
		lbl1 = new Label("라벨1");
		lbl2 = new Label("라벨2");
		lbl3 = new Label("라벨3");
		lbl4 = new Label("라벨4");
		lbl5 = new Label("죵료");
		
		lbl1.setBounds(20, y, w, h);
		lbl2.setBounds(20, y+50, w, h);
		lbl3.setBounds(20, y+100, w, h);
		lbl4.setBounds(20, y+150, w, h);
		lbl5.setBounds(20, y+200, w, h);
		
		
		add(btn1); add(btn2); add(btn3); add(btn4); add(btn5);
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);
		
		
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
