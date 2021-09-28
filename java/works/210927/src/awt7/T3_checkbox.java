package awt7;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T3_checkbox extends Frame {
	Panel pn1;
	Checkbox chk1, chk2, chk3, chk4;
	Label lblTitle;
	TextArea ta;
	Button btnClear;

	public T3_checkbox() {
		super("체크박스 연습!");
		setBounds(300,300,300,300);
		setLayout(new BorderLayout());
		
		pn1 = new Panel();
		pn1.setLayout(new FlowLayout());
		
		lblTitle = new Label("취미를 선택하세요.");
		chk1 = new Checkbox("등산");
		chk2 = new Checkbox("낚시");
		chk3 = new Checkbox("독서");
		chk4 = new Checkbox("바둑");
		btnClear = new Button("클리어");
		
		pn1.add(chk1);
		pn1.add(chk2);
		pn1.add(chk3);
		pn1.add(chk4);
		pn1.add(btnClear);
		
		ta = new TextArea();
		
		add(pn1, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		chk1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					ta.append("등산/");
				}
				else {
					ta.setText(ta.getText().replace("등산/", "")); 
				}
			}
		});
		
		chk2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					ta.append("낚시/");
				}
				else {
					ta.setText(ta.getText().replace("낚시/", "")); 
				}
				
			}
		});
		
		chk3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				ta.append(e.getStateChange() == 1 ? "독서선택\n" : "독서취소\n");
				if (e.getStateChange() == 1) {
					ta.append("독서/");
				}
				else {
					ta.setText(ta.getText().replace("독서/", "")); 
				}
			}
		});
	
		chk4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					ta.append("바둑/");
				}
				else {
					ta.setText(ta.getText().replace("바둑/", "")); 
				}
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T3_checkbox();
	}
}
