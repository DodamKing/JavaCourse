package View;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.CustomerDAO;
import VO.CustomerVO;

public class RegisterFrame extends JFrame {
	private JLabel titleLbl, nameLbl, idLbl, pwdLbl, emailLbl, phoneLbl;
	private JTextField name, id, email1, email2, phoneNumber;
	private JPasswordField pwd;
	private JButton registerBtn, cancelBtn;
	private JComboBox emailCombo;
	
	
	public RegisterFrame() {
		super("회원가입");
		build();
	}
	
	public void build() {
		setSize(400, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl = new JLabel("회원가입", JLabel.CENTER);
		titleLbl.setFont(new Font("휴먼엑스포", 1, 25));
		nameLbl = new JLabel("이름");
		nameLbl.setFont(font);
		idLbl = new JLabel("아이디");
		idLbl.setFont(font);
		pwdLbl = new JLabel("비밀번호");
		pwdLbl.setFont(font);
		emailLbl = new JLabel("이메일");
		emailLbl.setFont(font);
		phoneLbl = new JLabel("휴대폰 번호");
		phoneLbl.setFont(font);
		
		emailCombo = new JComboBox();
		emailCombo.setFont(font);
		emailCombo.addItem("선택");
		emailCombo.addItem("@naver.com");
		emailCombo.addItem("@gmail.com");
		emailCombo.addItem("@daum.net");
		emailCombo.addItem("@kakao.com");
		emailCombo.addItem("@nate.com");
		emailCombo.addItem("@yahoo.com");
		emailCombo.addItem("직접입력");
		
		
		name = new JTextField();
		id = new JTextField();
		pwd = new JPasswordField();
		email1 = new JTextField();
		email2 = new JTextField();
		phoneNumber = new JTextField();
		
		registerBtn = new JButton("가입");
		registerBtn.setFont(font);
		cancelBtn = new JButton("취소");
		cancelBtn.setFont(font);
		
		
		
		titleLbl.setBounds(80, 30, 200, 50);
		nameLbl.setBounds(30, 100, 150, 30);
		name.setBounds(180, 100, 150, 30);
		idLbl.setBounds(30, 150, 150, 30);
		id.setBounds(180, 150, 150, 30);
		pwdLbl.setBounds(30, 200, 150, 30);
		pwd.setBounds(180, 200, 150, 30);
		emailLbl.setBounds(30, 250, 150, 30);
		email1.setBounds(30, 280, 150, 30);
		email2.setBounds(180, 280, 150, 30);
		emailCombo.setBounds(180, 250, 150, 30);
		phoneLbl.setBounds(30, 330, 150, 30);
		phoneNumber.setBounds(180, 330, 150, 30);
		registerBtn.setBounds(30, 400, 150, 40);
		cancelBtn.setBounds(180, 400, 150, 40);
		
		
		add(titleLbl);
		add(nameLbl);
		add(name);
		add(idLbl);
		add(id);
		add(pwdLbl);
		add(pwd);
		add(emailLbl);
		add(email1);
		add(email2);
		add(emailCombo);
		add(phoneLbl);
		add(phoneNumber);
		add(registerBtn);
		add(cancelBtn);
		
		setVisible(true);
		
		
		emailCombo.addActionListener(new ActionListener() { // 이메일 콤보박스 제어
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (emailCombo.getSelectedItem().equals("선택")){
					JOptionPane.showMessageDialog(null, "이메일을 선택해 주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
				}
				else if (emailCombo.getSelectedItem().equals("@naver.com")){
					email2.setText("@naver.com");
				}
				else if (emailCombo.getSelectedItem().equals("@gmail.com")){
					email2.setText("@gmail.com");
				}
				else if (emailCombo.getSelectedItem().equals("@daum.net")){
					email2.setText("@daum.net");
				}
				else if (emailCombo.getSelectedItem().equals("@kakao.com")){
					email2.setText("@kakao.com");
				}
				else if (emailCombo.getSelectedItem().equals("@nate.com")){
					email2.setText("@nate.com");
				}
				else if (emailCombo.getSelectedItem().equals("@yahoo.com")){
					email2.setText("@yahoo.com");
				}
				else {
					email2.setText("");
				}
			}
		});
		
		
		// 버튼 연결
		cancelBtn.addActionListener(new ActionListener() { //취소
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		registerBtn.addActionListener(new ActionListener() { // 가입
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
					name.requestFocus();
				}
				else if (id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
					id.requestFocus();
				}
				else if (pwd.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
					pwd.requestFocus();
				}
				else if (email1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
					email1.requestFocus();
				}
				else if (email2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 선택해주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
					email2.requestFocus();
				}
				else if (phoneNumber.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "핸드폰 번호를 입력해주세요.", "Input error", JOptionPane.WARNING_MESSAGE);
					phoneNumber.requestFocus();
				}
				
				else {
					CustomerVO vo = new CustomerVO();
					vo.setName(name.getText());
					vo.setCustomerID(id.getText());
					vo.setPassword(pwd.getText());
					vo.setEmail(email1.getText() + email2.getText());
					vo.setPhoneNum(phoneNumber.getText());
					
					CustomerDAO dao = new CustomerDAO();
					int result = dao.register(vo);
					
					if (result == -1) {
						JOptionPane.showMessageDialog(null, "데이터 베이스 오류", "Database error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "회원 가입이 정상 처리 되었습니다.", "가입 성공", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
				}
			}
		});
		
	}
}
