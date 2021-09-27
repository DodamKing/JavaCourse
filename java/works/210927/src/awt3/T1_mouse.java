package awt3;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T1_mouse extends Frame implements WindowListener, MouseListener, ActionListener{

	public static void main(String[] args) {
		new T1_mouse();
	}
	
	public T1_mouse() {
		super("마우스");
		setBounds(300, 200, 400, 400);
		
		setVisible(true);
		
		addWindowListener(this);
		addMouseListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 누를 때");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 놓을 때");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 올려져 있을 때");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 올가가 있지 않을 때");
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
