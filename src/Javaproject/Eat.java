package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Eat {
	// 음식을 먹는 클래스입니다.

	Scanner sc = new Scanner(System.in);
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
    Random rd = new Random();
    Event et = new Event();
    
	private int her;
	private int bob;
	private int hp;
	private int ene;
    private int MaxHp;
    private int MaxEne;
    private int A;
	public void Eat_menu(String id) {
		st = dama.vo_loding(id);
		her = st.getHurbs();
		bob = st.getFood();
		hp = st.getHp();
		ene = st.getEne();
		MaxHp = st.getMaxhp();
		MaxEne = st.getMaxene();
		System.out.println("1. 밥" + "(" + st.getFood() + "개)" + " 2. 약초" + "(" + st.getHurbs() + "개)" + " 3. 뒤로가기");
		int eat_choice = sc.nextInt();

		if (eat_choice == 1) {

			if (bob > 0) {
				if(MaxEne>ene) {
				System.out.println("밥을 먹는다.");
				bob--;
				ene += 50;
//				System.out.println(bob);
				st.setFood(bob);
				if (ene>MaxEne) {ene=MaxEne;}
				st.setEne(ene);
				st.Alldate(id);
				fa.Face_Eat_Fish(id);
				et.Eventset(id);
				}else {
					fa.Face_No_Eat(id);
					
					
				}
			} else {
				System.out.println("밥이 없다.");
			}

		} else if (eat_choice == 2) {

			if (her > 0) {
				if(MaxHp>hp || st.getSickday()!=0) {
					
				System.out.println("약초를 먹는다.");
				her--;
				hp += 50;
				st.setHurbs(her);
				if (hp>MaxHp) {hp=MaxHp;}
				st.setHp(hp);
				st.setSickday(0);
				st.Alldate(id);
				fa.Face_Eat_Medi(id);
				}else {
					fa.Face_No_Medi(id);
				}
			} else {
				
				System.out.println("약초가 없다.");
			}

		}
		st.Alldate(id);
	}

	public void Bob_save(String id) {

		st = dama.vo_loding(id);
		bob = st.getFood();
        A = rd.nextInt(2);
		if (bob >= 0) {
			if(A==0) {
				
				System.out.println("밥을 구한다.");
				bob++;
				st.setFood(bob);
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_Fishing(id);
				System.out.println("밥을 "+"1 획득했다!");
				System.out.println("내 밥 : "+ st.getFood());
				et.Eventset(id);
			}else {
				System.out.println("밥을 구하지 못했다.");
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_FishingMiss(id);
				System.out.println("내 밥 : "+ st.getFood());
				et.Eventset(id);
			}
			}
	}

	public void Herb_save(String id) {
		st = dama.vo_loding(id);
		her = st.getHurbs();
		A = rd.nextInt(2);
		if (her >= 0) {
			if(A==0) {
				System.out.println("약초를 구한다.");
				her++;
				st.setHurbs(her);
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_Get_Medi(id);
				System.out.println("약을 "+"1 획득했다!");
				System.out.println("내 약초 : "+st.getHurbs());
				et.Eventset(id);
			}else {
				System.out.println("약초를 구하지 못했다.");
				st.VO_day(id,1);
				st.Alldate(id);
				fa.Face_Miss_Medi(id);
				System.out.println("내 약초 : "+st.getHurbs());
				et.Eventset(id);
			}
		}
	}
}
