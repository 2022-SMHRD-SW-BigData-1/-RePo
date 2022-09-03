package View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controller.DAO;
import Model.Poketmon;
import Model.PoketmonVO;
import Model.WrongVO;
import Model.gameProcessVO;
import Model.kkobugi;
import Model.pairi;
import Model.pika;

public class PoketmonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		String id = null;

		System.out.println(
				"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&5?7G@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@P7!??7Y&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@G?!?5GPY77G@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@@@@@@@@@@@&#BP5GYYG&@@@@@@BJ!75GP5JJYPB@@@@@@@@@&BBBBBBBB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@&#GPYYJJ????JJY5B&@@@@@@@@@&#BP5J???77!^!77?5#@@#7~!7?J77JP#@@@&5JJJJJJJ777????77&@@@@@@&GGB#&&@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@#GYJ???JYY5555555YJ?7?YB@@@@@@J~!7?YY5PPY77!JPPY?7JGB7~!7????????YGJ^!7Y5555J77PGGP?!G@@@@@&!^!7???JJY5PG&&&&@@@@@@@\r\n"
						+ "&G5?7?J5PGGGGGGGGGGGGGGGPY775@@@@@7^!7JJPGGG5775GGGGP5?77?Y5GGPPGGPPYJ77!77GGGGG5?JGGGPY7J@@@@@@7~77Y5P55YJ777!7?JY5PGB#\r\n"
						+ "Y^~!75BGGGGGGGGGGGGPPGGGGG5?!P@@@@Y7!~!75GGG5YPGGGGGPY77YGGGYJY??YGGPJ7!77JGGGGGPJ5GGGG577#@#BGP7~~!75GGGGPJ7!!JP5YYJ7!5\r\n"
						+ "&Y~~!7YGGGGGGGGGG577?7?PGGPJ!Y&BP5YY7~!7YGGGGGGGGGPJ??7?GGG??#PJ5GPJ77!~!7PGGGGGGPGGGGGPJ7JJ?J?JJJ?77YGGGGG5777PGGGGY7J@\r\n"
						+ "@@G!~77?J?JGGGGGGP?7BP!JGGP777?JYYY55YJ7?PGGGGGGPJ77PP!JGGGY?JYGPJ?JYJ?77?PGGGGGGGGGGGG577YPYJ5GGGP5J7JGGGGPJ!JGGGG577#@\r\n"
						+ "@@@#?!!!!!7YGGGGGG57?J?PGP?7?5G5?JGGGPP5J75GGGGGPYYJ??775GGGPGGG5PGGGGPJ77JGGG5PGGGGGG57?GGY77YPPYJGPJ!5GGGGY?PGGGP?!G@@\r\n"
						+ "@@@@&GBG~~!7YGGGGGG5JPGPY77JGGP?!7Y5Y?PG577GGGPGGGGGGPY?7J5GGGGGGGGPPY?775GGGP?7PGGJPP?7PGG5J?777?PGGJ!5G5GGP5GGGGJ!5@@@\r\n"
						+ "@@@@@@@@G~~!7YGGGGGGG5J7!77GGGG5J?7?J5GG57?GG577?Y5PGGGPYJ????JJ??777~~7JBGGG577?PY!YP?7PGGGGPPPGGGGY7JG5JGGGGGGGY7?&@@@\r\n"
						+ "@@@@@@@@@G^^!7YGGGGG5?7!~!7PGGGGGGGGGGGP?75GG577~~~!?J5PGGGP5Y77?J5BJ:~7?YY55J7!7777?PY775GGGGGGGGPJ7YGGJ?GGGGGG577#@@@@\r\n"
						+ "@@@@@@@@@@P^^!7YGGGGPY77~~!?5GGGGGGGGPY77JBGG57?BPJ7~~~!7JYPG577#@@@Y7?7!!!!!77^~7!!7PG5J??JYYYJJ77?GGGP??GGGGGP?!G@@@@@\r\n"
						+ "@@@@@@@@@@@P^^!7YGGGG5?7?7^~!?JY55YJ?7!~7?55YJ77@@@@#GY?!~~!7?77#@@@@@@@&&#BB#&Y5!^~!?JJYJ?7!?YY^~7?PPPY7?GGGGGJ!Y@@@@@@\r\n"
						+ "@@@@@@@@@@@@5^^!7YGGGG577BG?!~~~~!7JG#~:!7777?YG@@@@@@@@&B5J!~~?&@@@@@@@@@@@@@@@@GJ??7!!!!!!7#@G^~!!!!!77?GGGG57?&@@@@@@\r\n"
						+ "@@@@@@@@@@@@@5:^!7YGGPY?!J@@@&###&@@@@BB##&&@@@@@@@@@@@@@@@@@#B&@@@@@@@@@@@@@@@@@@@@@@&&#BGG#@@@&##BGP~^!7Y5P577B@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@5:^!77777?JG@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Y7!!~~!!!P@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@Y^7J5PB#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&#GPYYB@@@@@@@@@");
		System.out.println();
		System.out.println();
		System.out.println(
				"========================================================================================================================");

		System.out.println();
		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]게임시작 [4]랭킹조회 [5]오답조회 [6]종료 >> ");
			int menu = sc.nextInt();
			
			//오박사 등장

			if (menu == 1) { // 회원 가입

				int rank = 0;
				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PassWord : ");
				String pw = sc.next();
				int score = 0;
				int cnt = dao.join(rank, id, pw, score);
				if (cnt > 0) {
					System.out.println("등록 성공");
				} else {
					System.out.println("등록 실패");
				}

			}
			System.out.println();
			System.out.println("========================================================================================================================");
			
			if (menu == 2) { // 로그인

				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PassWord : ");
				String pw = sc.next();
				boolean res = dao.login(id, pw);
				if (res == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
			}
			System.out.println();
			System.out.println("========================================================================================================================");
			
			if (menu == 3) {
				// 게임 시작
				// 포켓몬 선택
				System.out.println("===============파트너 포켓몬 결정===============");
				System.out.println();
				System.out.print("[1] 피카츄 | [2] 꼬부기 | [3] 파이리");
				System.out.println();
				System.out.print("선택하기 ▷▶▷▶ ");
				int poketchoice = sc.nextInt();
				System.out.println();

				Poketmon pm = null;

				if (poketchoice == 1)
					pm = new pika("피카츄");
				else if (poketchoice == 2)
					pm = new kkobugi("꼬부기");
				else if (poketchoice == 3)
					pm = new pairi("파이리");

				System.out.println("===============전투 난이도 결정===============");
				System.out.println();
				System.out.print("[1] Eazy | [2] Normal | [3] Hard");
				System.out.println();
				System.out.print("선택하기 ▷▶▷▶ ");
				int nanchoice = sc.nextInt();
				System.out.println();

				System.out.println("========선택한 난이도는 " + nanchoice + "!!!========");

				int stage = 1; // 단계
				int damage = 10; // 기본공격 데미지
				int skillDamage = 20; // 2단계 시작시 생길 스킬의 데미지
				int skillGauge = 0;
				int bossHP = 10;
				int score = 0;
				int life = 3;
				int no = 1;

				score = fight(no, id, nanchoice, stage, skillDamage, bossHP, score, skillGauge, life);

				if (score > 0) {
					stage++;

					System.out.println("스테이지 2");
				}
				no++;

				if (stage == 2) {
					skillDamage = 20; // 2단계 시작시 생길 스킬의 데미지
					skillGauge = 0;
					bossHP = 10;
					score = fight(no, id, nanchoice, stage, skillDamage, bossHP, score, skillGauge, life);
					stage++;
					System.out.println("스테이지 3");

				}
				no++;
				if (stage == 3) {
					score += score;
					skillDamage = 30; // 2단계 시작시 생길 스킬의 데미지
					skillGauge = 0;
					bossHP = 10;
					score = fight(no, id, nanchoice, stage, skillDamage, bossHP, score, skillGauge, life);
					stage++;

					dao.totalscore(score, id);

				}

			}
//-----------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println();
			System.out.println("========================================================================================================================");
			
			if (menu == 4) { // 랭킹 조회

				System.out.println("=============================랭킹 조회=============================");
				ArrayList<PoketmonVO> rank = dao.rank();
				for (int i = 0; i < rank.size(); i++) {

					String id_rank = rank.get(i).getId();
					int score_rank = rank.get(i).getScore();
					System.out.println("순위: " +(i+1) + "\t ID : "+id_rank+"\t Score : "+score_rank);
				}
				
			}
			System.out.println();
			System.out.println("========================================================================================================================");
				
				if (menu == 5) { // 오답 조회
					System.out.print("아이디 입력 : ");
					String id2 = sc.next();
					ArrayList<WrongVO> wrong = dao.showwrong(id2);
					for (int i = 0; i < wrong.size(); i++) {

						int wrongNo = wrong.get(i).getNo();
						String wrongAnswer = wrong.get(i).getAnswer();
						String wrongWord = wrong.get(i).getWord();

						System.out.println(wrongNo + "\t" + wrongAnswer + "\t" + wrongWord + "\t");
					}
					System.out.println("오답 조회 완료!");
				}
				
				
				if (menu == 6) { // 프로그램 종료
					System.out.println("게임 종료!");
					break;
				}
			}
		

	}

	public static int fight(int no, String id, int nanchoice, int stage, int skillDamage, int bossHP, int score,
			int skillGauge, int life) {

		DAO dao = new DAO();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		ArrayList<gameProcessVO> list = dao.select(nanchoice);
		while (bossHP > 0) {
			int index = rd.nextInt(list.size());

			String answer = list.get(index).getAnswer();
			String word = list.get(index).getWord();

			System.out.println("문제 : " + answer);

			// 답 입력
			System.out.print("정답입력 : ");
			String input = sc.nextLine();
			// 정답

			if (input.equals(word)) {
				score += 100;
				bossHP -= 10;
				skillGauge += 10;
				System.out.println("몸통박치기!!");

				if (stage == 2 && skillGauge == 30) {
					System.out.println("스킬1 사용!!");
					bossHP -= 10;

				} else if (stage == 3) {
					if (skillGauge == 40) {
						System.out.println("스킬2 사용!!");
						bossHP -= 20;
					}
					if (bossHP == 0) {
						System.out.println("YOU WIN");
						System.out.println();
						break;
					}
				}
				if (bossHP <= 0) {

					System.out.println("보스체력 : 0");
				} else {
					System.out.println("보스체력 : " + bossHP);
				}
				System.out.println("점수 : " + score);
			}
			// 오답
			else {
				life--;
				score -= 50;
				System.out.println("남은목숨 : " + life);
				System.out.println("어휴..");
				System.out.println("점수 : " + score);

				int cnt = dao.Wrong(no, word, answer, id);
				no++;
				if (cnt <= 0) {
					System.out.println("오답 저장 실패");
				}

				if (life == 0) { // life가 0이면 게임 오버 출력 후 초기화면
					System.out.println("GAME OVER");
					break;
				}
			}

			System.out.println();
		}
		return score;

	}
}
