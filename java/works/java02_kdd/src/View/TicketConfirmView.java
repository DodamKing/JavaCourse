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

public class TicketConfirmView extends JFrame {
	String mid;
	JLabel titleLbl1, titleLbl2;
	JButton confirmBtn, cancelBtn, moreBtn;
	CustomerVO customerVO = new CustomerVO();
	TicketVO ticketVO = new TicketVO();
	TicketDAO ticketDAO = new TicketDAO();
	
	public TicketConfirmView(String mid) {
		super("예매 완료");
		this.mid = mid;
		build();
	}

	private void build() {
		setSize(1000, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl1 = new JLabel(ticketDAO.getName(mid) + "고객님 감사합니다.", JLabel.CENTER);
		titleLbl1.setFont(new Font("휴먼엑스포", 1, 30));
//		titleLbl2 = new JLabel("예매가 성공적으로 이루어 졌습니다.", JLabel.CENTER);
//		titleLbl2.setFont(new Font("휴먼엑스포", 1, 30));
		confirmBtn = new JButton("예매확인");
		confirmBtn.setFont(new Font("휴먼엑스포", 1, 25));
		moreBtn = new JButton("예매더하기");
		moreBtn.setFont(new Font("휴먼엑스포", 1, 25));
		cancelBtn = new JButton("종료");
		cancelBtn.setFont(new Font("휴먼엑스포", 1, 25));
		
		titleLbl1.setBounds(110, 10, 800, 100);
//		titleLbl2.setBounds(80, 110, 800, 100);
		confirmBtn.setBounds(100, 220, 200, 200);
		moreBtn.setBounds(400, 220, 200, 200);
		cancelBtn.setBounds(700, 220, 200, 200);
		
		add(titleLbl1);
//		add(titleLbl2);
		add(confirmBtn);
		add(cancelBtn);
		add(moreBtn);
		
		setVisible(true);
		
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new HistoryFrame(mid);
			}
		});
		
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