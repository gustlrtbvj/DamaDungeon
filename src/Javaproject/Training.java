package Javaproject;

import java.util.Random;
import java.util.Scanner;

//훈련을 하는 클레스입니다.
public class Training {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	private int menu;		
	Event et = new Event();
	
	public void tr_Select(String id) {
		while(true) {
		System.out.println("[1] 다마스터디(+wis) [2] 3대운동(+str) [3] 맷집(+shd) [4] 달리기(+spd) [5] 뒤로가기");
		menu = sc.nextInt();
		if(menu == 1) {
			System.out.println("문제를 풀어보아용!");
			fa.Face_Talk(id);
			Quiz(id);
			et.Eventset(id);
			break;
		}else if(menu == 2) {
			Health(id);
			et.Eventset(id);
			break;
		}else if(menu == 3) {
			Shield(id);
			et.Eventset(id);
			break;
		}else if(menu == 4) {
			Run(id);
			et.Eventset(id);
			break;
		}else if(menu == 5) {
			break;
		}else {
			System.out.println("정확한 값을 입력해주세요.");
			menu = 0;
		}
		}
	}
	
	public void training_base(String id) {
			st=dama.vo_loding(id);
			fa.Face_Normal(id);
	}
	
	public void Quiz(String id) {
		st=dama.vo_loding(id);
		int num1 = rd.nextInt(99)+1;
		int num2 = rd.nextInt(99)+1;
		int rdnum = rd.nextInt(4);
		int ans;
		if(rdnum == 0) {
			System.out.print(num1 + " + " + num2 + " = ");
			ans = sc.nextInt();
			if(ans == num1 + num2) {
				System.out.println("정답입니다! wis + 1!");
				st.VO_trStudy(1, id);
				st.VO_experience(50,id);
				st.VO_day(id, 1);
			}else {
				System.out.println("틀렸습니다.. 다시 도전해보세요");
				st.VO_day(id, 1);
			}
		}else if(rdnum == 1) {
			System.out.print(num1 + " - " + num2 + " = ");
			ans = sc.nextInt();
			if(ans == num1 - num2) {
				System.out.println("정답입니다! wis + 1!");
				st.VO_trStudy(1, id);
				st.VO_experience(50,id);
				st.VO_day(id, 1);
			}else {
			System.out.println("틀렸습니다.. 다시 도전해보세요");
			st.VO_day(id, 1);
				}
		}else if (rdnum == 2) {
			System.out.print(num1 + " * " + num2 + " = ");
			ans = sc.nextInt();
			if(ans == num1 * num2) {
				System.out.println("정답입니다! wis + 1!");
				System.out.println();
				st.VO_trStudy(1, id);
				st.VO_experience(50,id);
				st.VO_day(id, 1);
			}else {
				System.out.println("틀렸습니다.. 다시 도전해보세요");
				System.out.println();
				st.VO_day(id, 1);
				}
		}else if (rdnum == 3) {
			if(num1 < num2) {
				int temp = num2;
				num2 = num1;
				num1 = temp;}
			System.out.println("몫을 구하세요");
			System.out.print(num1 + " / " + num2 + " = ");
			ans = sc.nextInt();
				if(ans == num1 / num2) {
					System.out.println("정답입니다! wis + 1!");
					System.out.println();
					st.VO_trStudy(1, id);
					st.VO_experience(50,id);
					st.VO_day(id, 1);
				}else {
					System.out.println("틀렸습니다.. 다시 도전해보세요");
					System.out.println();
					st.VO_day(id, 1);
			}
		}
		st.Alldate(id);
	}
	
	public void Health(String id) {
		st=dama.vo_loding(id);
		System.out.println(st.getNick() + "(이)가 들 무게를 입력하세요. 현재 Str : " + st.getStr());
		int kg = sc.nextInt();
		
		if(kg > st.getStr()+10) {
			fa.Face_HealthHd(id);
			System.out.println("끙...");
			System.out.println("너무 무거워서 들 수 없어용 T^T");
			System.out.println();
			st.VO_day(id, 1);
		}else if(kg >= st.getStr()-10 && kg <= st.getStr()+10) {
			fa.Face_HealthTwo(id);
			System.out.println("으랏차!!");
			System.out.println("str + 1!");
			System.out.println();
			st.VO_trHealth(1, id);
			st.VO_experience(50,id);
			st.VO_day(id, 1);
		}else if(kg < st.getStr()-10) {
			fa.Face_HealthEz(id);
			System.out.println("이게 뭐야 ... 너무 가볍다 ...");
			System.out.println("운동한 효과가 없네.. str + 0..");
			System.out.println();
			st.VO_day(id, 1);
		}
		st.Alldate(id);
	}
	
	public void Shield(String id) {
		int rdnum = rd.nextInt(5);
		st=dama.vo_loding(id);
		fa.Face_Matzib(id);
		System.out.println("퍽퍽퍽퍽... shd + 1..");
		System.out.println();
		st.VO_trShield(1, id);
		st.VO_experience(50,id);
		st.VO_day(id, 1);
		if(rdnum == 0) {
			fa.Face_Miss(id);
			System.out.println("앗 피했다! luk + 1!");
			System.out.println();
			st.VO_trLuk(1, id);
		}
		st.Alldate(id);
	}
		
	public void Run(String id) {
		st=dama.vo_loding(id);
		System.out.println("D 키를 눌러 달려주세요!! =33");

		int cnt = 0;
		
		while(true) {
		String ans = sc.next();
				
		if(ans.equals("d") || ans.equals("D")) {
			cnt++;
			if(cnt%2 == 0) {
				fa.Face_runOne(id);
				System.out.println("                   달린 바퀴 수 : " + cnt + " / 5");
			}else {
				fa.Face_runTwo(id);
				System.out.println("                   달린 바퀴 수 : " + cnt + " / 5");
			}
			}
			if(cnt == 5) {
				fa.Face_Hard(id);
				System.out.println("헉헉.. 힘들었다.. spd + 1!");
				st.VO_trRun(1, id);
				st.VO_experience(50,id);
				st.VO_day(id, 1);
			break;
			}
		}
		st.Alldate(id);
	}
	
}
