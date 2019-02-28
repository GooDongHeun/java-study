package test;

import java.util.Scanner;

import db.board.BoardService;

public class Rkel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
		System.out.println(" ──────────────────────────");
		System.out.println("│가디세계로 오신걸 환영합니다 .    │");
		System.out.println("│아이디와 비밀번호를 적어주세요.   │");
		System.out.println("──────────────────────────★");
		
		System.out.print("ID : ");
		String id = scan.nextLine();
		if("osfu".equals(id)) {
			System.out.print("Password : ");
			String pwd = scan.nextLine();
			if("12345678".equals(pwd)) {
				Rkel_Service bs = new Rkel_Service();
			do {
			System.out.println("환영합니다. 입력해서 이동해주세요.");
			System.out.println("1. 캐릭터 생성하기");
			System.out.println("2. 캐릭터 관리하기");	
			System.out.println("3. 종료하기");
			System.out.print("번호입력 : ");
			cmd = scan.nextLine();
			
			if("2".equals(cmd)) {
				bs.selectBoard();
			}else if("1".equals(cmd)) {
				System.out.print("Characters ID : ");
				String charactersid = scan.nextLine();
				System.out.print("Power : ");
				String power = scan.nextLine();
				System.out.print("Agility : ");
				String agility = scan.nextLine();
				bs.insertBoard(charactersid,power,agility);
			}
			}while(!"q".equals(cmd));
			}else {
				System.out.println("비밀번호가 틀립니다.");
			}
		}else {
			System.out.println("아이디가 없습니다.");
		}
		}while(!"q".equals(cmd));
	}
		}
			
			
			
		
		
	










