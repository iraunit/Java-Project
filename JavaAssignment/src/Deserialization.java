package JavaAssignment.src;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void  main(String Args[]){

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.ser"));
            DataClass d1=(DataClass) in.readObject();
            System.out.println( "Assignment Name: " + d1.AssignmentName );
            System.out.println( "Student Name: " + d1.StudentName );
            System.out.println( "Student Roll No: " + d1.RollNo );
            System.out.println( "Subject Name: " + d1.SubjectName );
            in.close();
            System.out.println("Deserialization Done From Output.ser");
        }
        catch(Exception e){
            System.out.println(e);}
    }

}
