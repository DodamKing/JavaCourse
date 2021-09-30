package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

import DAO.TicketDAO;
import VO.TicketVO;

public class HistoryFrame extends JFrame {
	String mid;
	private JLabel titleLbl;
	private TicketDAO ticketDAO = new TicketDAO();
	private ArrayList<TicketVO> vos;
	
	public HistoryFrame(String mid) {
		super("예매 내역");
		this.mid = mid;
		build();
	}

	private void build() {
		setSize(700, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl = new JLabel(ticketDAO.getName(mid) + "님 예매 내역", JLabel.CENTER);
		titleLbl.setFont(new Font("휴먼엑스포", 1, 25));
		
		JLabel cntLbl = new JLabel(ticketDAO.countTicket(mid) + "건 검색됨");
		cntLbl.setFont(new Font("휴먼엑스포", Font.BOLD, 15));
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		vos = ticketDAO.show(mid);
		for (int i=0; i<vos.size(); i++) {
			textArea.append((i+1) + " / " + vos.get(i).getMovieNm() + " / " + vos.get(i).getTheatherNm() + " / " 
					+ vos.get(i).getDay() + " / " + vos.get(i).getTime() + " / " + vos.get(i).getPerson() + " / " + vos.get(i).getCost() + " / " 
					+ vos.get(i).getReserveDate() + "\n");
		}
		
		JButton ticketingBtn = new JButton("예매하기");
		ticketingBtn.setFont(new Font("휴먼엑스포", 1, 25));
		JButton exitBtn = new JButton("종료");
		exitBtn.setFont(new Font("휴먼엑스포", 1, 25));
		
		titleLbl.setBounds(10, 10, 100, 100);
		cntLbl.setBounds(100, 100, 100, 100);
		textArea.setBounds(200, 200, 100, 100);
		ticketingBtn.setBounds(300, 300, 100, 100);
		exitBtn.setBounds(400, 400, 100, 100);
		
		
		add(titleLbl);
		add(cntLbl);
		add(textArea);
		add(ticketingBtn);
		add(exitBtn);
		
		setVisible(true);
		
		ticketingBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TicketingView(mid);
			}
		});
		
		exitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}