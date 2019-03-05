package oop.inter;

public class Execute {
	public static void main(String[] args) {
		Work w = new Developer();
		w.goOffice();
		w.working();
		w.goHome();
		w.eat();
		
		w = new Manager();
		w.goOffice();
		w.working();
		w.goHome();
		w.eat();
		
	}

}
