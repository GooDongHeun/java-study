package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {
	private static String strNum;
	private static int num;

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<5;i++) {
			int ranNum = (int)(Math.random()*20)+1;
					numList.add(ranNum);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("맞출번호를 ,를 기준으로 입력해주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
		for(int i=0;i<strNums.length;i++) {
			int num = Integer.parseInt(strNums[i]);
			//Integer.parseInt = String을 int로 변환함
			anList.add(num);
			
	}
		int nums = 0;
		for(int i=0;i<anList.size();i++) {
		int anNum = anList.get(i);
		if(numList.indexOf(anNum)!=-1) {
			num++;
		}
		System.out.println("numList : " + numList);
		System.out.println("anList : " + anList);
		System.out.println("맞춘 갯수 : " + num);
		//물리계층->데이터링크계층->네트워크계층->전송계층->세션계층->표현계층->응용계층
		//osi7계층
	}

	}
}

