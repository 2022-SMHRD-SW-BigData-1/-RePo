package Model;

public class gameProcessVO {

	private int no;
	private String word;
	private String answer;
	private int difficulty;
	
	
	
	public gameProcessVO() {
		super();
	}
	public gameProcessVO(int no, String word, String answer, int difficulty) {
		super();
		this.no = no;
		this.word = word;
		this.answer = answer;
		this.difficulty = difficulty;
	}
	
	public int getNo() {
		return no;
	}
	public String getWord() {
		return word;
	}
	public String getAnswer() {
		return answer;
	}
	public int getDifficulty() {
		return difficulty;
	}
	
	
}
