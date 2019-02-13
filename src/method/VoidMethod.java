package method;

public class VoidMethod {

	static void test(int sNum, int eNum) {
		for(int i=sNum;i<=sNum;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		test(10,30);
	}
}
