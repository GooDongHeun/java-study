package oop;

public class ThisExam {

	int num = 10;
	void setNum(int num) {
		
	}
	
	int getNum() {
		return this.num;
	}
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num); 
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.num);
}
}
