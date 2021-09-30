package hoewon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class HoewonInput extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtAddress;
	HoewonVO vo = new HoewonVO();
	HoewonDAO dao = new HoewonDAO();
	
	public HoewonInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입폼");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(59, 21, 353, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("성 명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(34, 116, 124, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("나 이");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(34, 179, 124, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("주 소");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(34, 246, 124, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 16));
		txtName.setBounds(188, 115, 239, 36);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.BOLD, 16));
		txtAge.setColumns(10);
		txtAge.setBounds(188, 185, 239, 36);
		contentPane.add(txtAge);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("굴림", Font.BOLD, 16));
		txtAddress.setColumns(10);
		txtAddress.setBounds(188, 252, 239, 36);
		contentPane.add(txtAddress);
		
		JButton btnInput = new JButton("가입하기");
		btnInput.setFont(new Font("굴림", Font.BOLD, 16));
		btnInput.setBounds(28, 336, 124, 36);
		contentPane.add(btnInput);
		
		JButton btnReset = new JButton("취  소");
		btnReset.setFont(new Font("굴림", Font.BOLD, 16));
		btnReset.setBounds(180, 336, 124, 36);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("종  료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 16));
		btnExit.setBounds(332, 336, 124, 36);
		contentPane.add(btnExit);
		
		setVisible(true);
		
		
		/* ----------------------------------------------- */
		
		
		// 회원가입
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String age = txtAge.getText();
				String address = txtAddress.getText();
				
				if (name.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명을 입력하세요", "안내", JOptionPane.INFORMATION_MESSAGE);
					txtName.requestFocus();
				}
				
				else if (age.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "나이를 입력하세요", "안내", JOptionPane.INFORMATION_MESSAGE);
					txtAge.requestFocus();
				}

				else if (address.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "주소를 입력하세요", "안내", JOptionPane.INFORMATION_MESSAGE);
					txtAddress.requestFocus();
				}
				
				else {
					vo.setName(txtName.getText());
					vo.setAge(Integer.parseInt(txtAge.getText()));
					vo.setAddress(txtAddress.getText());
					
					dao.hoewonInput(vo);
					JOptionPane.showMessageDialog(null, "회원 가입이 완료 되었습니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
					txtName.setText("");
					txtAge.setText("");
					txtAddress.setText("");
				}
				
			}
		});
		
		// 가입취소
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new HoewonInput();
	}
}