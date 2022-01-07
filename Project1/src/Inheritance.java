
abstract class StudentInfo{
	String name;
	int rollNo;
	String branch;
	
	public StudentInfo(String name, int rollNo, String branch) {
		this.name=name;
		this.rollNo=rollNo;
		this.branch=branch;
	}
	
	public abstract double calculateGrade();
		
	
	
}
class UGStudentsInfo extends StudentInfo {
	
	String ProjectTitle;
	public UGStudentsInfo(String name,int rollNo,String branch, String ProjectTitle) {
		super(name,rollNo,branch);
		this.ProjectTitle=ProjectTitle;
	}
	
	public double calculateGrade() {
		return rollNo;
	}
}

class PGStudentsInfo extends StudentInfo {
	String researchTitle;
	int numPapers;
	public PGStudentsInfo(String name,int rollNo,String branch, String researchTitle, int numPapers) {
		super(name,rollNo,branch);
		super.name=name;
		super.rollNo=rollNo;
		super.branch=branch;
		this.researchTitle=researchTitle;
		this.numPapers=numPapers;
	}

	public double calculateGrade() {
		return rollNo*2;
	}
}
public class Inheritance {
	
	
	
	public static void main(String[] args) {
		UGStudentsInfo ug1=new UGStudentsInfo("Raunit Verma",82,"Computer Science","Hotel Management");
		PGStudentsInfo pg1=new PGStudentsInfo("Raunit Verma",82,"Computer Science","Hotel Management",3);
		System.out.println(ug1.calculateGrade());
		System.out.println(pg1.calculateGrade());
		
	}

}
