package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import DAO.TicketDAO;
import VO.CustomerVO;
import VO.TicketVO;
import javax.swing.SwingConstants;

public class TicketConfirmView2 extends JFrame {
	String mid;
	JLabel titleLbl1, titleLbl2;
	JButton cancelBtn, moreBtn;
	CustomerVO customerVO = new CustomerVO();
	TicketVO ticketVO = new TicketVO();
	TicketDAO ticketDAO = new TicketDAO();
	private JLabel lblNewLabel;
	
	public TicketConfirmView2(String mid) {
		super("예매 완료");
		setTitle("예매 내역");
		this.mid = mid;
		build();
	}

	private void build() {
		setSize(1000, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl1 = new JLabel("null님 예매 내역", SwingConstants.LEFT);
		titleLbl1.setFont(new Font("휴먼엑스포", 1, 30));
		moreBtn = new JButton("예매");
		moreBtn.setFont(new Font("휴먼엑스포", 1, 25));
		cancelBtn = new JButton("종료");
		cancelBtn.setFont(new Font("휴먼엑스포", 1, 25));
		
		titleLbl1.setBounds(34, 24, 368, 52);
		moreBtn.setBounds(34, 387, 110, 52);
		cancelBtn.setBounds(823, 387, 101, 52);
		
		getContentPane().add(titleLbl1);
		getContentPane().add(cancelBtn);
		getContentPane().add(moreBtn);
		
		lblNewLabel = new JLabel("0건 검색");
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(814, 36, 110, 38);
		getContentPane().add(lblNewLabel);
		
		setVisible(true);
		
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		moreBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TicketingView(mid);
				dispose();
			}
		});
	}
}