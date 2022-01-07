package HotelManagement.src.HotelManagementPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame implements ActionListener {

    private JFrame frame;
    DashBoard(){
////        setSize(500,500);
//        setTitle("Hotel Management by Raunit Verma");
//        setBounds(200,100,500,500);
//
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/hotel.jpg"));
//        JLabel l1=new JLabel(i1);
////        l1.setBounds(0,0,500,500);
//        add(l1);
//        JButton reception = new JButton("Reception");
//        add(reception);
//        reception.setBounds(100,100,300,30);
//        setLayout(null);
//        setBounds(0,0,1000,1000);
//        setVisible(true);
//        reception.addActionListener((ActionListener)this );
//        JButton addrooms = new JButton("Add Rooms");
//        add(addrooms);
//        addrooms.setBounds(420,100,300,30);
//        addrooms.addActionListener((ActionListener)this );
//        JButton Employee = new JButton("Add Employee");
//        add(Employee);
//        Employee.setBounds(420,140,300,30);
//        Employee.addActionListener((ActionListener)this );

        frame = new JFrame();
        frame.setBounds(100, 100, 1037, 637);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Welcome To RV Group Of Hotels");
        JButton btnNewButton = new JButton("Reception");
        btnNewButton.setFont(new Font("Consolas", Font.BOLD, 25));
        btnNewButton.setBounds(126, 165, 300, 50);
        frame.getContentPane().add(btnNewButton);
        btnNewButton.addActionListener((ActionListener)this );
        JButton btnAddEmployee = new JButton("Add Employee");
        btnAddEmployee.setFont(new Font("Consolas", Font.BOLD, 25));
        btnAddEmployee.setBounds(619, 165, 300, 50);
        frame.getContentPane().add(btnAddEmployee);
        btnAddEmployee.addActionListener((ActionListener)this );
        JButton btnAddRooms = new JButton("Add Rooms");
        btnAddRooms.setFont(new Font("Consolas", Font.BOLD, 25));
        btnAddRooms.setBounds(619, 288, 300, 50);
        frame.getContentPane().add(btnAddRooms);
        btnAddRooms.addActionListener((ActionListener)this );
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
        frame.setVisible(true);
    }

    public static void main(String Args[]){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DashBoard window = new DashBoard();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
//        this.setVisible(false);
        if(e.getActionCommand()=="Add Employee"){
            new RvAddEmployee();
//            setVisible(false);
        }
        else if(e.getActionCommand()=="Reception"){
            new ReceptionHome();
            setVisible(false);
        }
        else if(e.getActionCommand()=="Add Rooms"){
            new AddRooms();
//            setVisible(false);
        }
    }
}
