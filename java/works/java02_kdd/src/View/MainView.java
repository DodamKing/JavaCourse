package View;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.CustomerDAO;
import VO.CustomerVO;

public class MainView extends JFrame {
	private JTextField idTxt;
	private JPasswordField pwdTxt;
	private JButton loginBtn, registerBtn, findIdBtn, findPwdBtn, exitBtn;
	private JLabel iconLbl, titleLbl;
	CustomerDAO dao = new CustomerDAO();
	
	
	public MainView() {
		super("DD CINEMA");
		buildGUI();
	}
	
	public void buildGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		Font font = new Font("휴먼엑스포", 0, 13);
		
		ImageIcon temp_icon = new ImageIcon("img/2.png");
		Image temp_img = temp_icon.getImage();
		Image img = temp_img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(img);
		
		iconLbl = new JLabel();
		iconLbl.setIcon(icon);
		
		titleLbl = new JLabel("DD CINEMA");
		titleLbl.setFont(new Font("휴먼엑스포", Font.BOLD, 70));
		
		idTxt = new JTextField();		
		pwdTxt = new JPasswordField();
		
		loginBtn = new JButton("로그인");
		loginBtn.setFont(font);
		registerBtn = new JButton("회원가입");
		registerBtn.setFont(font);
		findIdBtn = new JButton("아이디찾기");
		findIdBtn.setFont(font);
		findPwdBtn = new JButton("비밀번호찾기");
		findPwdBtn.setFont(font);
		exitBtn = new JButton("종료");
		exitBtn.setFont(font);
		
		iconLbl.setBounds(30, 0, 200, 200);
		titleLbl.setBounds(200, 50, 541, 100);
		idTxt.setBounds(50, 200, 400, 30);
		pwdTxt.setBounds(50, 240, 400, 30);
		loginBtn.setBounds(480, 200, 150, 70);
		registerBtn.setBounds(100, 300, 120, 30);
		findIdBtn.setBounds(220, 300, 120, 30);
		findPwdBtn.setBounds(340, 300, 120, 30);
		exitBtn.setBounds(460, 300, 120, 30);
		
		getContentPane().add(iconLbl);
		getContentPane().add(titleLbl);
		getContentPane().add(idTxt);
		getContentPane().add(pwdTxt);
		getContentPane().add(loginBtn);
		getContentPane().add(registerBtn);
		getContentPane().add(findIdBtn);
		getContentPane().add(findPwdBtn);
		getContentPane().add(exitBtn);
		
		
		setVisible(true);
		
		
		
		
		// 키 연결
		idTxt.addKeyListener(new KeyAdapter() { 
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_ENTER) {
					prLoginBtn();
				}
			}
		});

		pwdTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_ENTER) {
					prLoginBtn();
				}
			}
		});
		
		
		// 버튼 연결
		exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		registerBtn.addActionListener(new ActionListener() { //회원가입 프레임
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new RegisterFrame();
			}
		});
		
		loginBtn.addActionListener(new ActionListener() { // 로그인
			
			@Override
			public void actionPerformed(ActionEvent e) {
				prLoginBtn();
			}
		});
		
	}
	
	// 로그인 버튼 프레스 메소드
	private void prLoginBtn() {
		if (idTxt.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "아이디를 입력하세요", "input error", JOptionPane.WARNING_MESSAGE);
			idTxt.requestFocus();
		}
		else if (pwdTxt.getText().equals("") ) {
			JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요", "input error", JOptionPane.WARNING_MESSAGE);
			pwdTxt.requestFocus();
		}
		
		else {
			int result = dao.login(idTxt.getText(), pwdTxt.getText());
			if (result == -2) {
				JOptionPane.showMessageDialog(null, "데이터베이스 오류", "DATABASE error", JOptionPane.WARNING_MESSAGE);
			}
			else if (result == -1) {
				JOptionPane.showMessageDialog(null, "등록되지 않은 아이디 입니다.", "ID error", JOptionPane.WARNING_MESSAGE);
			}
			else if (result == 0) {
				JOptionPane.showMessageDialog(null, "비밀번호를 잘못 입력하셨습니다.", "password error", JOptionPane.WARNING_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "로그인에 성공 하였습니다.", "로그인 성공", JOptionPane.INFORMATION_MESSAGE);
				String mid = idTxt.getText();
				idTxt.setText("");
				pwdTxt.setText("");
				dispose();
				new TicketingView(mid);
			}
		}
	}
}
