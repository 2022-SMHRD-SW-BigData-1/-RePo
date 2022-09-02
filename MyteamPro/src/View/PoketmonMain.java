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
				
				// 게임 시작시 1단계 기본 세팅
				int stage = 1;		// 단계
				int difficulty = 1;    // 난이도
				int damage = 10; // 기본공격 데미지
				int skillDamage = 20;	// 2단계 시작시 생길 스킬의 데미지
				int skillGauge = 0;
				int bossHP = 100;
				int score = 0;
				int life = 3;
				
				// 문제 출력
				dao.select(difficulty);
				
				// 답 입력
				String input = sc.next();
				// 정답
				if(dao.select(difficulty) == input) {
					score += 100;
					bossHP -= 10;
					skillGauge += 10;
					if(stage >= 2 && skillGauge == 20) {
						System.out.println("스킬 사용!!");
					}
					System.out.println(bossHP);
				} 
				// 오답
				else {
					life--;
				}
					
				// 스테이지 변경
				if (bossHP == 0) {
					stage++;
				}
				if (stage == 2) {
					bossHP = 150;
				} else if(stage == 3) {
					skillDamage = 30;
					bossHP = 200;
				}
				
				// 게임 종료
				if(stage == 4) {
					System.out.println("게임 종료");
				}
			}
			if (menu == 4) { // 랭킹 조회

			} else if (menu == 5) { // 프로그램 종료
				break;
			}
		}
	
		
	}

}