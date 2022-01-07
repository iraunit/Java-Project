package HotelManagement.src.HotelManagementPackage;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckOut extends JFrame {
    private JPanel contentPane;
    private JTextField t1;
    Choice c1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CheckOut frame = new CheckOut();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void close(){
        this.dispose();
    }

    /**
     * Create the frame.
     * @throws SQLException
     */
    public CheckOut() throws SQLException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800, 294);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setTitle("CheckOut");
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/checkout.jpg"));
        Image i3 = i1.getImage().getScaledInstance(400, 225,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(300,20,500,225);
        add(l1);

        JLabel lblCheckOut = new JLabel("Check Out ");
        lblCheckOut.setFont(new Font("Georgia", Font.PLAIN, 20));
        lblCheckOut.setBounds(70, 11, 140, 35);
        contentPane.add(lblCheckOut);

        JLabel lblName = new JLabel("Number :");
        lblName.setBounds(20, 85, 80, 14);
        contentPane.add(lblName);

        c1 = new Choice();
        try{
            Database c = new Database();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                c1.add(rs.getString("number"));
            }
        }catch(Exception e){ }
        c1.setBounds(130, 82, 150, 20);
        contentPane.add(c1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i5 = i4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JButton l2 = new JButton(i6);
        l2.setBounds(290,82,20,20);
        add(l2);

        l2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){
                System.out.println("Hi");
                try{

                    Database c = new Database();
                    String number = c1.getSelectedItem();
                    ResultSet rs = c.s.executeQuery("select * from customer where number = "+number);

                    if(rs.next()){
                        System.out.println("clicked");
                        t1.setText(rs.getString("room_number"));
                    }
                }catch(Exception e){ }
            }
        });


        JLabel lblRoomNumber = new JLabel("Room Number:");
        lblRoomNumber.setBounds(20, 132, 86, 20);
        contentPane.add(lblRoomNumber);

        t1 = new JTextField();
        t1.setBounds(130, 132, 150, 20);
        contentPane.add(t1);

        JButton btnCheckOut = new JButton("Check Out");
        btnCheckOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = c1.getSelectedItem();
                String s1 = t1.getText();
                String deleteSQL = "Delete from customer where number = "+id;
                String q2 = "update room set available = 'Available' where room_number = "+s1;


                Database c = new Database();

                try{


                    c.s.executeUpdate(deleteSQL);
                    c.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Check Out Successful");
                    new ReceptionHome().setVisible(true);
                    setVisible(false);
                }catch(SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
        btnCheckOut.setBounds(50, 200, 100, 25);
        btnCheckOut.setBackground(Color.BLACK);
        btnCheckOut.setForeground(Color.WHITE);
        contentPane.add(btnCheckOut);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReceptionHome().setVisible(true);
                setVisible(false);
            }
        });
        btnExit.setBounds(160, 200, 100, 25);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);


        getContentPane().setBackground(Color.WHITE);
    }

}