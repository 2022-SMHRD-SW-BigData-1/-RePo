package Controller;
import java.util.ArrayList;

import Model.Music;
import javazoom.jl.player.MP3Player;

public class MusicPlayer { // 기능 정의 클래스(컨트롤러)
	MP3Player mp3 = new MP3Player();
	ArrayList<Music> musicList = new ArrayList<Music>();
	int currentIndex = 0;

	public MusicPlayer() { // default
		musicList.add(new Music("메인","C://music/intro.mp3"));
		musicList.add(new Music("보스출현","C://music/stage.mp3"));
		musicList.add(new Music("승리","C://music/win.mp3"));
		musicList.add(new Music("패배", "C://music/lose.mp3"));
	}

	public Music play(int index) {     // 노래 재생
		Music m = musicList.get(index);
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(m.getMusicPath());
		return m;
	}

	public String stop() {		// 노래 종료
		String message = "";
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		return message;
	}
}
