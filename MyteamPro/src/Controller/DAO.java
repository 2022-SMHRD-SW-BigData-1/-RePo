package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import Model.PoketmonVO;
import Model.WrongVO;
import Model.gameProcessVO;

public class DAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	Random rd = new Random();

	public void getCon() { // DB 연결

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // url 서버주소, 포트넘버 1524
			String db_id = "campus_h_0830_4"; // 팀 user 명
			String db_pw = "smhrd4"; // 팀 password

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("자원 반납 시 오류");
		}
	}

	public int join(int rank, String id, String pw, int score) { // [1] 회원 가입
		int cnt = 0;
		try {
			getCon();
			String sql = "insert into playerinfo values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, rank);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			psmt.setInt(4, score);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public boolean login(String id, String pw) { // [2] 로그인
		try {
			getCon();
			String sql = "select * from playerinfo where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return false;
	}

	public ArrayList<PoketmonVO> rank() { // [4] 랭킹 조회
		ArrayList<PoketmonVO> plist = new ArrayList<PoketmonVO>();
		try {
			getCon();
			String pw = null;
			String sql = "select id, score from playerinfo order by score desc";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getNString(1);
				int score = rs.getInt(2);
				PoketmonVO vo = new PoketmonVO(id, pw, score);
				plist.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return plist;
	}

	// 문제 출력
	// 디비에서 같은 난이도의 단어들을 가져와 랜덤으로 출력해야 함
	public ArrayList<gameProcessVO> select(int difficulty) {
		ArrayList<gameProcessVO> list = new ArrayList<gameProcessVO>();
		gameProcessVO vo = null;

		try {
			getCon();
			String sql = "select * from quiz where difficulty = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, difficulty);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt(1);
				String word = rs.getString(2);
				String answer = rs.getString(3);
				int difficulty1 = rs.getInt(4);
				vo = new gameProcessVO(no, word, answer, difficulty1);
				list.add(vo);
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public int totalscore(int score, String id) { // 점수합산
		int cnt = 0;
		try {
			getCon();
			String sql = "update playerInfo set score = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, score);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("점수 저장 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int Wrong(int no, String word, String answer, String id) { // 오답저장
		int cnt = 0;

		try {
			getCon();
			String sql = "insert into wrong values (?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, no);
			psmt.setString(2, word);
			psmt.setString(3, answer);
			psmt.setString(4, id);

			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("오답 저장 성공");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public ArrayList<WrongVO> showwrong(String id) {
		ArrayList<WrongVO> wrong = new ArrayList<WrongVO>();
		WrongVO vo = null;

		try {
			getCon();
			String sql = "select no, word, answer from wrong where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt(1);
				String word = rs.getString(2);
				String answer = rs.getString(3);
				vo = new WrongVO(no, word, answer, id);
				wrong.add(vo);
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return wrong;
	}
	
	public ArrayList<PoketmonVO> showrank() {
		ArrayList<PoketmonVO> rank = new ArrayList<PoketmonVO>();
		PoketmonVO vo = null;

		try {
			getCon();
			String sql = "select id, score from playerInfo order by score desc";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				int score = rs.getInt(3);
				vo = new PoketmonVO(id, pw, score);
				rank.add(vo);
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return rank;
	}

}
