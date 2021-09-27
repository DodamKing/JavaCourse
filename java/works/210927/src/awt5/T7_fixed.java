package awt5;

import java.awt.Button;
import java.awt.Color;
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

public class T7_fixed  extends Frame implements WindowListener, ActionListener, KeyListener{
	Panel pn1, pn2, pn2_1, pn2_2, pn3;
	Label lblTitle, lblID, lblPwd, lblMsg;
	TextField txtID, txtPwd;
	Button btnLogin, btnReset, btnExit;
	
	public static void main(String[] args) {
		new T7_fixed();
	}
	
	public T7_fixed() {
		super("사용자 지정 패널");
		setBounds(800,400,460,300);
		setLayout(null);
		
		int x = 80, y = 50;
		lblTitle = new Label("로그인");
		lblTitle.setAlignment(Label.CENTER);
		lblTitle.setBackground(Color.gray);
		lblTitle.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblID = new Label("아이디");
		lblPwd = new Label("비밀번호");
		txtID = new TextField(15);
		txtPwd = new TextField(15);
		txtPwd.setEchoChar('*');
		btnLogin = new Button("로그인");
		btnReset = new Button("취소");
		btnExit = new Button("종료");
		lblMsg = new Label("메시지");
		lblMsg.setAlignment(Label.CENTER);
		lblMsg.setBackground(Color.white);
		lblMsg.setForeground(Color.red);
		lblMsg.setFont(new Font("Hana", Font.BOLD, 15));
		
		lblTitle.setBounds(x, y, 300, 30);
		lblID.setBounds(x, y+50, 100, 30);
		txtID.setBounds(x+100, y+50, 200, 30);
		lblPwd.setBounds(x, y+100, 100, 30);
		txtPwd.setBounds(x+100, y+100, 200, 30);
		btnLogin.setBounds(x, y+150, 100, 30);
		btnReset.setBounds(x+100, y+150, 100, 30);
		btnExit.setBounds(x+200, y+150, 100, 30);
		lblMsg.setBounds(x, y+200, 300, 50);
		
		
		add(lblTitle);
		add(lblID);
		add(txtID);
		add(txtPwd);
		add(lblPwd);
		add(btnLogin);
		add(btnReset);
		add(btnExit);
		add(lblMsg);
		
		setVisible(true);
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
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
		Button btnText = (Button) e.getSource();
		if (btnText.getLabel().equals("로그인")) {
			if (txtID.getText().equals("")) {
				lblMsg.setText("아이디를 입력하세요.");
				txtID.requestFocus();
			}
			else if (txtPwd.getText().equals("")) {
				lblMsg.setText("비밀번호를 입력하세요.");
				txtPwd.requestFocus();
			}
			else {
				if (txtID.getText().equals("admin") && txtPwd.getText().equals("1234")) {
					lblMsg.setText("로그인 되었습니다.");
				}
				else {
					lblMsg.setText("아이디와 비밀번호가 일치 하지 않습니다.");
				}
			}
		}
		if (btnText.getLabel().equals("취소")) {
			txtID.setText("");
			txtPwd.setText("");
		}
		if (btnText.getLabel().equals("종료")) {
			System.exit(0);
		}
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
