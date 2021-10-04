package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import DAO.TicketDAO;
import VO.CustomerVO;
import VO.TicketVO;
import javax.swing.SwingConstants;

public class TicketConfirmView extends JFrame {
	String mid; 
	int idt;
	JLabel titleLbl1, titleLbl2;
	JButton confirmBtn, cancelBtn, moreBtn;
	CustomerVO customerVO = new CustomerVO();
	TicketVO ticketVO = new TicketVO();
	TicketDAO ticketDAO = new TicketDAO();
	
	public TicketConfirmView(String mid, int idt) {
		super("예매 완료");
		this.mid = mid;
		this.idt = idt;
		build();
	}

	private void build() {
		setSize(1000, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl1 = new JLabel(ticketDAO.getName(idt) + "님 감사합니다.", JLabel.CENTER);
		titleLbl1.setFont(new Font("휴먼엑스포", 1, 30));
		confirmBtn = new JButton("예매확인");
		confirmBtn.setFont(new Font("Dialog", Font.BOLD, 23));
		moreBtn = new JButton("예매더하기");
		moreBtn.setFont(new Font("Dialog", Font.BOLD, 23));
		cancelBtn = new JButton("종료");
		cancelBtn.setFont(new Font("Dialog", Font.BOLD, 23));
		
		titleLbl1.setBounds(100, 10, 800, 58);
		confirmBtn.setBounds(100, 220, 200, 200);
		moreBtn.setBounds(400, 220, 200, 200);
		cancelBtn.setBounds(700, 220, 200, 200);
		
		getContentPane().add(titleLbl1);
//		add(titleLbl2);
		getContentPane().add(confirmBtn);
		getContentPane().add(cancelBtn);
		getContentPane().add(moreBtn);
		
		JLabel titleLbl1_1 = new JLabel(ticketDAO.getMovieNm(idt), SwingConstants.CENTER);
		titleLbl1_1.setFont(new Font("Dialog", Font.BOLD, 30));
		titleLbl1_1.setBounds(100, 78, 800, 58);
		getContentPane().add(titleLbl1_1);
		
		JLabel titleLbl1_2 = new JLabel("예매가 정상적으로 이루어 졌습니다.", SwingConstants.CENTER);
		titleLbl1_2.setFont(new Font("Dialog", Font.BOLD, 30));
		titleLbl1_2.setBounds(100, 146, 800, 58);
		getContentPane().add(titleLbl1_2);
		
		setVisible(true);
		
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new HistoryView(mid);
				dispose();
			}
		});
		
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "정말 종료 하시겠습니까?", "imformation", JOptionPane.OK_CANCEL_OPTION) == 0) {
					System.exit(0);
				}
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