package HelloJava;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIwithSwing extends JFrame {
    public static void main (String args []){
        JFrame frame=new JFrame("Java Assignment Two");
       frame.setVisible(true);
        frame.setBounds(100,100,500,500);
        JPanel panel=new JPanel();
        JPanel p1=new JPanel(); panel.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        panel.setLayout(new GridLayout(5,0,10,100));
        p1.setLayout(new GridLayout(0,2,5,705));
        JPanel p2=new JPanel(); p2.setLayout(new GridLayout(0,2,5,75));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel p3=new JPanel(); p3.setLayout(new GridLayout(0,3,5,10));
        JPanel p4=new JPanel(); p4.setLayout(new BoxLayout(p4,BoxLayout.X_AXIS));
        JLabel name=new JLabel("Name");
        JLabel college=new JLabel("College Name");
        JTextField namee=new JTextField();
        JTextField collegee=new JTextField();
        JLabel ratee=new JLabel("Rate This out of 10");
        JLabel liked=new JLabel("Did you like this project?");
        JRadioButton r1=new JRadioButton("Yes"); JRadioButton r2=new JRadioButton("No");
        p1.add(name); p1.add(namee); panel.add(p1);
        p2.add(college); p2.add(collegee); panel.add(p2);
        p3.add(liked); ButtonGroup bg=new ButtonGroup();
        bg.add(r1); bg.add(r2); p3.add(r1); p3.add(r2); panel.add(p3);
        JButton button=new JButton("Close");
        JSlider rate=new JSlider(JSlider.HORIZONTAL,0,10,9);
        rate.setMajorTickSpacing(1); rate.setPaintLabels(true); rate.setPaintTicks(true);
        p4.add(ratee); p4.add(rate);
        panel.add(p4);
        panel.add(button);
        JDateChooser nda= new JDateChooser();
        String date= ( (JTextField) nda.getDateEditor().getUiComponent()).getText();






        frame.add(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
    }

}



//        frame.getContentPane().add(panel, BorderLayout.LINE_START);