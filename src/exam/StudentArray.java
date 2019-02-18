package exam;

class Student{
	String name;
	int grade;
	String shcoolName;
}
public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[40];
		for(int i=0;i<students.length;i++) {
	students[i] = new Student();
	students[i].grade = i+1;
		}
		System.out.println(students[10].grade);
		System.out.println(students[20].grade);
		System.out.println(students[30].grade);
	}
	
}
