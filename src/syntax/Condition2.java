package syntax;

public class Condition2 {
	public static void main(String[] args) {
		int a = 4;
//		String str = "a는 3이 아니다.";
//		if(a==3) {
//			str = "a는 3이다.";
//		}
		String str = (a==3)?"a는 3이다.":"a는 3이 아니다.";
		System.out.println(str);
		String s1 = "Dog";
		System.out.println(s1.toLowerCase().equals("dog"));
		System.out.println(s1.equalsIgnoreCase("dog"));
		s1.toLowerCase().equals("dog");
		String str1 = gerStr();
		System.out.println(str1);
		str1 = str1.toLowerCase();
		System.out.println(str1.toLowerCase().equals("abc"));
	}

	private static String gerStr() {
		// TODO Auto-generated method stub
		return null;
	} 

}
