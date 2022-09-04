package Model;

public class kkobugi extends Poketmon{
	
	public kkobugi(String name) {
		this.name = name;
		System.out.println("           :/JJJ?!:                \n"
				+ "        :YGGGGGGGPGY~              \n"
				+ "        ~GGGGGP7?7GG5^             \n"
				+ "       75GGGGGY^^YGPJ7             \n"
				+ "      .JGGGGGGPPPGPYJ~             \n"
				+ "        ^J55PPP55YJJPJ             \n"
				+ "     :!??5P5YYYYYJYY57!:           \n"
				+ " .!7Y5YY5B#BBGGPPGGGJ?77.          \n"
				+ " :JJJJ?J###BB#BPPPPYJ5J7!          \n"
				+ "  .... ?###BB#G5YJJJP#777          \n"
				+ "       7BBBBBBBBG555BY~7~ .~?JYJ!. \n"
				+ "      ~PG##BB#BGP55557~~.!PGGGGGBJ \n"
				+ "     ^GPYYPPPPPPPGGGG5??5GGP5PPP5J.\n"
				+ "     75YJJ?~~7???GGGGYJY55YYJYJ?7: \n"
				+ "    .!77!~:      75PYJJ^.::^^^:    \n"
				+ "                 :7!?7!:           ");
		
		System.out.println(name + "등장! 꼬북꼬북!!");
	}
	
	@Override
	public void skill1(){
		System.out.println("몸통 박치기!");
	}
	
	@Override
	public void skill2(){
		System.out.println("물대포!");
	}
}
