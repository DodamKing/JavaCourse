package View;

import java.awt.Font;

import javax.swing.JFrame;

public class TicketConfirmView extends JFrame {
	
	
	public TicketConfirmView() {
		super("티켓 예매");
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