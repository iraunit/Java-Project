import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.applet.*;

public class first extends JFrame {
	
	
	static String labelStr = "";

	public	static void main (String args[]) {
		JFrame frame=new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
//		frame.setLayout(new FlowLayout());
//		JLabel l1=new JLabel("Raunit");
//		frame.add(l1);
//		frame.setTitle("HEllo World");
////		JLabel l2=new JLabel();
////		l2.setIcon(new ImageIcon("C:\\Users\\welcome\\Desktop\\icon.jpg"));
////		frame.add(l2);
//		JTextField t1=new JTextField(40);
//		JLabel l2=new JLabel("this");
//		frame.add(l2);
//		JButton b1=new JButton("hell");
////		b1.setBounds(100,100,20,30);
//		b1.addActionListener((ae)->l2.setText("Clicked"));
//		frame.add(b1);
		 
//		 Label label1 = new Label(labelStr);
//	        label1.setLocation(100,200);
//
//	        Checkbox box1 = new Checkbox("Option 1");
//	        Checkbox box2 = new Checkbox("Option 2");
//	        Checkbox box3 = new Checkbox("Option 3");
//	        Checkbox box4 = new Checkbox("Option 4");
//	        Checkbox box5 = new Checkbox("Option 5");
//
//	        CheckboxGroup group=new CheckboxGroup();
//	        box1.setCheckboxGroup(group);
//	        box1.setBounds(10,30,100,20);
//	        box2.setCheckboxGroup(group);
//	        box2.setBounds(10,50,100,20);
//	        box3.setCheckboxGroup(group);
//	        box3.setBounds(10,70,100,20);
//	        box4.setCheckboxGroup(group);
//	        box4.setBounds(10,90,100,20);
//	        box5.setCheckboxGroup(group);
//	        box5.setBounds(10,110,100,20);
//
//	        frame.add(box1);
//	        frame.add(box2);
//	        frame.add(box3);
//	        frame.add(box4);
//	        frame.add(box5);
//	        frame.add(label1);
//
//
//	        ItemListener Listener = new ItemListener() {
//
//	            @Override
//	            public void itemStateChanged(ItemEvent e) {
//	                if (box1.getState()) {
//	                    labelStr += "One";
//	                }
//	                if (box2.getState()) {
//	                    labelStr += "Two";
//	                }
//	                if (box3.getState()) {
//	                    labelStr += "Three";
//	                }
//	                if (box4.getState()) {
//	                    labelStr += "Four";
//	                }
//	                if (box5.getState()) {
//	                    labelStr += "Five";
//	                }
//	                label1.setText(labelStr);
//	            }
//	        };
//	        box1.addItemListener(Listener);
//	        box2.addItemListener(Listener);
//	        box3.addItemListener(Listener);
//	        box4.addItemListener(Listener);
//	        box5.addItemListener(Listener);
		
		GridLayout experimentLayout = new GridLayout(0,2,10,10);

		

		        frame.setLayout(experimentLayout);

		        frame.add(new JLabel("Email"));
		        frame.add(new JTextField("Button 2"));
		        frame.add(new JLabel("Name"));
		        frame.add(new JTextField());
		        frame.add(new JLabel("Message"));
		        frame.add(new JTextField());
		        
		
		
	}

}
