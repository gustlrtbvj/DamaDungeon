package Javaproject;

import java.util.ArrayList;
import java.util.Random;

public class Enemy {

	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();
	Face fc = new Face();

	private String id;
	private int maxhp;
	private int atk;
	private int spd;
	private int shd;
	private int str;
	private int dex;
	private int wis;
	private int luk;

	// 적 변수 설정
	private String En_name;
	private int En_hp;
	private int En_atk;
	private int En_def;
	private int En_spd;
	private int En_str;
	private int En_dex;
	private int En_wis;
	private int En_luk;
	private int t;

	Random rd = new Random();

	public Enemy() {
	}

	public String getEn_name() {
		return En_name;
	}

	public int getEn_hp() {
		return En_hp;
	}

	public int getEn_atk() {
		return En_atk;
	}

	public int getEn_def() {
		return En_def;
	}

	public int getEn_spd() {
		return En_spd;
	}

	public void setEn_name(String en_name) {
		En_name = en_name;
	}

	public void setEn_hp(int en_hp) {
		En_hp = en_hp;
	}

	public void setEn_atk(int en_atk) {
		En_atk = en_atk;
	}

	public void setEn_def(int en_def) {
		En_def = en_def;
	}

	public void setEn_spd(int en_spd) {
		En_spd = en_spd;
	}

	public int getEn_str() {
		return En_str;
	}

	public void setEn_str(int en_str) {
		En_str = en_str;
	}

	public int getEn_dex() {
		return En_dex;
	}

	public void setEn_dex(int en_dex) {
		En_dex = en_dex;
	}

	public int getEn_wis() {
		return En_wis;
	}

	public void setEn_wis(int en_wis) {
		En_wis = en_wis;
	}

	public int getEn_luk() {
		return En_luk;
	}

	public void setEn_luk(int en_luk) {
		En_luk = en_luk;
	}

	public Enemy getEnemyLand(String id) {

		st = dama.vo_loding(id);

		int a = (rd.nextInt(8) * 10);
		int b = rd.nextInt(8);
		int c = rd.nextInt(8);
		int d = rd.nextInt(8);
		int e = rd.nextInt(8);
		int f = rd.nextInt(8);
		int g = rd.nextInt(8);
		int h = rd.nextInt(8);

		UserInfo();

		int t = 5 + st.getStartday();
		int z = 5 + (st.getStartday() * 10);
		ArrayList<Enemy> eList = new ArrayList<>();

		// eList.add(new Enemy("토끼", 1, 1, 1, 1, 1,1,1,1));
		eList.add(new Enemy("토끼", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("사슴", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("고양이", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("여우", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("족제비", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("반달가슴곰", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("엘크", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("맷돼지", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("뱀", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("도마뱀", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("나무늘보", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("코알라", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("캥거루", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("아프리카코끼리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("호랑이", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("사자", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("치타", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("표범", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("얼룩말", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("하이에나", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		int i = rd.nextInt(eList.size() - 1);
		System.out.println(i);
		return eList.get(i);

	}

	public Enemy getEnemySea(String id) {

		st = dama.vo_loding(id);
		int a = (rd.nextInt(8) * 10);
		int b = rd.nextInt(8);
		int c = rd.nextInt(8);
		int d = rd.nextInt(8);
		int e = rd.nextInt(8);
		int f = rd.nextInt(8);
		int g = rd.nextInt(8);
		int h = rd.nextInt(8);

		UserInfo();

		int t = 10 + st.getStartday();
		int z = 10 + (st.getStartday() * 10);

		ArrayList<Enemy> eList = new ArrayList<>();

		eList.add(new Enemy("송어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("숭어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("고등어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("갈치", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("정어리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("참치", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("멸치", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("꽁치", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("연어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("청상아리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("백상아리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("철갑상어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("혹등고래", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("범고래", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("심해어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("꼬부기", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("아기상어", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("거북이", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("바다표범", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("펭귄", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		int i = rd.nextInt(eList.size() - 1);
		System.out.println(i);
		return eList.get(i);

	}

	public Enemy getEnemyAir(String id) {

		st = dama.vo_loding(id);

		int a = (rd.nextInt(8) * 10);
		int b = rd.nextInt(8);
		int c = rd.nextInt(8);
		int d = rd.nextInt(8);
		int e = rd.nextInt(8);
		int f = rd.nextInt(8);
		int g = rd.nextInt(8);
		int h = rd.nextInt(8);

		UserInfo();

		int t = 15 + st.getStartday();
		int z = 15 + (st.getStartday() * 10);
		ArrayList<Enemy> eList = new ArrayList<>();
		eList.add(new Enemy("왕독수리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("대머리독수리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("까마귀", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("뱁새", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("장수말벌", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("꿩", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("학", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("타조", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("하늘거북이", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("스카이퍼피", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("파리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("잠자리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("딱따구리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("벌새", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d), randomCal(t, e),
				randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("호랑나비", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("소쩍새", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("두루미", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("직박구리", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("황조롱이", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		eList.add(new Enemy("따오기", randomCalHp(z, a), randomCal(t, b), randomCal(t, c), randomCal(t, d),
				randomCal(t, e), randomCal(t, f), randomCal(t, g), randomCal(t, 1)));
		int i = rd.nextInt(eList.size() - 1);
		System.out.println(i);
		return eList.get(i);

	}

	public Enemy getEnemyBoss(String id) {

		int t = 20 + st.getStartday();
		int z = 20 + (st.getStartday() * 10);

		st = dama.vo_loding(id);
		UserInfo();

		System.out.println("이 여행을 시작한 지 " + st.getStartday() + "일이 지났다." + st.getNick() + "은(는) 지금껏 싸워온 적들을 생각했다.");
		System.out.println("'그 모든 싸움은, 지금 이 순간을 위한 것이다.' " + st.getNick() + "은(는) 생각했다.");
		System.out.println(st.getNick() + " : '모든 길은 끝나기 마련이지. 가보기 전에는 그 끝을 알 수 없을 뿐.'");
		System.out.println(st.getNick() + "은(는) 마지막 전투를 준비했다.");
		System.out.println("");

		fc.Face_Boss(id);

		return new Enemy("자바", 1000, 60, 60, 60, 60, 60, 60, 60);
	}

	public Enemy(String en_name, int en_hp, int en_atk, int en_def, int en_spd, int en_str, int en_dex, int en_wis,
			int en_luk) {
		En_name = en_name;
		En_hp = en_hp;
		En_atk = en_atk;
		En_def = en_def;
		En_spd = en_spd;
		En_str = en_str;
		En_dex = en_dex;
		En_wis = en_wis;
		En_luk = en_luk;
	}

	public void UserInfo() {
		id = st.getId();
		maxhp = st.getMaxhp();
		atk = st.getAtk();
		shd = st.getShd();
		spd = st.getSpd();
		str = st.getStr();
		dex = st.getDex();
		wis = st.getWis();
		luk = st.getLuk();

	}

	public int randomCal(int a, int b) {
		int t = rd.nextInt(2);
		int result;
		if (t == 0) {
			result = a + b;
		} else {
			result = a - b;
		}
		return result;

	}

	public int randomCalHp(int a, int b) {
		int result;
		result = a + b;

		return result;

	}

}