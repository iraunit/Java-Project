package HelloJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MultiThreading extends Frame {

    public MultiThreading(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

    public static void main(String args[]){
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String []fontList=ge.getAvailableFontFamilyNames();
        for(String fontName: fontList){
            System.out.println(fontName);
        }
        MultiThreading obj=new MultiThreading();
        obj.setSize(new Dimension(400,400));
        obj.setTitle("AWT Program");
        obj.setVisible(true);





    }

}
