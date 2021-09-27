package awt5;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T2_Grid2 extends Frame implements WindowListener, ActionListener, KeyListener {
	Panel pn1, pn2, pn3;
	Label lbl1, lbl2, lbl3;
	Button btn1, btn2, btn3;
	
	public static void main(String[] args) {
		new T2_Grid2();
	}
	
	public T2_Grid2() {
		super ("그리드 패널");
		setSize(300,910);
		setLayout(new GridLayout(3, 1));
		
		pn1 = new Panel();
		pn2 = new Panel();
		pn3 = new Panel();
		add(pn1); add(pn2); add(pn3);
		
		lbl1 = new Label("1번 패널!");
		lbl2 = new Label("2번 패널!");
		lbl3 = new Label("3번 패널!");
		
		btn1 = new Button("1번 버튼");
		btn2 = new Button("2번 버튼");
		btn3 = new Button("3번 버튼");
		
		pn1.add(lbl1); pn2.add(lbl2); pn3.add(lbl3);
		pn1.add(btn1); pn2.add(btn2); pn3.add(btn3);
//		add(pn1); add(pn2); add(pn3);
		
		
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
	public void actionPerformed(ActionEvent e) {
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
}
