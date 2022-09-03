package Model;

public class WrongVO {

	int no;
	String word;
	String answer;
	
	public WrongVO(int no, String word, String answer, String id) {
		super();
		this.no = no;
		this.word = word;
		this.answer = answer;
		this.id = id;
	}
	String id;
	
	
	public int getNo() {
		return no;
	}
	public String getWord() {
		return word;
	}
	public String getAnswer() {
		return answer;
	}
	public String getId() {
		return id;
	}
}
