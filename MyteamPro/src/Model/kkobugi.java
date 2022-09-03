package Model;

public class kkobugi extends Poketmon{
	
	public kkobugi(String name) {
		this.name = name;
		System.out.println(name + "등장! 꼬북꼬북!!");
	}
	
	public void skill1(){
		System.out.println("몸통 박치기!");
	}
	public void skill2(){
		System.out.println("물대포!");
	}
}
