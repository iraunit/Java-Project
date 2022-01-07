package HotelManagement.src.HotelManagementPackage;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerInfo extends JFrame {
    Database conn = null;
    public JPanel contentPane;
    private JLabel lblId;
    private JLabel lblNewLabel;
    private JLabel lblGender;
    public JTable table;
    private JLabel lblCountry;
    private JLabel lblRoom;
    private JLabel lblStatus;
    private JLabel lblNewLabel_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerInfo frame = new CustomerInfo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void close()
    {
        this.dispose();
    }
    /**
     * Create the frame.
     * @throws SQLException
     */
    public CustomerInfo() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(530, 200, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReceptionHome().setVisible(true);
                setVisible(false);
            }
        });
        btnExit.setBounds(450, 510, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try{
                    Database c  = new Database();

                    String displayCustomersql = "select * from Customer";
                    ResultSet rs = c.s.executeQuery(displayCustomersql);
                    table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }


        });
        btnLoadData.setBounds(300, 510, 120, 30);
        btnLoadData.setBackground(Color.BLACK);
        btnLoadData.setForeground(Color.WHITE);
//        contentPane.add(btnLoadData);

        lblId = new JLabel("ID");
        lblId.setBounds(31, 11, 46, 14);
        contentPane.add(lblId);

        JLabel l1 = new JLabel("Number");
        l1.setBounds(150, 11, 46, 14);
        contentPane.add(l1);

        lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(270, 11, 65, 14);
        contentPane.add(lblNewLabel);

        lblGender = new JLabel("Gender");
        lblGender.setBounds(360, 11, 46, 14);
        contentPane.add(lblGender);

        table = new JTable();
        table.setBounds(0, 40, 900, 450);
        contentPane.add(table);

        lblCountry = new JLabel("Country");
        lblCountry.setBounds(480, 11, 46, 14);
        contentPane.add(lblCountry);

        lblRoom = new JLabel("Room");
        lblRoom.setBounds(600, 11, 46, 14);
        contentPane.add(lblRoom);

        lblStatus = new JLabel("Check-in Status");
        lblStatus.setBounds(680, 11, 100, 14);
        contentPane.add(lblStatus);

        lblNewLabel_1 = new JLabel("Deposit");
        lblNewLabel_1.setBounds(800, 11, 100, 14);
        contentPane.add(lblNewLabel_1);

        getContentPane().setBackground(Color.WHITE);
        loadData(contentPane,table);
    }

    public void loadData(JPanel contentPane,JTable table){

        try{
//            table = new JTable();
////            table.setBounds(0, 40, 500, 400);
//            contentPane.add(table);
            Database c  = new Database();

            String displayCustomersql = "select * from Customer";
            ResultSet rs = c.s.executeQuery(displayCustomersql);
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));


        }
        catch(Exception e1){
            e1.printStackTrace();
        }

    }
}
