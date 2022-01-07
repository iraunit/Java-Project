package HotelManagement.src.HotelManagementPackage;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Room extends JFrame implements ActionListener{
    Database d = null;
    public JPanel contentPane;
    private JTable table;
    private JLabel lblAvailability;
    private JLabel lblCleanStatus;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblRoomNumber;
    private JLabel lblId;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Room frame = new Room();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Room() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 1040, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HotelManagement/src/icons/room.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(520,0,500,500);
        add(l1);

        loadData(contentPane);
        table = new JTable();
        table.setBounds(0, 40, 500, 400);
        contentPane.add(table);

        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
//                    Database d = new Database();
//                    String displayCustomersql = "select * from Room";
//                    //PreparedStatement pst = conn.prepareStatement(displayCustomersql);
//                    ResultSet rs = d.s.executeQuery(displayCustomersql);
//                    table.setModel(DbUtils.resultSetToTableModel(rs));


                }
                catch(Exception e1){
                    e1.printStackTrace();
                }
            }
        });
        btnLoadData.setBounds(100, 470, 120, 30);
        btnLoadData.setBackground(Color.BLACK);
        btnLoadData.setForeground(Color.WHITE);
//        contentPane.add(btnLoadData);

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReceptionHome().setVisible(true);
                setVisible(false);
            }
        });
        btnNewButton.setBounds(290, 470, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        contentPane.add(btnNewButton);

        lblAvailability = new JLabel("Availability");
        lblAvailability.setBounds(119, 15, 69, 14);
        contentPane.add(lblAvailability);

        lblCleanStatus = new JLabel("Clean Status");
        lblCleanStatus.setBounds(216, 15, 76, 14);
        contentPane.add(lblCleanStatus);

        lblNewLabel = new JLabel("Price");
        lblNewLabel.setBounds(330, 15, 46, 14);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("Bed Type");
        lblNewLabel_1.setBounds(417, 15, 76, 14);
        contentPane.add(lblNewLabel_1);


        lblId = new JLabel("Room Number");
        lblId.setBounds(12, 15, 90, 14);
        contentPane.add(lblId);

        getContentPane().setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void loadData(JPanel contentPane){

        try{
            table = new JTable();
            table.setBounds(0, 40, 500, 400);
            contentPane.add(table);
            Database d = new Database();
            String displayCustomersql = "select * from Room";
//            PreparedStatement pst = conn.prepareStatement(displayCustomersql);
            ResultSet rs = d.s.executeQuery(displayCustomersql);
            table.setModel(DbUtils.resultSetToTableModel(rs));


        }
        catch(Exception e1){
            e1.printStackTrace();
        }

    }
}