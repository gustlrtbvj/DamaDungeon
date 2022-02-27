package Javaproject;

// 메인 화면을 출력하는 클레스입니다.

public class Face {

	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();
	String si = null;
	
	public void Face_Normal(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (O ω O)");
		System.out.println("           .c(__ｕｕ_)");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	}

	public void Face_Sleep(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("                 ∧__∧  ");
		System.out.println("      Zzz     __( ˘ω˘)  ");
		System.out.println("           ∽c(____⊃⊂ ) ");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	} 
	
	public void Face_Eat_Fish(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("             ∧__∧    ");
		System.out.println("         　  (☆o☆ )_ ! ");
		System.out.println("    ><)))˚>  ( __ _  )   ");
		System.out.println("              ˘  ˘ ˘˘   ");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    Atk : "+st.getAtk()+"\t Def : "+st.getShd()+"\t Spd : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t Exp : "+st.getExpe()+"\t 상태 : "+si);
		System.out.println(" 밥을 먹지 쫘압쫘압쩝쩝 후루룩 까꿍");
	}
	
	public void Face_No_Eat(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("                ∧__∧      그만 먹을랭...  ");
		System.out.println("             　 (    )       ");
		System.out.println("  ><)))˚>     ( ·c   )      ");
		System.out.println("                             ");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    Atk : "+st.getAtk()+"\t Def : "+st.getShd()+"\t Spd : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t Exp : "+st.getExpe()+"\t 상태 : "+si);
	}
	
