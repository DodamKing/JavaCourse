package event;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class T5_array extends JFrame implements ActionListener {
	JPanel pn;
	JLabel lblMsg;
	ButtonGroup btnGrp;
	JRadioButton[] radio = new JRadioButton[6];
	String[] title = {"1층", "2층", "3층", "4층", "5층", "종료"};
	JButton btnT;
	
	public static void main(String[] args) {
		new T5_array();
	}
	
	public T5_array() {
		super("배열");
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 1));
		
		pn = new JPanel();
		btnGrp = new ButtonGroup();
		
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(title[i]);
			btnGrp.add(radio[i]);
			pn.add(radio[i]);
		}
		
		lblMsg = new JLabel("메시지", JLabel.CENTER);
		
		add(pn);
		add(lblMsg);
		
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		for (int i = 0; i < radio.length - 1; i++) {
			if(name.equals(radio[i].getText())) {
				lblMsg.setText((i + 1) + "층이 선택 됨");
			}
		}
		if (name.equals(radio[5].getText())) System.exit(0);
	}
}
