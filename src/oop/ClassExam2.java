package oop;

public class ClassExam2 {

	String[] strs;
	int num;
	double db;
	boolean bl;
	char c;
	
	public static void main(String[] args) {
		ClassExam2 ce = new ClassExam2();
		System.out.println(ce.strs);
		System.out.println(ce.num);
		System.out.println(ce.db);
		System.out.println(ce.bl);
		System.out.println(ce.c);
		//데이터타입이 아닌경우 null로 표시된다
	}
}
