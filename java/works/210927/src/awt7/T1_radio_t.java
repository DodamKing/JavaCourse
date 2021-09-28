package awt7;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 라디오버튼
@SuppressWarnings("serial")
public class T1_radio_t extends Frame implements ItemListener{
	Panel pn1;
	CheckboxGroup gender;
	Checkbox gender1, gender2;
	TextArea ta;

	public T1_radio_t() {
		super("라이오버튼 연습!");
		setBounds(300, 300, 300, 300);
		setLayout(new BorderLayout());
		
		pn1 = new Panel();
		gender = new CheckboxGroup();
		gender1 = new Checkbox("남자", gender, false);	// ('레이블',그룹명, 옵션(선택))
		gender2 = new Checkbox("여자", gender, false);
		
		pn1.add(gender1);
		pn1.add(gender2);
		
		ta = new TextArea();
		
		
		add(pn1, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		
		setVisible(true);
		
		gender1.addItemListener(this);
		gender2.addItemListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T1_radio_t();
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String gender = e.paramString();
		if (gender.contains("남")) {
			ta.append("남자입니다.\n");
		}
		else {
			ta.append("여자입니다.\n");
		}
	}
	
}
