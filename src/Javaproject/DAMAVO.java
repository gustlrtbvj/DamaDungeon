package Javaproject;
import java.util.Scanner;

public class DAMAVO {
	
	private String id;
	private String nick;
	private int lv;
	private int expe;
	private int hp;
	private int ene;
	private int maxhp;
	private int maxene;
	private int atk;
	private int spd;
	private int food;
	private int hurbs;
	private int startday;
	private int sickday;
	private int shd;
	private int str;
	private int dex;
	private int wis;
	private int luk;
	private int dummi;
	private int jobid;
	private int[] LVtable = {0,100,200,300,400,500,600,700,800,900,1000};
	private int select_st;
	Scanner sc= new Scanner(System.in);
	DAMADAO dama = new DAMADAO();

	public void VO_deadly(String main_id) {
		Face fc = new Face();
		testMain main_vlu = new testMain();
		if (hp < 1) {
			hp=0;
			fc.Face_Die(main_id);
			System.out.println(" 사망하셨습니다. 당신의 발자취는 기록될 것입니다.");
			System.out.println();
			System.out.println("       메인 화면으로 돌아가시겠습니까? ");
			System.out.println("             [1]확인 [2]종료");
			System.out.print(">>");
			while(true) {
			int select_main =sc.nextInt();
			if (select_main == 1) {
			main_vlu.setcoin(1);
			break;
			} else if (select_main == 2) {
			main_vlu.setcoin(0);
			break;
			}
			}
			
		}
		
	}
	public void VO_sleeptry(String main_id,int rehp,int reene) {
		dama.vo_loding(main_id);
		hp +=rehp;
		if (hp>maxhp) {hp=maxhp;}
		ene +=reene;
		if (ene>maxene) {ene=maxene;}
		startday+=5;
		Alldate(main_id);
	}
	public void VO_day(String main_id,int day) {
		startday+=day;
	}
	
	
	
	public void VO_experience(int exe,String main_id) {
		this.expe += exe;
		if (lv+1<LVtable.length) {
		if (LVtable[lv]<expe) {
			expe-=LVtable[lv];
			lv++;
			System.out.println("     ┌──────────────────┐");
			System.out.println("     │     LEVEL UP     │");
			System.out.println("     └──────────────────┘");
			VO_Stators(5,main_id);
			}
		}
	}
	
	public void VO_trStudy(int wis, String main_id) {
		this.wis += wis;
	}
	
	public void VO_trHealth(int str, String main_id) {
		this.str += str;
	}
	
	public void VO_trShield(int shd, String main_id) {
		this.shd += shd;
	}
	
	public void VO_trLuk(int luk, String main_id) {
		this.luk += luk;
	}
	
	public void VO_trRun(int spd, String main_id) {
		this.spd += spd;
	}
	
	public void VO_Stators(int stat,String main_id) {
		select_st=0;
		this.dummi += stat;
		while(dummi>0) {
			System.out.println("         스테이터스 추가포인트["+dummi+"]    ");
			System.out.println("[1]근력\t[2]민첩\t[3]지력\t[4]행운\t[5]나가기");
			select_st=sc.nextInt();
			if (select_st==1) {
			str++;
			dummi --;
			atk+=1;
			maxhp+=10;
			hp+=10;
			}else if(select_st==2) {
			dex++;
			dummi --;
			spd+=1;
			}else if(select_st==3) {
			wis++;
			dummi --;
			maxene+=10;
			ene+=10;
			shd+=1;	
			}else if(select_st==4) {
			luk++;
			dummi --;
			}else if(select_st==5) {
			break;
			}
		}
		Alldate(main_id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExpe() {
		return expe;
	}

	public void setExpe(int expe) {
		this.expe = expe;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEne() {
		return ene;
	}

	public void setEne(int ene) {
		this.ene = ene;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public int getMaxene() {
		return maxene;
	}

	public void setMaxene(int maxene) {
		this.maxene = maxene;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getHurbs() {
		return hurbs;
	}

	public void setHurbs(int hurbs) {
		this.hurbs = hurbs;
	}

	public int getStartday() {
		return startday;
	}

	public void setStartday(int startday) {
		this.startday = startday;
	}

	public int getSickday() {
		return sickday;
	}

	public void setSickday(int sickday) {
		this.sickday = sickday;
	}

	public int getShd() {
		return shd;
	}

	public void setShd(int shd) {
		this.shd = shd;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getLuk() {
		return luk;
	}

	public void setLuk(int luk) {
		this.luk = luk;
	}

	public int getDummi() {
		return dummi;
	}

	public void setDummi(int dummi) {
		this.dummi = dummi;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public DAMAVO() {
		
	}


	 
	public DAMAVO(String getId, String getNick, int getExper, int getLv, int getEne, int getMaxene, int getFood, int getHerbs, int getStart, int getSick,int job) {
		this.id = getId;
		this.nick = getNick;
		this.lv = getLv;
		this.expe = getExper;
		this.ene = getEne;
		this.maxene = getMaxene;
		this.food = getFood;
		this.hurbs = getHerbs;
		this.startday = getStart;
		this.sickday = getSick;
		this.jobid = job;
	}

	public DAMAVO(String getId, int gethp, int getmaxhp, int getatk, int getshd, int getspd, int getstr, int getdex,
			int getwis, int getluk, int getdummi) {
		this.id = getId;
		this.hp = gethp;
		this.maxhp = getmaxhp;
		this.atk = getatk;
		this.shd = getshd;
		this.spd = getspd;
		this.str = getstr;
		this.dex = getdex;
		this.wis = getwis;
		this.luk = getluk;
		this.dummi = getdummi;
		// TODO Auto-generated constructor stub
	}

	public DAMAVO(String id, String nick, int lv, int expe, int hp, int ene, int maxhp, int maxene, int atk, int spd,
			int food, int hurbs, int startday, int sickday, int shd, int str, int dex, int wis, int luk, int dummi,
			int jobid) {
		super();
		this.id = id;
		this.nick = nick;
		this.lv = lv;
		this.expe = expe;
		this.hp = hp;
		this.ene = ene;
		this.maxhp = maxhp;
		this.maxene = maxene;
		this.atk = atk;
		this.spd = spd;
		this.food = food;
		this.hurbs = hurbs;
		this.startday = startday;
		this.sickday = sickday;
		this.shd = shd;
		this.str = str;
		this.dex = dex;
		this.wis = wis;
		this.luk = luk;
		this.dummi = dummi;
		this.jobid = jobid;
	}

	public void Alldate(String main_id){
		DAMADAO dama = new DAMADAO();
		dama.vo_update(main_id, nick, expe, lv, ene, maxene, food, hurbs, startday, sickday, jobid, hp, maxhp, atk, shd, spd, str, dex, wis, luk, dummi);
	}

}
