package View;

import java.util.Scanner;

import Controller.DAO;

public class PoketmonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]게임시작 [4]랭킹조회 [5]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) { // 회원 가입 
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PassWord : ");
				String pw = sc.next();
				int cnt = dao.join(id, pw);
				if (cnt > 0) {
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}
			}
			if (menu == 2) { // 로그인
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PassWord : ");
				String pw = sc.next();
				boolean res = dao.login(id, pw);
				if (res == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
			}
			if (menu == 3) { // 게임 시작

			}
			if (menu == 4) { // 랭킹 조회

			} else if (menu == 5) { // 프로그램 종료
				break;
			}
		}
	
		
	}

}
