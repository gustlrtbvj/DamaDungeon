package Javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAMADAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int result;
	String sql;

	// 데이터베이스를 연결하는 메소드 getConn()

	// 데이터베이스를 연결끊는 메소드 endClose()

	// 회원정보 메소드

	// insert insert()

	// select select()

	// update update()

	// delete delete()

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "cgi_2_3_1022";
			String password = "smhrd3";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) { // 어떠한 오류라도 발생시 캐치해주는 역활
			System.out.println("연결 오류");
			e.printStackTrace();
		}
	}

	public void endClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void table1() {
		getConn();

		sql = "CREATE TABLE USER_INFO (USER_ID varchar2(10),PASSWORD varchar2(10) NOT NULL,CONSTRAINT INFO_PK PRIMARY KEY (USER_ID))";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void table2() {
		getConn();
		sql = "CREATE TABLE DAMA_INFO (USER_ID VARCHAR2(10), NICK VARCHAR2(10), ES NUMBER(5), LV NUMBER(5), ENERGY NUMBER(5),MAXENERGY NUMBER(5),FOOD NUMBER(5), HERBS NUMBER(5), STARTDAY NUMBER(5), SICKDAY NUMBER(5),JOBID NUMBER(5),CONSTRAINT DAMA_FK FOREIGN KEY(USER_ID) REFERENCES USER_INFO(USER_ID))";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void table3() {
		getConn();
		sql = "CREATE TABLE BATTLE_INFO (USER_ID VARCHAR2(10), HP NUMBER(5),MAXHP NUMBER(5),ATK NUMBER(5),SHD NUMBER(5),SPD NUMBER(5),STR NUMBER(5),DEX NUMBER(5),WIS NUMBER(5),LUK NUMBER(5),DUMMI NUMBER(5), CONSTRAINT BATTLE_FK FOREIGN KEY(USER_ID) REFERENCES USER_INFO(USER_ID))";
		try {
			conn.createStatement();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public int join(String Id, String Pw) {
		int i = 0;
		getConn();
		try {
			String sql = "insert into USER_INFO values(?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Id);
			psmt.setString(2, Pw);
			int up = psmt.executeUpdate();// 업데이트 줄수
			if (up > 0) {
				i = 5;
			} else {
				System.out.println("회원가입 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		return i;
	}

	public void joinStators1(String Id, String Nick, int job) {
		getConn();
		try {
			if (job == 1) {
				String sql = "insert into DAMA_INFO values(?,?,0,1,100,100,5,1,1,0,1)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.setString(2, Nick);
				psmt.executeUpdate();// 업데이트 줄수
			} else if (job == 2) {
				String sql = "insert into DAMA_INFO values(?,?,0,1,100,100,5,1,1,0,2)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.setString(2, Nick);
				psmt.executeUpdate();// 업데이트 줄수
			} else if (job == 3) {
				String sql = "insert into DAMA_INFO values(?,?,0,1,200,200,5,1,1,0,3)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.setString(2, Nick);
				psmt.executeUpdate();// 업데이트 줄수
			} else if (job == 4) {
				String sql = "insert into DAMA_INFO values(?,?,0,1,100,100,5,1,1,0,4)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.setString(2, Nick);
				psmt.executeUpdate();// 업데이트 줄수
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void joinStators2(String Id, int job) {
		getConn();
		try {
			if (job == 1) {//전사
				String sql = "insert into BATTLE_INFO values(?,200,200,20,20,5,10,10,10,30,0)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.executeUpdate();// 업데이트 줄수
			} else if (job == 2) {//도적
				String sql = "insert into BATTLE_INFO values(?,150,150,10,20,20,10,10,10,30,0)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.executeUpdate();// 업데이트 줄수
			} else if (job == 3) {//마법사
				String sql = "insert into BATTLE_INFO values(?,130,130,10,10,10,10,10,10,30,0)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.executeUpdate();// 업데이트 줄수
			} else if (job == 4) {//거지
				String sql = "insert into BATTLE_INFO values(?,60,100,10,10,10,10,10,10,30,0)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, Id);
				psmt.executeUpdate();// 업데이트 줄수
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void select() {
		getConn();
		String sql = "select * from user_info";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String getId = rs.getString(1);
				String getPw = rs.getString(2);
				System.out.println("아이디 : " + getId + " 비밀번호 : " + getPw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void ranksys() {
		getConn();
		
		int i = 0;
		String sql = "select * from dama_info order by LV desc, ES desc";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				i++;
				String getID = rs.getString(1);
				String getnick = rs.getString(2);
				int getLv = rs.getInt(4);
				int getExpe = rs.getInt(3);
				int getturn = rs.getInt(9);
				System.out.println(i + "위  아이디 : " + getID + "\t\t닉네임 : " + getnick + "\t\t레벨 : " + getLv + "\t  경험치 : "
						+ getExpe + "\t  턴수 : " + getturn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void all_delete() {
		getConn();
		try {
			System.out.println("0");
			String sql1 = "delete from BATTLE_INFO";
			psmt = conn.prepareStatement(sql1);
			psmt.executeUpdate();
			System.out.println("1");
			String sql2 = "delete from DAMA_INFO";
			psmt = conn.prepareStatement(sql2);
			psmt.executeUpdate();
			System.out.println("2");
			String sql3 = "delete from USER_INFO";
			psmt = conn.prepareStatement(sql3);
			psmt.executeUpdate();
			System.out.println("3");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public DAMAVO vo_loding(String id) {
		String getId = null;
		String getNick = null;
		int getExper = 0;
		int getLv = 0;
		int getEne = 0;
		int getMaxene = 0;
		int getFood = 0;
		int getHerbs = 0;
		int getStart = 0;
		int getSick = 0;
		int getjobid = 0;
		int gethp = 0;
		int getmaxhp = 0;
		int getatk = 0;
		int getshd = 0;
		int getspd = 0;
		int getstr = 0;
		int getdex = 0;
		int getwis = 0;
		int getluk = 0;
		int getdummi = 0;
		DAMAVO dm = new DAMAVO();
		getConn();
		String sql = "select * from BATTLE_INFO where USER_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				getId = rs.getString(1);
				gethp = rs.getInt(2);
				getmaxhp = rs.getInt(3);
				getatk = rs.getInt(4);
				getshd = rs.getInt(5);
				getspd = rs.getInt(6);
				getstr = rs.getInt(7);
				getdex = rs.getInt(8);
				getwis = rs.getInt(9);
				getluk = rs.getInt(10);
				getdummi = rs.getInt(11);
			}
			sql = "select * from DAMA_INFO where user_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				getId = rs.getString(1);
				getNick = rs.getString(2);
				getExper = rs.getInt(3);
				getLv = rs.getInt(4);
				getEne = rs.getInt(5);
				getMaxene = rs.getInt(6);
				getFood = rs.getInt(7);
				getHerbs = rs.getInt(8);
				getStart = rs.getInt(9);
				getSick = rs.getInt(10);
				getjobid = rs.getInt(11);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		dm = new DAMAVO(getId, getNick, getLv, getExper, gethp, getEne, getmaxhp, getMaxene, getatk, getspd, getFood,
				getHerbs, getStart, getSick, getshd, getstr, getdex, getwis, getluk, getdummi, getjobid);
		return dm;
	}

	public int login(String Id, String Pw) {
		getConn();
		int i = 0;
		String sql = "select * from USER_INFO where USER_ID = ? and PASSWORD = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Id);
			psmt.setString(2, Pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				i = 5;
			} else {
				i = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
		return i;
	}

	public void vo_update(String id, String nick, int exper, int lv, int energy, int maxenergy, int food, int herbs,
			int startday, int sick, int jobid, int hp, int maxhp, int atk, int shd, int spd, int str, int dex, int wis,
			int luk, int dummi) {
		String sql;
		getConn();
		try {
			sql = "update DAMA_INFO set USER_ID=?,NICK=?,ES=?,LV=?,ENERGY=?,MAXENERGY=?,FOOD=?,HERBS=?,STARTDAY=?,SICKDAY=?,JOBid=? where user_id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, nick);
			psmt.setInt(3, exper);
			psmt.setInt(4, lv);
			psmt.setInt(5, energy);
			psmt.setInt(6, maxenergy);
			psmt.setInt(7, food);
			psmt.setInt(8, herbs);
			psmt.setInt(9, startday);
			psmt.setInt(10, sick);
			psmt.setInt(11, jobid);
			psmt.setString(12, id);
			result = psmt.executeUpdate();
			sql = "update BATTLE_INFO set USER_ID=?,HP=?,MAXHP=?,ATK=?,SHD=?,SPD=?,STR=?,DEX=?,WIS=?,LUK=?,DUMMI=? where user_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setInt(2, hp);
			psmt.setInt(3, maxhp);
			psmt.setInt(4, atk);
			psmt.setInt(5, shd);
			psmt.setInt(6, spd);
			psmt.setInt(7, str);
			psmt.setInt(8, dex);
			psmt.setInt(9, wis);
			psmt.setInt(10, luk);
			psmt.setInt(11, dummi);
			psmt.setString(12, id);

			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}
	}

	public void day_update(String id, int upday) {
		String sql;
		DAMAVO st = new DAMAVO();
		st=vo_loding(id);
		int plusday=st.getStartday()+upday;
		getConn();
		try {
			sql = "update DAMA_INFO set STARTDAY=? where user_id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, plusday);
			psmt.setString(2, id);
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			endClose();
		}

	}

}
