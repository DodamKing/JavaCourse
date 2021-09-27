package homework;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hwk_joinAwt extends Frame {
	String gender;
	
	public Hwk_joinAwt() {
		super("회원가입 창");
		Label lblTitle, lblID, lblPassword, lblAge, lblGender, lblJob, lblMessage;
		TextField txtID, txtPassword, txtAge;
		Button btnSubmit, btnReset, btnExit;
		CheckboxGroup gend;
		Checkbox male, female;
		Choice choJob;
		Font font = new Font("Dialog", 0, 15);
		Font fontB = new Font("Dialog", 1, 15);
		int x = 50, y = 60, w = 100, h = 30;
		Hwk_VO vo = new Hwk_VO();
		Hwk_DAO dao = new Hwk_DAO();
		
		setSize(400, 400);
		setBackground(Color.gray);
		setLayout(null);
		lblTitle = new Label("회원가입");
		lblTitle.setAlignment(Label.CENTER);
		lblTitle.setBackground(Color.lightGray);
		lblTitle.setFont(new Font("Seirf", 0, 20));
		
		lblID = new Label("아이디");
		lblID.setAlignment(Label.CENTER);
		lblID.setBackground(Color.lightGray);
		lblID.setFont(fontB);
		txtID = new TextField();
		txtID.setFont(font);
		
		lblPassword = new Label("패스워드");
		lblPassword.setAlignment(Label.CENTER);
		lblPassword.setBackground(Color.lightGray);
		lblPassword.setFont(fontB);
		txtPassword = new TextField();
		txtPassword.setFont(font);
		txtPassword.setEchoChar('*');
		
		lblAge = new Label("나이");
		lblAge.setAlignment(Label.CENTER);
		lblAge.setBackground(Color.lightGray);
		lblAge.setFont(fontB);
		txtAge = new TextField();
		txtAge.setFont(font);
		
		lblGender = new Label("성별");
		lblGender.setAlignment(Label.CENTER);
		lblGender.setBackground(Color.lightGray);
		lblGender.setFont(fontB);
		gend = new CheckboxGroup();
		male = new Checkbox("남자", gend, false);
		male.setFont(font);
		female = new Checkbox("여자", gend, false);
		female.setFont(font);
		
		lblJob = new Label("직업");
		lblJob.setAlignment(Label.CENTER);
		lblJob.setBackground(Color.lightGray);
		lblJob.setFont(fontB);
		choJob = new Choice();
		choJob.setFont(font);
		choJob.add("선택");
		choJob.add("학생");
		choJob.add("회사원");
		choJob.add("공무원");
		choJob.add("군인");
		choJob.add("의사");
		choJob.add("프로그래머");
		choJob.add("소방관");
		choJob.add("경찰관");
		choJob.add("크리에이터");
		choJob.add("방송인");
		choJob.add("기타");
		
		btnSubmit = new Button("확인");
		btnReset = new Button("리셋");
		btnExit = new Button("종료");
		
		lblMessage = new Label();
		lblMessage.setAlignment(Label.CENTER);
		lblMessage.setFont(fontB);
		lblMessage.setBackground(Color.white);
		lblMessage.setForeground(Color.red);
		
		lblTitle.setBounds(x, y, w*3, h);
		lblID.setBounds(x, y+35, w, h);
		txtID.setBounds(x+100, y+35, w*2, h);
		lblPassword.setBounds(x, y+65, w, h);
		txtPassword.setBounds(x+100, y+65, w*2, h);
		lblAge.setBounds(x, y+95, w, h);
		txtAge.setBounds(x+100, y+95, w*2, h);
		lblGender.setBounds(x, y+125, w, h);
		male.setBounds(x+100, y+125, w, h);
		female.setBounds(x+200, y+125, w, h);
		lblJob.setBounds(x, y+155, w, h);
		choJob.setBounds(x+100, y+155, w*2, h);
		
		btnSubmit.setBounds(x, y+190, w, h);
		btnReset.setBounds(x+100, y+190, w, h);
		btnExit.setBounds(x+200, y+190, w, h);
		
		lblMessage.setBounds(x, y+240, w*3, h);
		
		add(lblTitle);
		add(lblID);
		add(txtID);
		add(lblPassword);
		add(txtPassword);
		add(lblAge);
		add(txtAge);
		add(lblGender);
		add(male);
		add(female);
		add(lblJob);
		add(choJob);
		
		add(btnSubmit);
		add(btnReset);
		add(btnExit);
		
		add(lblMessage);
		
		setVisible(true);
		
		
		male.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				gender = "남자";
			}
		});

		female.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				gender = "여자";
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtID.getText().equals("")) {
					lblMessage.setText("Message: 아이디를 입력하세요.");
					txtID.requestFocus();
				}

				else if (txtPassword.getText().equals("")) {
					lblMessage.setText("Message: 비밀번호를 입력하세요.");
					txtID.requestFocus();
				}
				
				else if (txtAge.getText().equals("")) {
					lblMessage.setText("Message: 나이를 입력하세요.");
					txtID.requestFocus();
				}
				
				else if (!txtAge.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
					lblMessage.setText("Message: 나이는 숫자여야 합니다.");
					txtID.requestFocus();
				}

				else if (gender == null) {
					lblMessage.setText("Message: 성별을 선택하세요.");
				}
				
				else if (choJob.getSelectedItem().equals("선택")) {
					lblMessage.setText("Message: 직업을 선택하세요.");
					txtID.requestFocus();
				}
				
				
				else {
					vo.setUserID(txtID.getText());
					vo.setPassword(txtPassword.getText());
					vo.setAge(Integer.parseInt(txtAge.getText()));
					vo.setGender(gender);
					vo.setJob(choJob.getSelectedItem());
					System.out.println(vo);
					int result = dao.join(vo);
					if (result == -1) {
						lblMessage.setText("Message: 중복된 아이디 입니다.");
					}
					else {
						lblMessage.setText("Message: 회원가입이 완료 되었습니다.");
					}
				}
				
			}
		});
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtID.setText("");
				txtPassword.setText("");
				txtAge.setText("");
				choJob.select("선택");
			}
		});
		
	}
}
