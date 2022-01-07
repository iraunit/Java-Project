package HotelManagement.src.HotelManagementPackage;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.plaf.FontUIResource;
public class HotelManagement extends JFrame implements ActionListener{

	HotelManagement(){
		setBounds(400,200,800,500);
		setTitle("Hotel Management");
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/hotel.jpg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0,0,800,500);
		add(l1);
		JLabel l2=new JLabel("RV Group Of Hotels");
		l2.setBounds(10,00,800,100);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("serif",Font.PLAIN,60));
		l1.add(l2);
		
		JButton b1=new JButton("Continue");
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(600,400,120,40);
		b1.setFont(new Font("serif",Font.BOLD,20));
		l1.add(b1);
		b1.addActionListener(this);
		setLayout(null);
		setVisible(true);
		while(true) {
			l2.setVisible(false);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
			l2.setVisible(true);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new HotelManagement();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Login().setVisible(true);
		this.setVisible(false);
		
	}

}
