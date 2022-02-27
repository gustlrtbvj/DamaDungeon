package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Event {
	Random rd = new Random();
	DAMAVO st = new DAMAVO();
	DAMADAO t = new DAMADAO();
	Face fc = new Face();
	Scanner sc = new Scanner(System.in);
	Battle bt = new Battle();
	Sick si = new Sick();

	public void Eventset(String id) { 
		int event_menu = rd.nextInt(100);
		st = t.vo_loding(id);

		if (st.getSickday() == 0) {
			if (event_menu < 5) {
				System.out.println("    ==랜덤 질병 발생== ");
				System.out.println("    [1]확인   [2]해독 ");
				while (true) {
					int select = sc.nextInt();
					if (select == 1) {
						si.SSick(id);
						break;
					} else if (select == 2) {
						if (st.getHurbs() > 0) {
							System.out.println("==약초를 이용하여 해독하였습니다.==");
							st.setHurbs(st.getHurbs() - 1);
							st.Alldate(id);
							break;
						} else {
							System.out.println("==약초가 없어 해독하지 못했습니다.==");
							System.out.println("    ==질병 패널티==");
							si.SSick(id);
							break;
						}
					}
				}
			}
		} else {
			System.out.println("    ==질병 패널티==");
			si.SSick(id);
		}
		if (event_menu > 90) {
			int select = 0;
			System.out.println("  ==랜덤 전투 발생==");
			System.out.println("   [1] 전투 돌입  ");
			while (select != 1) {
				select = sc.nextInt();
				if (select != 1) {
					System.out.println("  [1] 확인을 해 주세요  ");
				}
			} 
			int a = rd.nextInt(2)+1;
			bt.Phase(id, a);

		}
	}

}
