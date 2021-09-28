package hoewon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class HoewonMain extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		HoewonMain frame = new HoewonMain();
	}

	public HoewonMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원관리프로그램(v1.0)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setBounds(86, 10, 548, 61);
		contentPane.add(lblNewLabel);
		
		JButton btnInput = new JButton("회원등록");
		
		btnInput.setFont(new Font("굴림", Font.BOLD, 16));
		btnInput.setBounds(18, 393, 156, 46);
		contentPane.add(btnInput);
		
		JButton btnSearch = new JButton("개별조회");
		
		btnSearch.setFont(new Font("굴림", Font.BOLD, 16));
		btnSearch.setBounds(196, 393, 156, 46);
		contentPane.add(btnSearch);
		
		JButton btnList = new JButton("전체조회");
		
		btnList.setFont(new Font("굴림", Font.BOLD, 16));
		btnList.setBounds(374, 393, 156, 46);
		contentPane.add(btnList);
		
		JButton btnExit = new JButton("종  료");
		
		btnExit.setFont(new Font("굴림", Font.BOLD, 16));
		btnExit.setBounds(552, 393, 156, 46);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\JavaCourse\\Java\\works\\0928_WindowBuilder\\images\\1.jpg"));
		lblNewLabel_1.setBounds(22, 79, 686, 293);
		contentPane.add(lblNewLabel_1);
		
		setVisible(true);
		
		/* ------------------------------------------- */
		
		// 회원가입
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HoewonInput();
			}
		});
		
		// 개별조회
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 전체조회
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}