	public void Face_Eat_Medi(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+ " 약초를 먹지 우웩 쓰다 써 인생");
		System.out.println("               ∧___∧    ");
		System.out.println("       _____  (⊙＾⊙ )_ & ");
		System.out.println("      (_약초_)   ( __ _  )   ");
		System.out.println("                 ˘  ˘ ˘˘   ");
		System.out.println();
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	}
	public void Face_No_Medi(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("                ∧__∧    나 안아푼뎅??  ");
		System.out.println("   _____       (    )       ");
		System.out.println("  (_약초_)     ( ·c   )      ");
		System.out.println("                            ");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	}
	
	public void Face_Health(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("                    ");
		System.out.println("          O---∧ _ ∧ ---O      ");
		System.out.println("           　∩(ㅜωㅜ;)∩     ");
		System.out.println("            (  ─┬─   )     ");
		System.out.println("            (  ─┼─   )     ");
		System.out.println("            (  ─┴─   )∽    ");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	}
	
	public void Face_HealthHd(String id) {
		System.out.println("                    ");
		System.out.println("             ∧ _ ∧        ");
		System.out.println("           　(ㅜωㅜ;)     ");
		System.out.println("            (  ─┬─   )     ");
		System.out.println("            (u ─┼─ u )     ");
		System.out.println("            (  ─┴─   )∽    ");
		System.out.println("            O-------O      ");
	}
	
	public void Face_HealthTwo(String id) {
		System.out.println("                    ");
		System.out.println("          O---∧ _ ∧ ---O      ");
		System.out.println("           ∩( >^< )∩     ");
		System.out.println("            (  ─┬─   )     ");
		System.out.println("            (  ─┼─   )     ");
		System.out.println("            (  ─┴─   )∽    ");
	}
	
	public void Face_HealthEz(String id) {
		System.out.println("                    ");
		System.out.println("         O---∧ _ ∧ ---O      ");
		System.out.println("           　( -ω- )∩     ");
		System.out.println("           ⊂(  ─┬─   )     ");
		System.out.println("            (  ─┼─   )     ");
		System.out.println("            (  ─┴─   )∽    ");
	}
	
	public void Face_Matzib(String id) {
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　 (> ㅠ<)  ");
		System.out.println("           .c(__uu_)  "); 
	}
	
	public void Face_Hard(String id) {
		System.out.println("              ∧ _ ∧  ");
		System.out.println("           　;(X ㅠX);  ");
		System.out.println("           .c(__uu_)  "); 
	}
	
	public void Face_run(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("         ∧ _ ∧   ");
		System.out.println("       　(⊙ ω⊙)  ");
		System.out.println("        ┌(     )┘   ");
		System.out.println("         @@@@@@     ");
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	}
	public void Face_runOne(String id) {
		System.out.println("         ∧ _ ∧   ");
		System.out.println("        (⊙ ω⊙)  ");
		System.out.println("        ┌(     )┘   ");
		System.out.println("         @@@@@@     ");
	}
	public void Face_runTwo(String id) {
		System.out.println("         ∧ _ ∧   ");
		System.out.println("        (⊙ ω⊙)  ");
		System.out.println("         (┘    )┐   ");
		System.out.println("         @@@@@@     ");
	}
	public void Face_Fishing(String id) {
		st=dama.vo_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("               ∧__∧    낚시를 하지 (잡았다링~!)");
		System.out.println("            　 (ºωº)   ");
		System.out.println("          〃⌒∠(__u__)┐ ");
		System.out.println("          /           ");
		System.out.println("    ><)))˚>           ");
		System.out.println();
		
	}
	public void Face_FishingMiss(String id) {
		st=dama.vo_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday() );
		System.out.println("               ∧__∧    낚시를 하지 (언제 잡히냐...)");
		System.out.println("            　(ㅠωㅠ )   ");
		System.out.println("          〃⌒∠(___u__)┐ ");
		System.out.println("         /            ");
		System.out.println("                ><)))˚>  ");
	}
	public void Face_Get_Medi(String id) {
		st=dama.vo_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("                ∧__∧     ");
		System.out.println("               (ºωº )    ");
		System.out.println(" ㅛ    ㅛ    ㅛ∠(__u__)┐  ");
		System.out.println("    ㅛ    ㅛ    ㅛ         ");
		System.out.println("  ㅛ    ㅛ    ㅛ             ");
		System.out.println("                        ");
	}
	
	public void Face_Miss_Medi(String id) {
		st=dama.vo_loding(id);
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("               ∧__∧    			     ");
		System.out.println("               (ㅜωㅜ)    약초가 없어ㅜㅜ     ");
		System.out.println("    ㅡ   ㅡ   ∠(__u__)┐  			    ");
		System.out.println("    ㅡ    ㅡ             			     ");
		System.out.println("  ㅡ    ㅡ    ㅡ           			     ");
	}

	public void Face_Fight(String id) {
		System.out.println("        ∧__∧    X    ∩__∩     ");
		System.out.println("       ( ≫⌒≪) /  ＼(≫⌒≪ )    ");
		System.out.println("     ∽(  ___ )      (_____ )∽  ");

	}
	public void Face_Escape(String id) {
		System.out.println("        ∩__∩        ∧___∧      ");
		System.out.println("   ＼ (＠⌒＠ )      (◐∇ ◐;)    ");
		System.out.println("      (_____ )∽   ∽(⊂     )⊃    ");
		System.out.println("                   @@@@@        ");

	}
	public void Face_Miss(String id) {
		System.out.println("    !감나빗      ∧___∧   !!   ");
		System.out.println("              (◐∇◐;;)       ");
		System.out.println("             ∽(⊂     )⊃      ");

	}
	public void Face_Cri(String id) {
		System.out.println("  Critical         ∧___∧      ");
		System.out.println("      Hit   !!!   (x∇x !!)       ");
		System.out.println("                 ∽(⊂     )⊃      ");

	}
	public void Face_De(String id) {
		System.out.println("                    ∧____∧      ");
		System.out.println("                   (   !∇!)       ");
		System.out.println("                  ∽(⊂     )⊃      ");
	}

	
	public void Face_Fire(String id) {
		System.out.println("                      *˚*。*˚*˚*      ");
		System.out.println("        ∧___∧       ˚*。*˚*。*˚**˚    ");
		System.out.println("       ( ● 3●)    ˚*。*˚*。˚*˚*。*˚   ");
		System.out.println("     ∽(    ⊃ )⊃  。˚*。*˚*。˚**˚*。˚     ");
 
	}
	
	public void Face_Gun(String id) {
		System.out.println("                    		  !!!   ");
		System.out.println("         ∧__∧     	 		 ∩__∩	");
		System.out.println("        ( ○ω○)              (x∧x )   ");
		System.out.println("      <( ⊃┌─  )⊃     	⇒  (⊂   ⊂)	");

	}
	
	public void Face_Die(String id) {
		System.out.println("      ┌─────────┐     ");
		System.out.println("      │ D A M A │     ");
		System.out.println("      │  D I E  │     ");
		System.out.println("      │         │     ");
		System.out.println("      │         │     ");
		System.out.println("      │         │     ");
		System.out.println("      │         │     ");
		System.out.println("    ──┴──     ──┴──   ");
	}
	
	public void Face_Talk(String id) {
		System.out.println("            			  	");
		System.out.println(" ┌───────┐    		         ");
		System.out.println(" │       │    				  ");
		System.out.println(" └───────┘     			      ");
		System.out.println("            ˚ · . ∧____∧       ");
		System.out.println("                  ( -ω - )__    ");
		System.out.println("                   (⊃⊂     )～  ");
	}
	
	public void Face_Sick(String id) {
		st=dama.vo_loding(id);
		if (st.getSickday()<1) {si = "건강";}else {si="아픔";}
		System.out.println("    내 이름은 " + st.getNick()+"       날짜 : "+st.getStartday());
		System.out.println("       ∧ _ ∧        ");
		System.out.println("      (＠ △＠)       ");
		System.out.println("     ┌───────┐      "); 
		System.out.println("     │┌─────┐│      "); 
		System.out.println("     ││     ││      "); 
		System.out.println("     │└─────┘│      "); 
		System.out.println("     └───────┘      "); 
		System.out.println("    HP  : "+st.getHp()+"/"+st.getMaxhp()+"\t ENE : "+st.getEne()+"/"+st.getMaxene());
		System.out.println("    ATK : "+st.getAtk()+"\t DEF : "+st.getShd()+"\t SPD : "+st.getSpd());
		System.out.println("    Lv  : "+st.getLv()+"\t EXP : "+st.getExpe()+"\t 상태 : "+si);
	}
	public void Face_Boss(String id) {
		System.out.println("                                               ⊥⊥⊥⊥⊥⊥⊥⊥⊥⊥⊥");
		System.out.println("                          ＼＼                  ┌──────────┐");
		System.out.println("                            ＼＼                │ ◎。 ◎    │");
		System.out.println("                              ＼＼              │PRINTLN();│");
		System.out.println("                                ＼＼            └──────────┘");
		System.out.println("              ∧ _ ∧   /           ＼＼	     @@@@@@@@@@@@@@@@@");
		System.out.println("             ( ◑△◑) /               ＼＼    @@    @@JAVA@@     @@	");
		System.out.println("            ( ≥   )≥                     @@       @@@@@         @@");	
		System.out.println("              ˇ  ˇ                                 @@@");
		System.out.println("                                                 @@   @@");
		System.out.println("                                               @@       @@");
		System.out.println("                                             @@           @@");
	}
	public void face_main() {
		System.out.println("\r\n"
				+ "                                                        $=--.                                                                   \r\n"
				+ "                                                      . @@--,-                                                                  \r\n"
				+ "                                                     , ~#@~--,. .                                                               \r\n"
				+ "                                                    -~@@@@@@!-,.                                                                \r\n"
				+ "                                                   $#@@$@#*@@@#$.                                                               \r\n"
				+ "                                                 ;@@=;--#=--:~$@#~                                                              \r\n"
				+ "                                           .,  ~#*,,,,-,!!,---,,!@=                                                             \r\n"
				+ "                                           *@~~@;   .-,.-----,,. ~@$-!=                                                         \r\n"
				+ "                                          -@@@@;    .,.,,,.,,,..  ;@@@@,                                                        \r\n"
				+ "                                            *@@@. ,.,,,.  ,. ,.,..@@@@                                                          \r\n"
				+ "                                            $$,~~ ,,,,.     .....:~.-@;                                                         \r\n"
				+ "       ....                                ;@     ....      ....    .!!...                                                      \r\n"
				+ "    ~;!##@$..                              @$      ...      ...   -**#@@@~..                                                    \r\n"
				+ "    !@@@@@@!                              :@;      ...  !    . .  .@@@@@@#,..                                               -;;,\r\n"
				+ "    .@@@ @@#                        ,.     = ..   ,  . -@*   .;   .*@@  @@-,..                                              ..;,\r\n"
				+ "   ..@@@  @@-     .:........ .. ..~.,,.  .;-  .   $-  -@#@=  ,$   .:@@  @@#,.............,*.     .*: ...-*:...............=...,.\r\n"
				+ "   ..$@@  @@:  ..,=@-*=$!;$:~!!,:=@,-,...!@~  ..  $*  -@@@*  :=   .:@@  @@@;********!!!.~$@..    @@ .~=$@@*..:=*=*,:!!!.:$@,... \r\n"
				+ "   ..$@@  @@#  ,;@@@,-#@@@@   @@@@#,,-,~@@@-  ..   @~  $@@;  @;   .~@@   @@ @@@  @@  @@@@@@     @@@ -@@#@@$  @@@@@;  @@@@@@,,.. \r\n"
				+ "   ..*@@  @@@  ;@@@@  @@$-@@ @@#=@@,,-:@@@@;,     =@@@#$$#@@@@$   .~@@   @@ @@@  @@  @@  @@   @@@@@ ;@@  @#  @@  @@  @@  @@,,.. \r\n"
				+ "   ..*@@   @@ ;@  @@  @@   @@@   @@,,!@@ @@*,    :#@@@==!*=$@@@$. .~@@   @@ @@@  @@  @@  @@  @@  @@ #@@  @# @@   @@  @@  @@--,. \r\n"
				+ "   .,=@@   @@ @@  @@  @@   @@@   @@,,@@  @@*,.   ~@@@@#$#@$@@@@$. .:@@   @@ @@@  @@  @@  @@  @@  @@ @@@  @@ @@   @@  @@  @@--,. \r\n"
				+ "   .,=@@   @@ @$  @@# @@   @@@   @@,,@@  @@=,,..  =@@#@@@@@@@@#   .:@@   @@  @@  @@  @@  @@ @@   @@ @@@@@@@ @@   @@  @@  @@~-,. \r\n"
				+ "   .,*@@  @@# @$  @@# @@   @@@   @@,~@@  @@=,. .  ,**@@@@@@@@*:   .:@@   @@  @@  @@  @@  @@ @@   @@ #@@     @@   @@  @@  @@~-,. \r\n"
				+ "   .,=@@  @@; @$  @@$ @@   @@@   @@,;@@  @@=,. .     ;@@@@@@$     .:@@  @@@  @@  @@  @@  @@ @@   @@ *@@     @@   @@  @@  @@:-,. \r\n"
				+ "   .,@@@-*@@~ @@@@@@  @@   @@@   @@,;@@  @@!~. .    =@@!:!$@@;    .;@@  @@$  @@#@@@  @@  @@ #@@@@@@ :@@      @@  @@  @@  @@;-,. \r\n"
				+ "   .,@@@$@@@~ @@@#@@  @@   @@@   @@--@@@@@@!--,,    #@@=!=@@@;    ,=@@@#@@   @@@@@@  @@  @@ *@@@#@@  *@@     @@ @@#  @@  @@;-,. \r\n"
				+ "   ,$@@@@@=;: @@*-@@@ @#   @@@   @@;-@@#~#@@@-      ;$$@#@@##-   .!@##@@$    @@@@@@  @@  @@  @@  @@   #@@@!--=@@@@: @@@  @@!-,. \r\n"
				+ "   .-~~~~~-~~ !=-~*=~~---~!=!:~-~~~ ~:=~:;*:--.        #@@#      ,,,-----~~~-;:~~;;;~---~=@@;   ~@@#~:~*!!----~~~~~~~---~~~~~,. \r\n"
				+ "    .,,-----------~~---------------$~----~~--,.        $$#$       ..,------,,----~~~-------$@@   #@@-~~--,,,,,------------~~;.. \r\n"
				+ "     ..,,,,,,,,,,,,,.....,,,,,,,,,,,....,,,,..         $#==        ....,.......,,,,,,,,,,,-~@@@  ##~~-,,........,,,.....,,,,,.. \r\n"
				+ "      .......  ......    ............ ......           $#@=          ....      ...........,-@@@@@@:~-,,...    ................  \r\n"
				+ "                                                       $##=                               .,~@@@@~~-,..                         \r\n"
				+ "                                                       $$#=                               ..-*@#~~-,..                          \r\n"
				+ "                                                       $@@=                                .,-:-~-,,.                           \r\n"
				+ "                                                       $#@=                                 .,,-,,..                            \r\n"
				+ "                                                       $@$=                                  ......                             \r\n"
				+ "                                                      .#@@$                                                                     \r\n"
				+ "                                                      $$;*#                                                                     \r\n"
				+ "                                                      *@$$@                                                                     \r\n"
				+ "                                                       !@@,                                                                     \r\n"
				+ "                                                        :~                                                                      \r\n"
				+ "                                                 DAMA   ∀   DUNGEON                                                          ");
	}
	
}
