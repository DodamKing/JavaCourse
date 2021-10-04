package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import DAO.TicketDAO;
import VO.TicketVO;

public class LookUpTicketView extends JFrame {
	private TicketVO vo;
	private TicketDAO dao = new TicketDAO();
	
	public LookUpTicketView(TicketVO vo) {
		super("예매정보");
		this.vo = vo;
		buildGUI();
	}
	
	public void buildGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		
		setResizable(false);
		getContentPane().setLayout(null);
		
		Font font = new Font("휴먼엑스포", 0, 13);
		JPanel contentPane;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelCore = new JPanel();
		contentPane.add(panelCore, BorderLayout.CENTER);
		panelCore.setLayout(null);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(12, 10, 349, 69);
		panelCore.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblTitle = new JLabel(vo.getMovieNm());
		lblTitle.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 10, 325, 48);
		panelTitle.add(lblTitle);
		
		JPanel panelContent = new JPanel();
		panelContent.setBounds(12, 98, 349, 406);
		panelCore.add(panelContent);
		panelContent.setLayout(null);
		
		JPanel panelColumn = new JPanel();
		panelColumn.setBounds(12, 10, 88, 386);
		panelContent.add(panelColumn);
		panelColumn.setLayout(null);
		
		JLabel lblCustomerNm = new JLabel("이름");
		lblCustomerNm.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblCustomerNm.setBounds(12, 10, 70, 38);
		panelColumn.add(lblCustomerNm);
		
		JLabel lblTheatherNm = new JLabel("영화관");
		lblTheatherNm.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblTheatherNm.setBounds(12, 62, 70, 38);
		panelColumn.add(lblTheatherNm);
		
		JLabel lblDay = new JLabel("상영일");
		lblDay.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblDay.setBounds(12, 114, 70, 38);
		panelColumn.add(lblDay);
		
		JLabel lblTime = new JLabel("상영 시간");
		lblTime.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblTime.setBounds(12, 166, 70, 38);
		panelColumn.add(lblTime);
		
		JLabel lblReserveDate = new JLabel("예매일");
		lblReserveDate.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblReserveDate.setBounds(12, 218, 70, 38);
		panelColumn.add(lblReserveDate);
		
		JLabel lblCost = new JLabel("가격");
		lblCost.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblCost.setBounds(12, 270, 70, 38);
		panelColumn.add(lblCost);
		
		JLabel lblperson = new JLabel("인원");
		lblperson.setFont(new Font("나눔명조 ExtraBold", Font.BOLD, 15));
		lblperson.setBounds(12, 322, 70, 38);
		panelColumn.add(lblperson);
		
		JPanel panelValue = new JPanel();
		panelValue.setBounds(112, 10, 225, 386);
		panelContent.add(panelValue);
		panelValue.setLayout(null);
		
		JLabel lblCustomerNm_1 = new JLabel(vo.getCustomerNm());
		lblCustomerNm_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblCustomerNm_1.setBounds(12, 10, 201, 38);
		panelValue.add(lblCustomerNm_1);
		
		JLabel lblTheatherNm_1 = new JLabel(vo.getTheatherNm());
		lblTheatherNm_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblTheatherNm_1.setBounds(12, 62, 201, 38);
		panelValue.add(lblTheatherNm_1);
		
		JLabel lblDay_1 = new JLabel(vo.getDay());
		lblDay_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblDay_1.setBounds(12, 114, 201, 38);
		panelValue.add(lblDay_1);
		
		JLabel lblTime_1 = new JLabel(vo.getTime());
		lblTime_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblTime_1.setBounds(12, 166, 201, 38);
		panelValue.add(lblTime_1);
		
		JLabel lblReserveDate_1 = new JLabel(vo.getReserveDate());
		lblReserveDate_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblReserveDate_1.setBounds(12, 218, 201, 38);
		panelValue.add(lblReserveDate_1);
		
		JLabel lblCost_1 = new JLabel(vo.getCost() + "원");
		lblCost_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblCost_1.setBounds(12, 270, 201, 38);
		panelValue.add(lblCost_1);
		
		JLabel lblperson_1 = new JLabel(vo.getPerson() + "명");
		lblperson_1.setFont(new Font("휴먼옛체", Font.PLAIN, 14));
		lblperson_1.setBounds(12, 322, 201, 38);
		panelValue.add(lblperson_1);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(12, 503, 349, 69);
		panelCore.add(panelBtn);
		panelBtn.setLayout(null);
		
		JButton btnExit = new JButton("확인");
		btnExit.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		btnExit.setBounds(12, 20, 154, 39);
		panelBtn.add(btnExit);
		
		JButton btnCancel = new JButton("예매 취소");
		btnCancel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
		btnCancel.setBounds(183, 20, 154, 39);
		panelBtn.add(btnCancel);
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HistoryView(vo.getCustomerID());
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, vo.getMovieNm() + "\n예매를 취소 하시겠습니까?", "imformation", JOptionPane.OK_CANCEL_OPTION) == 0) {
					int result = dao.delTicket(vo.getIdt());
					if (result == -1) {
						JOptionPane.showMessageDialog(null, "데이터 베이스 오류");
					}
					else {
						JOptionPane.showMessageDialog(null, "예매한 내역이 정상적으로 취소 되었습니다.");
						dispose();
						new HistoryView(vo.getCustomerID());
					}
				}
			}
		});
		
		
		setVisible(true);
	}
}
