package JavaAssignment.src;

import java.io.Serializable;

public class DataClass implements Serializable {
    String AssignmentName;
    String StudentName;
    Long RollNo;
    String SubjectName;

    public DataClass(String AssignmentName, String StudentName, Long RollNo,
                     String SubjectName){
        this.AssignmentName=AssignmentName;
        this.StudentName=StudentName;
        this.RollNo=RollNo;
        this.SubjectName=SubjectName;
    }

}
