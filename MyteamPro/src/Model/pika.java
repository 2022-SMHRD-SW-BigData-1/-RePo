package Model;

public class pika extends Poketmon{
	
	public pika (String name) {
		this.name = name;	
		System.out.println(name + "등장! 피카피카!!");
	}
	
	public void skill1(){
		System.out.println("몸통 박치기!");
	}
	public void skill2(){
		System.out.println("백만 볼트!");
	}
}
