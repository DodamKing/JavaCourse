package awt2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T1_FlowLayout extends Frame implements WindowListener, ActionListener {
	public static void main(String[] args) {
		new T1_FlowLayout();
	}
	
	public T1_FlowLayout() {
		super("프레임 테스트5");
		
		setLayout(new FlowLayout());
		setBounds(900, 250, 400, 400);
		
		Label lbl1 =  new Label("라벨 테스트");
		this.add(lbl1);
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("종료");
		this.add(btn1);
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
