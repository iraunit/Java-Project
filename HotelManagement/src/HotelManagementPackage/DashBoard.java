package HotelManagement.src.HotelManagementPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame implements ActionListener {


    DashBoard(){
//        setSize(500,500);
        setTitle("Hotel Management by Raunit Verma");
        setBounds(200,100,500,500);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/hotel.jpg"));
        JLabel l1=new JLabel(i1);
//        l1.setBounds(0,0,500,500);
        add(l1);
        JButton reception = new JButton("Reception");
        add(reception);
        reception.setBounds(100,100,300,30);
        setLayout(null);
        setBounds(0,0,1000,1000);
        setVisible(true);
        reception.addActionListener((ActionListener)this );
        JButton addrooms = new JButton("Add Rooms");
        add(addrooms);
        addrooms.setBounds(420,100,300,30);
        addrooms.addActionListener((ActionListener)this );
        JButton Employee = new JButton("Add Employee");
        add(Employee);
        Employee.setBounds(420,140,300,30);
        Employee.addActionListener((ActionListener)this );
    }

    public static void main(String Args[]){
        new DashBoard();
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
