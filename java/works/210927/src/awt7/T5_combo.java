package awt7;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T5_combo extends Frame {
	Panel pn1, pn2;
	Choice choJob;	// 콤보상자
	List listJob;	// 리스트박스

	public T5_combo() {
		super("combo box 연습!");
		setBounds(300, 250, 300, 400);
		setLayout(new GridLayout(2,1));
		
		// 콤보상자 만들기
		pn1 = new Panel();
		choJob = new Choice();
		choJob.add("학생");
		choJob.add("회사원");
		choJob.add("공무원");
		choJob.add("군인");
		choJob.add("의사");
		choJob.add("프로그래머");
		choJob.add("기타");
		pn1.add(choJob);
		
		// 리스트상자 만들기
		pn2 = new Panel();
//		listJob = new List();
//		listJob = new List(6);
		listJob = new List(6, true);	// 다중선택
		listJob.add("학생");
		listJob.add("회사원");
		listJob.add("공무원");
		listJob.add("군인");
		listJob.add("의사");
		listJob.add("프로그래머");
		listJob.add("기타");
		pn2.add(listJob);
		
		add(pn1);
		add(pn2);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T5_combo();
	}
}
