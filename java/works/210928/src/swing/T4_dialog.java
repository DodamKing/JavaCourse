package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class T4_dialog extends JFrame {
	JPanel pn1, pn2;
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel lblMsg, lblMsg2;
	
	public static void main(String[] args) {
		new T4_dialog();
	}
	
	public T4_dialog() {
		super("다이얼로그 박스");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 1));
		
		pn1 = new JPanel();
		btn1 = new JButton("경고");
		btn2 = new JButton("입력");
		btn3 = new JButton("종료");
		btn4 = new JButton("계속?");
		btn5 = new JButton();
		
		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		pn1.add(btn4);
		pn1.add(btn5);
		
		
		
		pn2 = new JPanel();
		lblMsg = new JLabel("메시지 창!", JLabel.CENTER);
		lblMsg2 = new JLabel("", JLabel.CENTER);
		
		pn2.add(lblMsg);
		pn2.add(lblMsg2);
		
		add(pn1);
		add(pn2);
		
		
		
		
		
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("경고 경고!!!");
				JOptionPane.showMessageDialog(null, "경고 주의 하세요!");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("이름이 필요합니다.");
//				JOptionPane.showMessageDialog(null, "성명을 입력하세요. ", "입력창", JOptionPane.WARNING_MESSAGE, null);
				String res = JOptionPane.showInputDialog(null, "이름을 알려 주세요.", "입력창", JOptionPane.INFORMATION_MESSAGE);
				lblMsg2.setText("당신의 이름은: " + res);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("계속 하시겠습니까?");
				int ans = JOptionPane.showConfirmDialog(null, "게속하시겠습니까?", "선택창", JOptionPane.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT); //창, 메세지, 창제목, 아이콘
				if (ans == 0) { 
					lblMsg2.setText("계속 진행 하시는 군요.");
				}

				else if (ans == 1) {
					lblMsg2.setText("계속 진행 하시지 않는 군요.");
				}
				
				else {
					lblMsg2.setText("취소 하셨네요.");
				}
				
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}
}
