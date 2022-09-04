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
		System.out.println("몸통 박치기!");
	}
	
	@Override
	public void skill2(){
		System.out.println("백만 볼트!");
	}
}
