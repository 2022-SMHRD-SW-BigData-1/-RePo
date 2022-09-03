package Model;

public class Music { //모델클래스

	private String musicName;
	private String musicPath;
	
	public Music(String musicName, String musicPath) {
		
		this.musicName = musicName;
		this.musicPath = musicPath;
	}
	
	public String getMusicName() {
		return musicName;
	}

	public String getMusicPath() {
		return musicPath;
	}
	
	
	

	
}
