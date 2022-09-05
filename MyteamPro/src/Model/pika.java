package Model;

public class pika extends Poketmon{
	
	public pika (String name) {
		this.name = name;	
		System.out.println("   !..                     ..      \n"
				+ "   JBPJ^                ^7YP^      \n"
				+ "   :5B#B5^           .7PB##Y      .\n"
				+ "     ~YGBB?!J55555Y??GBBPJ~.:~7J5P!\n"
				+ "       .7GBBBBBBBBBBBBP!!?YPBBBBBB:\n"
				+ "        7BPGBBBBBBBBPGB5BBBBBBBBBY \n"
				+ "        JB^7YBBBBBGJ~!BPBBBBBGP5J: \n"
				+ "        JY55GBGGGGBGPP5JPBY^:.     \n"
				+ "        ~7?BBBGGGGGBG77!5BGJ:      \n"
				+ "         ?PGBBBBBBBBG5JGBGBGY:     \n"
				+ "        ^GBGGBGGGBBGGBB5P?^.       \n"
				+ "       ~GBBBBBPBBPGBBBBG7.         \n"
				+ "    . !BBBBBBBPGB5BBBBGGG^         \n"
				+ "    ?5PBPPBBBBPPPPBBBB5BBY?!       \n"
				+ "    .!YPG5PBBBPYYPBBBYPG5Y~.       \n"
				+ "      .!?!!?5Y!::?P577J?^ ");
		
		System.out.println(name + "등장! 피카피카!!");
		
	}
	
	@Override
	public void skill1(){
		System.out.println("     :7~~~~~~~~~7^     7.    :!  .J.      .?.     \r\n"
				+ "     !?         ??     57~!!~?J  .5.      :G:     \r\n"
				+ "     :!~~~~?~~~~7:     5^    !Y  .P7!:    :G:     \r\n"
				+ "    ^^^^^^~Y~^^^^^^    77~~~~7~  .Y.      .5.     \r\n"
				+ "                                          .J      \r\n"
				+ "     !?.::::::::?7     .^^^^^^^^^~Y.              \r\n"
				+ "     ~J         ?!               .5.      ^Y:     \r\n"
				+ "      .::::::::::                 ^        :    ");
		System.out.println("몸통 박치기!");
	}
	
	@Override
	public void skill2(){
		System.out.println(
				"    .Y:    J~  .Y.    .::::J! ~Y  5^     :G:\r\n"
				+ "    .Y~~~~~J!~~!Y.         77 ~Y  5^     :G:\r\n"
				+ "    .Y.    J~   Y.         ?! ~Y.:5^     :P.\r\n"
				+ "     !!!!!!!.  .Y.        .Y: ~5~~5^     .Y\r\n"
				+ "     .~        .J.       :?~  ~Y  5^       \r\n"
				+ "     :Y.              ^~77:   ~Y  5^     .^.\r\n"
				+ "      7!!!!!!!!!!:    ::.     ^J  J:     ^Y:");
	}
}
