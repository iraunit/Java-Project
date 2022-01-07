package JavaAssignment.src;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ImplementingSerialization {

    public static void  main (String Args[]){
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Assignment Name: ");
            String Assname=sc.nextLine();;
            System.out.println("Enter Student Name: ");
            String studentName=sc.nextLine();
            System.out.println("Enter Roll Number: ");
            Long rollNo=Long.parseLong(sc.nextLine());
            System.out.println("Enter Subject Name: ");
            String subName=sc.nextLine();
            System.out.println();
            DataClass Student1=new DataClass(Assname,studentName,rollNo,subName);
            FileOutputStream OutPutFile=new FileOutputStream("Output.ser");
            ObjectOutputStream out=new ObjectOutputStream(OutPutFile);
            out.writeObject(Student1);
            out.flush();
            out.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Serialization Done and Saved In Output.ser");

    }
}
