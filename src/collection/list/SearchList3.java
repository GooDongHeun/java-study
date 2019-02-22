package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[] args) {
	ArrayList<Integer> numList = new ArrayList<>();
	
	for(int i=0;i<6;i++) {
		int  random = (int)(Math.random()*45)+1;
		numList.add(random);
	}
	Scanner scan = new Scanner(System.in);
	System.out.println(", 입력");
	String strNum = scan.nextLine();
	

	}
}