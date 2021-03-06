package jeena;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard window = new dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1037, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Reception");
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 25));
		btnNewButton.setBounds(126, 165, 341, 67);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.setFont(new Font("Consolas", Font.BOLD, 25));
		btnAddEmployee.setBounds(619, 165, 341, 67);
		frame.getContentPane().add(btnAddEmployee);
		
		JButton btnAddRooms = new JButton("Add Rooms");
		btnAddRooms.setFont(new Font("Consolas", Font.BOLD, 25));
		btnAddRooms.setBounds(619, 288, 341, 67);
		frame.getContentPane().add(btnAddRooms);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To RV Group of Hotels");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Open Sans", Font.BOLD, 35));
		lblNewLabel_1.setBounds(126, 23, 834, 57);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Java\\HotelManagement\\src\\icons\\Atlantis-The-Palm__2018_Zero-Entry-1.jpg"));
		lblNewLabel.setBounds(-50, -17, 1357, 815);
		frame.getContentPane().add(lblNewLabel);
	}
}
