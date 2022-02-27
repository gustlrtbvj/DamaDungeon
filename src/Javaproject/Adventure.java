package Javaproject;

import java.util.Scanner;

//모험을 하는 클레스 입니다.
public class Adventure {
	Scanner sc = new Scanner(System.in);
	Battle bt = new Battle();
	Eat ea = new Eat();
	DAMAVO st = new DAMAVO();
	DAMADAO t = new DAMADAO();
	Face fc = new Face();
	int select_admenu;

	public void select_Adven(String main_id) {
		st= t.vo_loding(main_id);
		select_admenu = 0;
		while (true) {
			if (select_admenu == 0) {
				System.out.println("[1]사냥하기 [2]음식구하기 [3]약구하기 [4]뒤로가기");
				select_admenu = sc.nextInt();
			} else if (select_admenu == 1) {
				if (st.getStartday() >= 10) {
					System.out.println("[1]핏빛숲 [2]심해 [3]폭풍정원 [4] 가장 어두운 던전");
				} else {
					System.out.println("[1]핏빛숲 [2]심해 [3]폭풍정원");
				}
				int a = sc.nextInt();
				bt.Phase(main_id, a);
				break;

			} else if (select_admenu == 2) {
				ea.Bob_save(main_id);
				break;

			} else if (select_admenu == 3) {
				ea.Herb_save(main_id);
				break;

			} else if (select_admenu == 4) {
				break;
			} else {
				select_admenu = 0;
			}

		}

	}

}
