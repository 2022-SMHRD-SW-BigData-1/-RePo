package Model;

public class PoketmonVO {
	private String id;
	private String pw;
	private int score;
	
	public PoketmonVO() {
		
	}

	public PoketmonVO(String id, String pw, int score) {
		super();
		this.id = id;
		this.pw = pw;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
