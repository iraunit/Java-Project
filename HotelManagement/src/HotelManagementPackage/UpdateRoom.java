package HotelManagement.src.HotelManagementPackage;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateRoom extends JFrame {
    Database conn = null;
    PreparedStatement pst = null;
    private JPanel contentPane;
    private JTextField txt_ID;
    private JTextField txt_Ava;
    private JTextField txt_Status;
    private JTextField txt_Room;

    Choice c1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UpdateRoom frame = new UpdateRoom();
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
    public UpdateRoom() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(530, 200, 900, 380);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/updateroom.jpg"));
        Image i3 = i1.getImage().getScaledInstance(550, 250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(300,60,600,250);
        add(l1);

        JLabel lblUpdateRoomStatus = new JLabel("Update Room Status");
        lblUpdateRoomStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUpdateRoomStatus.setBounds(85, 11, 206, 34);
        contentPane.add(lblUpdateRoomStatus);

        JLabel lblNewLabel = new JLabel("Guest ID:");
        lblNewLabel.setBounds(27, 60, 90, 14);
        contentPane.add(lblNewLabel);

        c1 = new Choice();
        try{
            Database c = new Database();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                c1.add(rs.getString("number"));
            }
        }catch(Exception e){ }
        c1.setBounds(160, 84, 140, 20);
        contentPane.add(c1);

        JLabel lblAvailability = new JLabel("Availability:");
        lblAvailability.setBounds(27, 165, 90, 14);
        contentPane.add(lblAvailability);

        JLabel lblCleanStatus = new JLabel("Clean Status:");
        lblCleanStatus.setBounds(27, 200, 90, 14);
        contentPane.add(lblCleanStatus);


        txt_Ava = new JTextField();
        txt_Ava.setBounds(160, 165, 140, 20);
        contentPane.add(txt_Ava);
        txt_Ava.setColumns(10);

        txt_Status = new JTextField();
        txt_Status.setBounds(160, 200, 140, 20);
        contentPane.add(txt_Status);
        txt_Status.setColumns(10);

        txt_Room = new JTextField();
        txt_Room.setBounds(160, 133, 140, 20);
        contentPane.add(txt_Room);
        txt_Room.setColumns(10);

        JButton b1 = new JButton("Check");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String s1 = c1.getSelectedItem();
                    Database c = new Database();
                    ResultSet rs1 = c.s.executeQuery("select * from customer where number = "+s1);

                    while(rs1.next()){
                        txt_Room.setText(rs1.getString("room"));
                    }
                }catch(Exception ee){
                    System.out.println(ee);
                }
                try{
                    Database c  = new Database();
                    ResultSet rs2 = c.s.executeQuery("select * from room where room_number = "+txt_Room.getText());
                    while(rs2.next()){
                        txt_Ava.setText(rs2.getString("available"));
                        txt_Status.setText(rs2.getString("status"));
                    }
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
        });
        b1.setBounds(120, 240, 89, 23);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) throws NumberFormatException {

                try{
                    Database c = new Database();
                    String str = "update room set clean_status = '"+txt_Status.getText()+"' where room_number = "+txt_Room.getText();
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Update Sucessful");

                    new ReceptionHome().setVisible(true);
                    setVisible(false);
                }catch (Exception ee){
                    ee.printStackTrace();
                }


            }
        });
        btnUpdate.setBounds(60, 280, 89, 23);
        btnUpdate.setBackground(Color.BLACK);
        btnUpdate.setForeground(Color.WHITE);
        contentPane.add(btnUpdate);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReceptionHome().setVisible(true);
                setVisible(false);
            }
        });
        btnExit.setBounds(180, 280, 89, 23);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        JLabel lblRoomId = new JLabel("Room Number:");
        lblRoomId.setBounds(27, 133, 100, 14);
        contentPane.add(lblRoomId);

        getContentPane().setBackground(Color.WHITE);
    }

}