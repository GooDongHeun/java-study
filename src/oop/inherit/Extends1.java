package oop.inherit;
class Mother1{
	int age = 55;
	String name = "이현채";
	Mother1(){
		System.out.println("난 엄마 생성자!");
	}
	
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}

public class Extends1 extends Mother{
	private char[] age;
	Extends1(){
		System.out.println("난 확장 생산자!!");
		attack1();
	}
	private void attack1() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Extends1 e = new Extends1();
		System.out.println(e.age);
	}
}
