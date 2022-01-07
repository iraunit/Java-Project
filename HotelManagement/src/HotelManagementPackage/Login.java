package HotelManagement.src.HotelManagementPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	
	Login(){
	l1=new JLabel("Username");
	l1.setBounds(20,0,100,100);
	l1.setVisible(true);
	add(l1);
	setLayout(null);
	l2=new JLabel("Password");
	l2.setBounds(20,0,100,200);
	l2.setVisible(true);
	add(l2);
	setLayout(null);
	t1=new JTextField();
	t1.setBounds(100,45,100,20);
	t1.setVisible(true);
	add(t1);
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/download.png"));
//		Image i3 = i1.getImage().getScaledInstance(400, 225,Image.SCALE_DEFAULT);
//		ImageIcon i2 = new ImageIcon(i3);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(150,0,500,225);
		add(l1);
	t2=new JPasswordField();
	t2.setBounds(100,85,100,20);
	t2.setVisible(true);
	add(t2);
	
	b1=new JButton("Cancel");
	b1.setBounds(100,150,80,30);
	add(b1);
	b2=new JButton("Login");
	b2.setBounds(200,150,80,30);
	add(b2);
	b1.addActionListener((ActionListener) this);
		setBounds(600,300,540,250);
		setVisible(true);
		setTitle("Login To the System");
		b2.addActionListener((ActionListener) this);
	}

	public static void main(String args[]) {
		new Login();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			System.exit(0);
		}
		else if(e.getSource()==b2){
			String Username= t1.getText();
			String Password=t2.getText();
			Database d=new Database();
			String str="SELECT * FROM login where username = '"+Username+"' and password = '"+Password+"' ";
			try{
				ResultSet Res = d.s.executeQuery(str);
				if(Res.next()){
					new DashBoard();
					this.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalid Username Or Passwords");
					this.setVisible(false);
				}
			}
			catch(Exception ex){

			}
		}

		
	}
}
