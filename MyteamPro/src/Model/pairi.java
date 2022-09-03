package Model;

public class pairi extends Poketmon{
	
	public pairi(String name) {
		this.name = name;
		System.out.println("                                        \n"
				+ "          ^7?JJ?!.                      \n"
				+ "        .JP555Y55?:                     \n"
				+ "        :?YYYYYY7~7:                    \n"
				+ "        :!YYYYYY!^7!                    \n"
				+ "       .JYY5YYYYJ7?7          .:        \n"
				+ "        :!7?JJJ?77?:         .!J.       \n"
				+ "          ^7?JJ??J?!^:.      7JYY^      \n"
				+ "      .~!JYYYGGGPYY55YY??~  ?G5P#?      \n"
				+ "      :?J?7JB####B5YJJ77~:  !GBGP~      \n"
				+ "           ?#BBBB#B5YY^      :Y!:       \n"
				+ "          .?#####B#GY5Y~   .^JJ         \n"
				+ "         75YPBBB##B5YYYY77?J5Y:         \n"
				+ "        .55YJJ5PGGGY5YYYJJJ7~           \n"
				+ "        ~YYJ?7:.:^~^~JYJJ^              \n"
				+ "       .!7~:.        :7YY7.             \n"
				+ "                       .                ");
		System.out.println(name + "등장! 파이리~!!");
	}
	
	public void skill1(){
		System.out.println("몸통 박치기!");
	}
	public void skill2(){
		System.out.println("불꽃 뿜기!");
	}
}
