package awt7;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 라디오버튼
@SuppressWarnings("serial")
public class T1_radio_t extends Frame {
	Panel pn1;
	CheckboxGroup gender;
	Checkbox gender1, gender2;

	public T1_radio_t() {
		super("라이오버튼 연습!");
		setBounds(300, 300, 300, 300);
		setLayout(new FlowLayout());
		
		pn1 = new Panel();
		gender = new CheckboxGroup();
		gender1 = new Checkbox("남자", gender, true);	// ('레이블',그룹명, 옵션(선택))
		gender2 = new Checkbox("여자", gender, false);
	
		
		pn1.add(gender1);
		pn1.add(gender2);
		
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
		new T1_radio_t();
	}
	
	ItemListener itemListener = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == "남자") {
				System.out.println("남자");
			}
		}
	};
	
}
