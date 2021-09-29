package View;

import java.awt.Font;

import javax.swing.JFrame;

import VO.CustomerVO;
import VO.TicketVO;

public class TicketConfirmView extends JFrame {
	TicketVO ticketVO;
	
	public TicketConfirmView(TicketVO ticketVO) {
		super("예매 완료");
		this.ticketVO = ticketVO;
		build();
	}

	private void build() {
		setSize(400, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		
		setVisible(true);
	}
	
	
	
}