package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}

		}
		Scanner scan = new Scanner(System.in);
		System.out.println("numList : " + numList);
		while(sCnt!=3) {
			sCnt = 0;
			bCnt = 0;
			System.out.println("번호 입력 : ");
			String[] numStr = scan.nextLine().split(",");
			int[] nums = new int[3];
			for(int i=0;i<numStr.length;i++) {
				nums[i] = Integer.parseInt(numStr[i]);
			}
				
			}
		
			
		int[] nums = new int[] { 1, 2, 3 };
		int bCnt = 0;
		int sCnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (numList.indexOf(nums[i]) != -1) {
				if (i == numList.indexOf(nums[i]))
					;
				sCnt++;
			} else {
				bCnt++;

			}
		}
		if (sCnt + bCnt == 0) {
			System.out.println("아웃!");
		} else {
			System.out.println(sCnt + "S, " + bCnt + "B");
		}
		}
	
	}
