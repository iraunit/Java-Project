package HotelManagement.src.HotelManagementPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    Connection c;
    Statement s;
    public Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","root");
            s= c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
