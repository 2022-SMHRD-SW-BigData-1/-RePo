package View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controller.DAO;
import Controller.MusicPlayer;
import Model.Music;
import Model.Poketmon;
import Model.PoketmonVO;
import Model.WrongVO;
import Model.gameProcessVO;
import Model.kkobugi;
import Model.pairi;
import Model.pika;

public class PoketmonMain {

	public static void main(String[] args) {
		System.out.println(
				"========================================================================================================================");
		System.out.println(
				"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&5?7G@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
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

		System.out.println(
				"====================================================???POKETMON QUIZ???====================================================");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		MusicPlayer player = new MusicPlayer();
		String id = null;
		Music m = null;
		Poketmon pm = null;
		int replay = -1;

		// ???????????? ??????
		while (true) {
			m = player.play(0);
			System.out.print("[1]???????????? [2]????????? [3]???????????? [4]???????????? [5]???????????? [6]?????? >> ");
			int menu = sc.nextInt();
			System.out.println();

			// [1]????????????
			if (menu == 1) {
				int rank = 0;
				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PassWord : ");
				String pw = sc.next();
				int score = 0;
				dao.join(rank, id, pw, score);
			} // while??? ????????????

			// [2]?????????
			if (menu == 2) {
				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PassWord : ");
				String pw = sc.next();
				boolean res = dao.login(id, pw);
				if (res == true) {
					System.out.println("????????? ??????");
				} else {
					System.out.println("????????? ??????");
				}
			} // while??? ????????????

			if (menu == 3) {
				System.out.println(
						"       .^7?JYYY5YYYJ?7^.                 :~7?JYYYYYYJ7!^.                 :~?JYYYYYY5YYJ7~.         \n"
								+ "     :~~~~7YYYYYYYYYYYYY?^            .^~!!?YYYYYYYYYYYYJ7^            .^~~~~7YYYYYYYYYYYYY?^       \n"
								+ "   ^!:     7YYYYYYYYYYYYYYJ~        .!^.    ~YYYYYYYYYYYYYYJ~         ~~.     ?YYYYYYYYYYYYY5J^     \n"
								+ "  7J      ^JYYYYYYYYYYYYYYY5?      ~Y.     .?YYYYYYYYYYYYYYY5?.     .J?      ~YYYYYYYYYYYYYYYY57    \n"
								+ " ?5J~:.:~7YYYYY5PPP5PP5YYYYY5J    ~5Y~...:!JYYYYY5PPPPP5YYYYY5J    .J5J~::^!?YYYYY5PP55PP5YYYYY5?   \n"
								+ "!5YYYYYYYYY555PPY!^^~7PPYYYYY57  :5YYYJJJYYYYYY5P57~^!?PPYYYYY57   75YYYYYY555555PP?~::~7PPYYYYY5!  \n"
								+ "YYY555PPPPPPPPP5^.   :7PP555YY5. ?YYY555PPPPPPPPP~.   :!PP555YY5. .5YY555PPPPPPPPPY:    :JPPP555YY  \n"
								+ "GGPPPPPP55YYYJ5P7:...~YPPPPPPPP. YGPPPPPPP555YY5P7:. .^?PPPPPPPP^ :GGPPPPP55YYJJJ5P7^..:!5PPPPPPP5  \n"
								+ "PBP5Y?^:..    :J55YYY5Y~^~!?Y55. YBG55J!^::..  :JP5JJJ55!~!7JY5P: .GGPYY7:..     :J55YY55?::^!?J5Y  \n"
								+ "7J7777:         .^!!~:       ^7  ~Y?777^         :~77!^.      :?   7J7777:         .^~~^.       ~!  \n"
								+ " ??7777^                     7.   ??7777^                     !:   .??7777^                    .7   \n"
								+ " .??7777!:                 ^7:     ??7777!:                 .!^     .??7777!:.               .~!.   \n"
								+ "   ~??77777~:.         .:~?!.       ~??7777!~:.          .^77:        ~??77777~:.         .:!?~     \n"
								+ "    .~???77777!!~~~~~!7??!.          .~???77777!~~^^^^~!7?7^           .~???77777!!!~~~!!???~.      \n"
								+ "       :~77??????????7~:                :~7????????????7^.                :~!7?????????7!^.         \n"
								+ "           .::^^^::.                       ..:^^^^^^:.                        ..:::::..             ");

				// [3]????????????
				// ????????? ??????
				System.out.println();
				System.out.println("===============????????? ????????? ??????===============");
				System.out.println();
				System.out.print("[1] ????????? | [2] ????????? | [3] ?????????");
				System.out.println();
				System.out.print("???????????? ???????????? ");
				int poketchoice = sc.nextInt();
				System.out.println();
				if (poketchoice == 1)
					pm = new pika("?????????");
				else if (poketchoice == 2)
					pm = new kkobugi("?????????");
				else if (poketchoice == 3)
					pm = new pairi("?????????");

				// ????????? ??????
				System.out.println();
				System.out.println("===============?????? ????????? ??????===============");
				System.out.println();
				System.out.print("[1] Eazy | [2] Normal | [3] Hard");
				System.out.println();
				System.out.print("???????????? ???????????? ");
				int nanchoice = sc.nextInt();
				System.out.println();
				System.out.println("========????????? ???????????? " + nanchoice + "!!!========");

				// ???????????? ????????? ??????
				int stage = 1; // ??????
				int score = 0;
				// 1?????? ?????? - ?????? ??????
				m = player.play(1);
				System.out.println("                7G!. ~?          \n" + "                 .5#BGPBP          \n"
						+ "                 P##BB##G:         \n" + "          :J?.   !GBPPBB5:         \n"
						+ "          .JGJ!!:JYJPY5Y:          \n" + "        7Y7YPPPBBPBGBGGJ.          \n"
						+ "  ~77?7^^!::~~:^^:5BBBGPJ~:        \n" + " :J: .~J7.         !GGGJ:~7Y7      \n"
						+ " ^J.   :JJ~       .~PGGP?: .?5~    \n" + "  ?!    :JY?^.  .?B##B5Y55J:.PPY^  \n"
						+ "  .?7:   ^JYYJ7!P&####YJYY5P^7^55^ \n" + "   .?5J!: :?YYY5#BBGBPJJJJ5Y.  .   \n"
						+ "     !YP5?: ^7?YBGPPYJJJY5?.       \n" + "      .!JY7   ^PP!^^::.PP:         \n"
						+ "         .   ~GG^     ~G5.         \n" + "            ~BG:     ~PY5Y!^^^.    \n"
						+ "          .?##GY.     . .!JJY?^    \n" + "          YGJ?JY^                  \n"
						+ "			");
				System.out.println();
				System.out.println("[???????????? 1!] ????????????[???!???!] ??????!????????????");
				score = fight(pm, id, nanchoice, stage, score);
				ArrayList<PoketmonVO> list = new ArrayList<PoketmonVO>();
				// 1?????? ??????
				if (score >= 200) {
					stage++;
				} else {
					m = player.play(3);
					System.out.println("          .~JBBBBBBBP?:     :?GBBBBP7.   ^YBBB5^ .~GBBGY.^YBBBBBBBBB#GJ         \n"
							+ "         ^Y#@@&BYY&@@@B?..^JB@@B5Y#@&G7. ~P@@@&P?7G@@@&P.^P@@@BJ~~~~!~^         \n"
							+ "         ~G@@@G~ .^????! ~P@@@G~ .!#@@&5.~P@@@&@@@@@@@&5.^5@@@#5JJJJ?^          \n"
							+ "         ~P@@@G!^7!!!!~^ ~P@@@BJ!7Y&@@&5.~P@@@5Y5Y?&@@&5.^5@@@&GPPPPY!          \n"
							+ "         ~G@@@G7?B#@@@&5.~P@@@&#BB#@@@&5.~P@@@G~ .!#@@&5.^5@@@G~                \n"
							+ "         ~P@@@#Y!!G@@@#Y.~P@@@G~ .7#@@&5.~P@@@G! .!#@@&5.^5@@@B7.......         \n"
							+ "          :?G@@@&&@@&5!. ~P@@@G~ .7#@@&5.~5@@@G! .!#@@&5.^5@@@@&####&BJ         \n"
							+ "            .^^^^^^^:.   .:^^^:.  .:^^^: .:^^^:.  .:^^^: .:^^^^^^^^^^^:         \n"
							+ "            .^^^^^^^:.    .^^^:: .:^^^:  .:^^^^^^^^^^:. .:^^^^^^^^^:            \n"
							+ "          :?G@@@&&@@&5!. :?@@@#J ~B@@&G:.7#@@@&######P~ ~G@@@&&&&@@#5~.         \n"
							+ "         ~P@@@#Y!!G@@@#Y..!P&@&5^Y#@&B?..7&@@&P:......  ~B@@@G~:7G@@@#J         \n"
							+ "         ~G@@@G^ .7&@@&5. .!&@@B7&@@&5  .7#@@@&BBBBGY:  ~B@@&P: ^Y@@@#Y         \n"
							+ "         ~P@@@G^ .7&@@&5.  :J#@&G&@#5^  .7#@@&G77777~.  ~B@@@#PPB@@&BJ^         \n"
							+ "         ~G@@@G~ .7&@@&5.   ~G@@@@@B?   .7#@@&5         ~B@@@#P#@@@#Y^          \n"
							+ "         ^Y#@@&BYY&@@&G?    .!P@@@B7.   .7&@@&G7!!!!!~. !B@@@G^:?B@@@#J         \n"
							+ "          .~JBBBBBBBP?:      ^JBBB5~    .!GBBBBBBBBBBP~ ~5BBBY: .!BBBG? ");

					do {
						System.out.print("?????????????????? ??????????????? '0'??? ??????????????? >> ");
						replay = sc.nextInt();
					} while (replay != 0);
					System.out.println(player.stop());
				}

				// 2?????? ??????
				if (stage == 2) {
					m = player.play(1); // ????????????
					System.out.println("                                   \n" + "               .                   \n"
							+ "            !5GGPY?:               \n" + "          .J##BBG5BG: ^~!!~.       \n"
							+ "          :JY5YJJ?YPY5GGGGG57.     \n" + "      .?5P5JPPPG5JY5PGGGGGP55J     \n"
							+ "      ~PY5GBBBBP5PG55GGGB#BPY5^    \n" + "       .?PGBBBGBBBGPPGP55555Y5^    \n"
							+ "      ^GBB#BBG##BB##GBBG5555YY     \n" + "     :#&#&&BP#&###BGB#BBG55Y5^     \n"
							+ "     !&&&&#PYPPGGP5GBBBGGYJPJ      \n" + "     .JPGP5Y5Y?7???JPPPG5: ~!      \n"
							+ "        .^7!~^      ?5Y?^          ");
					System.out.println();
					System.out.println("[???????????? 2!] ??????????????????[???!???!???!] ??????!??????????????????");
					score = fight(pm, id, nanchoice, stage, score);
					// 2?????? ??????
					if (score >= 600) {
						stage++;
					} else {
						m = player.play(3);
						System.out.println("          .~JBBBBBBBP?:     :?GBBBBP7.   ^YBBB5^ .~GBBGY.^YBBBBBBBBB#GJ         \n"
								+ "         ^Y#@@&BYY&@@@B?..^JB@@B5Y#@&G7. ~P@@@&P?7G@@@&P.^P@@@BJ~~~~!~^         \n"
								+ "         ~G@@@G~ .^????! ~P@@@G~ .!#@@&5.~P@@@&@@@@@@@&5.^5@@@#5JJJJ?^          \n"
								+ "         ~P@@@G!^7!!!!~^ ~P@@@BJ!7Y&@@&5.~P@@@5Y5Y?&@@&5.^5@@@&GPPPPY!          \n"
								+ "         ~G@@@G7?B#@@@&5.~P@@@&#BB#@@@&5.~P@@@G~ .!#@@&5.^5@@@G~                \n"
								+ "         ~P@@@#Y!!G@@@#Y.~P@@@G~ .7#@@&5.~P@@@G! .!#@@&5.^5@@@B7.......         \n"
								+ "          :?G@@@&&@@&5!. ~P@@@G~ .7#@@&5.~5@@@G! .!#@@&5.^5@@@@&####&BJ         \n"
								+ "            .^^^^^^^:.   .:^^^:.  .:^^^: .:^^^:.  .:^^^: .:^^^^^^^^^^^:         \n"
								+ "            .^^^^^^^:.    .^^^:: .:^^^:  .:^^^^^^^^^^:. .:^^^^^^^^^:            \n"
								+ "          :?G@@@&&@@&5!. :?@@@#J ~B@@&G:.7#@@@&######P~ ~G@@@&&&&@@#5~.         \n"
								+ "         ~P@@@#Y!!G@@@#Y..!P&@&5^Y#@&B?..7&@@&P:......  ~B@@@G~:7G@@@#J         \n"
								+ "         ~G@@@G^ .7&@@&5. .!&@@B7&@@&5  .7#@@@&BBBBGY:  ~B@@&P: ^Y@@@#Y         \n"
								+ "         ~P@@@G^ .7&@@&5.  :J#@&G&@#5^  .7#@@&G77777~.  ~B@@@#PPB@@&BJ^         \n"
								+ "         ~G@@@G~ .7&@@&5.   ~G@@@@@B?   .7#@@&5         ~B@@@#P#@@@#Y^          \n"
								+ "         ^Y#@@&BYY&@@&G?    .!P@@@B7.   .7&@@&G7!!!!!~. !B@@@G^:?B@@@#J         \n"
								+ "          .~JBBBBBBBP?:      ^JBBB5~    .!GBBBBBBBBBBP~ ~5BBBY: .!BBBG? ");

						do {
							System.out.print("?????????????????? ??????????????? '0'??? ??????????????? >> ");
							replay = sc.nextInt();
						} while (replay != 0);
						System.out.println(player.stop());
					}

				}

				// 3?????? ??????
				if (stage == 3) {
					m = player.play(1); // ????????????
					System.out.println("         /!                        \n" + "       .5BB7                       \n"
							+ "       YBGBG~                      \n" + "      JBBGBG5~                     \n"
							+ "     JBBBBGP5J7:                   \n" + "    ?GPBBP5PG5PYJ!:                \n"
							+ "   .5PPPYPGGGP555PPY?~:            \n" + "   ^BGBPGGP555555555PG?            \n"
							+ "   ^GB5GBBBG5Y555555Y^             \n" + "    ~?JPPGGPY5555555!              \n"
							+ "      ^?YYYY555555555?:            \n" + "       .!5P555PP5555555!.          \n"
							+ "         .!Y5Y5PPPPP55YJ5?:        \n" + "            :^^!7?JYYJJJJJJJ~:.    \n"
							+ "                   :^!!77????J!    \n" + "                        .....     ");
					System.out.println();
					System.out.println("[???????????? 3!] ????????????????????????[???!???!???!] ??????!????????????????????????");
					score = fight(pm, id, nanchoice, stage, score);
					
					// 3?????? ??????
					if(score >= 1200) {
						m = player.play(2);
						System.out.println("............     ....     ......            .......      .....   ...............\r\n"
								+ "...........:~~!~^.   !!!~^. .. .^!!!!!!!!!!^. .....:!~!!~     :!!~:  ............\r\n"
								+ "..........^?5Y?JJ7   JJJJ??!..^:7?JJJ???JJJJ7~: ..~J5J?JJ    JJJJ??^............\r\n"
								+ "..........^?J????JJ  ???7?J5::?J?????7YYJ7????Y^ .~JJ????    ????7JY............\r\n"
								+ "...........^!7?????  ?7?J5Y!.:???????    !???7Y~ .~??????    ????7JJ............\r\n"
								+ "........... .^!7?????7JYJ!. .:???????    !???7Y~ .~??????    ????7JJ............\r\n"
								+ "...............!?????7Y7. ...:???????    7???7Y~ .~??????    ????7JJ............\r\n"
								+ "...............!?????7Y7 ....:7???????JJJ???7?Y~ .!???????JJ????77JJ............\r\n"
								+ "...............!?????JY7 .....~7????????????Y5J^ .:!7???????????JYY7............\r\n"
								+ "................^7JJJJ7:...... .~?JJJJJJJJJJJ~. .. .:!JJJJJJJJJJJ7: ............\r\n"
								+ "................  ....  ...   .. .....    ... ....    ............ .............\r\n"
								+ "................:::::.  .. :^:.  ....:::^:.  ....:::^^:. . :^^:. ...............\r\n"
								+ "..............:!YY?JJ?!^..!?JJ?!^..:!YY?JJ?!~...~J5?JJ?!~.!?JJ?!~...............\r\n"
								+ "..............^?JJ?????5::??????5^ :?Y?????75~ :7Y?????757!????75! .............\r\n"
								+ "..............^??????7?Y:.7????7Y^ :???????7Y~ :7???????J7!????7Y! .............\r\n"
								+ "..............^?????????7!?????7Y^.:???????7Y~ :7????????J?????7Y! .............\r\n"
								+ "..............^??????????J?????7Y^ :???????7Y~ :7??????7???????7Y! .............\r\n"
								+ "..............^????????7???????7Y^ :???????7Y~ :7??????7Y?7????7Y! .............\r\n"
								+ "..............^??????7JYY?7???7?Y^ :7?????7?Y~ :7?????7?Y7!???7?Y! .............\r\n"
								+ "...............^?YYYYYY7:.^7JYYY7: .^7JYYYYY?^ .^!JYYYYY?^:!JYYY?^ .............\r\n"
								+ "............... .:^:^::  . .:^::.... .::::::. ....::::::.  ..:::. ..............\r\n"
								+ ".................      ......   .......     .......     .....   ................");
					} else {
						m = player.play(3);
						System.out.println("          .~JBBBBBBBP?:     :?GBBBBP7.   ^YBBB5^ .~GBBGY.^YBBBBBBBBB#GJ         \n"
								+ "         ^Y#@@&BYY&@@@B?..^JB@@B5Y#@&G7. ~P@@@&P?7G@@@&P.^P@@@BJ~~~~!~^         \n"
								+ "         ~G@@@G~ .^????! ~P@@@G~ .!#@@&5.~P@@@&@@@@@@@&5.^5@@@#5JJJJ?^          \n"
								+ "         ~P@@@G!^7!!!!~^ ~P@@@BJ!7Y&@@&5.~P@@@5Y5Y?&@@&5.^5@@@&GPPPPY!          \n"
								+ "         ~G@@@G7?B#@@@&5.~P@@@&#BB#@@@&5.~P@@@G~ .!#@@&5.^5@@@G~                \n"
								+ "         ~P@@@#Y!!G@@@#Y.~P@@@G~ .7#@@&5.~P@@@G! .!#@@&5.^5@@@B7.......         \n"
								+ "          :?G@@@&&@@&5!. ~P@@@G~ .7#@@&5.~5@@@G! .!#@@&5.^5@@@@&####&BJ         \n"
								+ "            .^^^^^^^:.   .:^^^:.  .:^^^: .:^^^:.  .:^^^: .:^^^^^^^^^^^:         \n"
								+ "            .^^^^^^^:.    .^^^:: .:^^^:  .:^^^^^^^^^^:. .:^^^^^^^^^:            \n"
								+ "          :?G@@@&&@@&5!. :?@@@#J ~B@@&G:.7#@@@&######P~ ~G@@@&&&&@@#5~.         \n"
								+ "         ~P@@@#Y!!G@@@#Y..!P&@&5^Y#@&B?..7&@@&P:......  ~B@@@G~:7G@@@#J         \n"
								+ "         ~G@@@G^ .7&@@&5. .!&@@B7&@@&5  .7#@@@&BBBBGY:  ~B@@&P: ^Y@@@#Y         \n"
								+ "         ~P@@@G^ .7&@@&5.  :J#@&G&@#5^  .7#@@&G77777~.  ~B@@@#PPB@@&BJ^         \n"
								+ "         ~G@@@G~ .7&@@&5.   ~G@@@@@B?   .7#@@&5         ~B@@@#P#@@@#Y^          \n"
								+ "         ^Y#@@&BYY&@@&G?    .!P@@@B7.   .7&@@&G7!!!!!~. !B@@@G^:?B@@@#J         \n"
								+ "          .~JBBBBBBBP?:      ^JBBB5~    .!GBBBBBBBBBBP~ ~5BBBY: .!BBBG? ");
					}
					do {
						System.out.print("?????????????????? ??????????????? '0'??? ??????????????? >> ");
						replay = sc.nextInt();
					} while (replay != 0);
					System.out.println(player.stop());
				}
			}  // while??? ????????????

//-----------------------------------------------------------------------------------------------------------------------------------------------

		// [4]????????????
		if (menu == 4) {
			System.out.println();
			System.out.println("=============================?????? ??????=============================");
			ArrayList<PoketmonVO> rank = dao.rank();
			for (int i = 0; i < rank.size(); i++) {

				String id_rank = rank.get(i).getId();
				int score_rank = rank.get(i).getScore();
				System.out.println("??????: " + (i + 1) + "\t ID : " + id_rank + "\t Score : " + score_rank);
			}
		} // while??? ????????????

		// [5]????????????
		if (menu == 5) {
			System.out.print("????????? ?????? : ");
			String id2 = sc.next();
			ArrayList<WrongVO> wrong = dao.showwrong(id2);
			for (int i = 0; i < wrong.size(); i++) {

				int wrongNo = wrong.get(i).getNo();
				String wrongAnswer = wrong.get(i).getAnswer();
				String wrongWord = wrong.get(i).getWord();

				System.out.println(wrongNo + "\t" + wrongAnswer + "\t" + wrongWord + "\t");
			}
			System.out.println("?????? ?????? ??????!");
		} // while??? ????????????

		// [6]????????????
		if (menu == 6) {
			System.out.println("?????? ??????!");
			System.out.println(player.stop());
			break;
		} // while??? ????????????

	} // while??? ???

	}

	public static int fight(Poketmon pm, String id, int nanchoice, int stage, int score) {

		MusicPlayer player = new MusicPlayer();
		DAO dao = new DAO();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<gameProcessVO> list = dao.select(nanchoice); // ????????? ???????????? ?????? ????????? ?????? ??????

		int damage = 10; // ???????????? ?????????
		int skillDamage = 0; // 2?????? ????????? ?????? ????????? ?????????
		int skillGauge = 0;
		int bossHP = 30;
		int life = 3;

		// 2??????, 3?????? ?????? ??????
		if (stage == 2) {
			bossHP = 60;
			skillDamage = 20;
			skillGauge = 0;
			
		} else if (stage == 3) {
			bossHP = 90;
			skillDamage = 30;
			skillGauge = 0;
			
		}
		
		// ???????????? ??????
		while (bossHP > 0) {
			// ?????? ??????
			int index = rd.nextInt(list.size());

			String answer = list.get(index).getAnswer();   // ?????? ??????
			String word = list.get(index).getWord();	 // ?????? ??????????????? ???	
			System.out.println();
			System.out.println("?????????????????????????????????????????? : " + answer);

			// ??? ??????
			System.out.println();
			System.out.print("???????????? >>>> ");
			String input = sc.nextLine();
			System.out.println();
			
			// ??????
			if (input.equals(word)) {
				score += 100; // ?????? +100
				skillGauge += 10; // ??????????????? +10
				
				// ???????????? ?????????
				if (stage == 2 && skillGauge == 30) { // 2???????????? ??????????????? 20??? ?????? ??????1 ??????
					pm.skill1();
					bossHP -= skillDamage;
				} else if (stage == 3 && skillGauge == 40) { // 3???????????? ??????????????? 30??? ?????? ??????2 ??????
					pm.skill2();
					bossHP -= skillDamage;
				} else { // ??? ????????? ????????????
					bossHP -= damage;
				}
				System.out.println();
				System.out.println(""
						+ "NN   N  II   CCCCC  EEEEE  !!!! \n" 
						+ "N N  N  II  CC      E      !!!  \n"
						+ "N  N N  II CC       EEEEE  !!!  \n"
						+ "N   NN  II  CC      E           \n"
						+ "N    N  II   CCCCC  EEEEE  !!   \n");
				if (bossHP <= 0) {	// ?????? ?????????
					System.out.println("?????? ?????? : 0");
					System.out.println("?????? ?????? : " + life);
					System.out.println("?????? : " + score);
					dao.totalscore(score, id);
					break;
				} else {
					System.out.println("?????? ?????? : " + bossHP);
					System.out.println("?????? ?????? : " + life);
					System.out.println("?????? : " + score);
					dao.totalscore(score, id);
				}
			}

			// ??????
			else {
				life--;
				score -= 50;
				
				System.out.println("\n"
						
				+ "      ~!!!!!:       !!!! \r\n"
				+ "     7^    .7^   ^!!!!!!!!! \r\n"
				+ "    .?      ^!    ~~   !!:\r\n"
				+ "     ~!:..:^7.   .?^   :7!\r\n"
				+ "      .^~~~^       ^~!!~:  \r\n"
				+ "                .!~?!~~!J!~\r\n"
				+ "    ^~~~~~~~~~.    J.  :?     ^7    :?.    ?:\r\n"
				+ "    .:::::::::.   :~   .~     :^    .~     ~."); 
						
						
				System.out.println("?????? ?????? : " + bossHP);
				System.out.println("?????? ?????? : " + life);
				System.out.println("?????? : " + score);
				dao.Wrong(stage, word, answer, id); // ?????? ??????
				dao.totalscore(score, id);
				
				// ?????? ?????? ????????? ???
				if (life == 0) {
					System.out.println();
					break;
				}
			}
			System.out.println();
		}
		
		
		return score;
	}
}
