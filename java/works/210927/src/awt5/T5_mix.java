package awt5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T5_mix extends Frame implements WindowListener, ActionListener, KeyListener {
	Panel pn1, pn2, pn2_1, pn2_2, pn3;
	Label lblTitle, lblID, lblPwd;
	TextField txtID, txtPwd;
	Button btnLogin, btnReset;
	
	public static void main(String[] args) {
		new T5_mix();
	}
	
	public T5_mix() {
		super("배치 연습");
		setBounds(800, 300, 500, 500);
		setLayout(new BorderLayout());
		
		pn1 = new Panel();
		lblTitle = new Label("로그인");
		lblTitle.setFont(new Font("hana", Font.BOLD, 20));
		pn1.add(lblTitle);
		
		pn2 = new Panel();
		pn2.setLayout(new GridLayout(2, 1));
		
		pn2_1 = new Panel();
		pn2_1.setLayout(new GridLayout(1, 2));
		lblID = new Label("아이디");
		lblID.setAlignment(Label.CENTER);
		txtID = new TextField();
		pn2_1.add(lblID);
		pn2_1.add(txtID);
		
		pn2_2 = new Panel();
		pn2_2.setLayout(new GridLayout(1, 2));
		lblPwd = new Label("패스워드");
		lblPwd.setAlignment(Label.CENTER);
		txtPwd = new TextField();
		pn2_1.add(lblPwd);
		pn2_1.add(txtPwd);
		pn2_2 = new Panel();
		
		pn2.add(pn2_1);
		pn2.add(pn2_2);
		
		pn3 = new Panel();
		pn3.setLayout(new GridLayout());
		btnLogin = new Button("로그인");
		btnReset = new Button("취소");
		pn3.add(btnLogin);
		pn3.add(btnReset);
		
		
		
		add(pn1, BorderLayout.NORTH);
		add(pn2, BorderLayout.CENTER);
		add(pn3, BorderLayout.SOUTH);
		
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
