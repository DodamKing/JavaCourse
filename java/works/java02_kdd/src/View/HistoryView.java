package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import DAO.CustomerDAO;
import DAO.TicketDAO;
import VO.CustomerVO;
import VO.TicketVO;

public class HistoryView extends JFrame {
	String mid;
	JLabel titleLbl1, titleLbl2;
	JButton cancelBtn, moreBtn;
	CustomerVO customerVO = new CustomerVO();
	CustomerDAO customerDAO = new CustomerDAO();
	TicketVO ticketVO = new TicketVO();
	TicketDAO ticketDAO = new TicketDAO();
	ArrayList<TicketVO> vos; 
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_5;
	private JButton checkBtn;
	private JButton changeBtn;
	
	public HistoryView(String mid) {
		super();
		setTitle("예매 내역");
		this.mid = mid;
		build();
	}

	private void build() {
		setSize(1110, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		Font font = new Font("휴먼엑스포", 0, 13);
		
		titleLbl1 = new JLabel(customerDAO.getName(mid) + "님 예매 내역", SwingConstants.LEFT);
		titleLbl1.setBounds(34, 24, 368, 52);
		titleLbl1.setFont(new Font("휴먼엑스포", 1, 30));
		moreBtn = new JButton("예매");
		moreBtn.setBounds(92, 387, 160, 52);
		moreBtn.setFont(new Font("휴먼엑스포", 1, 25));
		cancelBtn = new JButton("종료");
		cancelBtn.setBounds(848, 387, 160, 52);
		cancelBtn.setFont(new Font("휴먼엑스포", 1, 25));
		
		getContentPane().setLayout(null);
		
		getContentPane().add(titleLbl1);
		getContentPane().add(cancelBtn);
		getContentPane().add(moreBtn);
		
		lblNewLabel = new JLabel(ticketDAO.countTicket(mid) + "건 검색됨");
		lblNewLabel.setBounds(964, 36, 110, 38);
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(lblNewLabel);
		
		String header[] = {"영화", "영화관", "날짜", "예매일"};
		
		DefaultTableModel model = new DefaultTableModel(header, 0);
		JTable table = new JTable(model);
		table.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		table.setRowHeight(30);
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setBounds(34, 86, 1040, 275);
		getContentPane().add(jScrollPane);
		
		checkBtn = new JButton("내역 조회");
		checkBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		checkBtn.setBounds(344, 387, 160, 52);
		getContentPane().add(checkBtn);
		
		changeBtn = new JButton("내역 수정");
		changeBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		changeBtn.setBounds(596, 387, 160, 52);
		getContentPane().add(changeBtn);
		
		vos = ticketDAO.show(mid);
		
		for (int i=0; i<vos.size(); i++) {
			model.addRow(new Object[] {vos.get(i).getMovieNm(), vos.get(i).getTheatherNm(), vos.get(i).getDay(), vos.get(i).getReserveDate()});
		}
		
		
		setVisible(true);
		
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
				if (JOptionPane.showConfirmDialog(null, "예매를 더 진행 하시겠습니까?", "imformation", JOptionPane.OK_CANCEL_OPTION) == 0) {
					new TicketingView(mid);
					dispose();
				}
			}
		});
		
//		table.addMouseListener(new MouseAdapter() { // 마우스로 감지
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				TicketVO vo = vos.get(table.getSelectedRow());
//				new LookUpTicketView(vo);
//				dispose();
//			}
//		});
		
		checkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					TicketVO vo = vos.get(table.getSelectedRow());
					if (JOptionPane.showConfirmDialog(null, vo.getMovieNm() + "\n내역을 확인 하시겠습니까?", "imformation", JOptionPane.OK_CANCEL_OPTION) == 0) {
						new LookUpTicketView(vo);
						dispose();
					}
				}
			}
		});
		
		changeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					TicketVO vo = vos.get(table.getSelectedRow());
					if (JOptionPane.showConfirmDialog(null, vo.getMovieNm() + "\n내역을 수정 하시겠습니까?", "imformation", JOptionPane.OK_CANCEL_OPTION) == 0) {
						new TicketChangingView(vo);
						dispose();
					}
				}
			}
		});
		
	}
}