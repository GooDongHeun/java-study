package oop.inherit;

public class Final {

	int num;
	Final() {
		num = 3;
	}
	public static void main(String[] args) {
	Final f = new Final();
	System.out.println(f.num);
	f.num = 3;
	}
}