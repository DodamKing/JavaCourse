package View;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import VO.TicketVO;

public class CancelFrame extends JFrame {
	JLabel titleLbl;
	TicketVO ticketVO = new TicketVO();
	
	public CancelFrame(TicketVO ticketVO) {
		super("예매 내역");
		this.ticketVO = ticketVO;
		build();
	}

	private void build() {
		setSize(700, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl = new JLabel(ticketVO.getCustomerNm() + "님 예매 내역", JLabel.CENTER);
		titleLbl.setFont(new Font("휴먼엑스포", 1, 25));
		
		titleLbl.setBounds(10, 10, 300, 100);
		
		add(titleLbl);
		
		setVisible(true);
	}
	
	
	
}