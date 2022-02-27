package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Sick {
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	
	private int sickday;
	
	public void SSick(String id){
		st=dama.vo_loding(id);
		sickday = st.getSickday()+1;
		System.out.println(sickday);
	
				st.setStr(st.getStr()-sickday);
				if(st.getStr() < 1) {
					st.setStr(0);
				}
				st.setDex(st.getDex()-sickday);
				if(st.getDex() < 1) {
					st.setDex(0);
				}
				st.setWis(st.getWis()-sickday);
				if(st.getWis() < 1) {
					st.setWis(0);
				}
				st.setLuk(st.getLuk()-sickday);
				if(st.getLuk() < 1) {
					st.setLuk(0);
				}
				st.setAtk(st.getAtk()-sickday);
				if(st.getAtk() < 1) {
					st.setAtk(0);
				}
				st.setShd(st.getShd()-sickday);
				if(st.getShd() < 1) {
					st.setShd(0);
				}
				st.setSpd(st.getSpd()-sickday);
				if(st.getSpd() < 1) {
					st.setSpd(0);
				}
				st.setHp(st.getHp()-sickday*10);
				if(st.getHp() < 1) {
					st.VO_deadly(id);
				}
				st.setEne(st.getEne()-sickday*10);
				if(st.getEne() < 1) {
					st.setEne(0);
				}
				st.setSickday(sickday);
				System.out.println("질병에 걸렸습니다. 모든 스텟이 " +sickday+"만큼 하락합니다.");
				st.Alldate(id);
			
		}
}