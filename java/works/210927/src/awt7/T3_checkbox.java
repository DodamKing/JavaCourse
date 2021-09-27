package awt7;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T3_checkbox extends Frame {
	Panel pn1;
	Checkbox chk1, chk2, chk3, chk4;
	Label lblTitle;

	public T3_checkbox() {
		super("체크박스 연습!");
		setBounds(300,300,300,300);
		
		pn1 = new Panel();
		
		lblTitle = new Label("취미를 선택하세요.");
		chk1 = new Checkbox("등산");
		chk2 = new Checkbox("낚시");
		chk3 = new Checkbox("독서");
		chk4 = new Checkbox("바둑");
		
		pn1.add(chk1);
		pn1.add(chk2);
		pn1.add(chk3);
		pn1.add(chk4);
		
		add(pn1);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T3_checkbox();
	}
}
