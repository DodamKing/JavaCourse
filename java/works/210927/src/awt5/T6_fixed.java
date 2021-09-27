package awt5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T6_fixed  extends Frame implements WindowListener, ActionListener, KeyListener{
	Panel pn1, pn2, pn2_1, pn2_2, pn3;
	Label lblTitle, lblID, lblPwd;
	TextField txtID, txtPwd;
	Button btnLogin, btnReset;
	
	public static void main(String[] args) {
		new T6_fixed();
	}
	
	public T6_fixed() {
		super("사용자 지정 패털");
		setBounds(800,400,300,300);
		setLayout(null);
		
		int x = 80, y = 50;
		lblTitle = new Label("로그인");
		lblTitle.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblID = new Label("아이디");
		lblPwd = new Label("비밀번호");
		txtID = new TextField(15);
		txtPwd = new TextField(15);
		txtPwd.setEchoChar('*');
		btnLogin = new Button("로그인");
		btnReset = new Button("취소");
		
		lblTitle.setBounds(x, y, 250, 30);
		lblID.setBounds(x, y+50, 100, 30);
		txtID.setBounds(x+100, y+50, 100, 30);
		lblPwd.setBounds(x, y+100, 100, 30);
		txtPwd.setBounds(x+100, y+100, 100, 30);
		btnLogin.setBounds(x, y+150, 100, 30);
		btnReset.setBounds(x+110, y+150, 100, 30);
		
		add(lblTitle);
		add(lblID);
		add(txtID);
		add(txtPwd);
		add(lblPwd);
		add(btnLogin);
		add(btnReset);
		
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
