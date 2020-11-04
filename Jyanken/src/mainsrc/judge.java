package mainsrc;
public class judge {

	public String result(Player you,Player cpu) {

		if(you.hand.type() == cpu.hand.type()) {
			return "あいこ";
		}

		if(
			(you.hand.type() == "グー" && cpu.hand.type() == "チョキ")||
			(you.hand.type() == "チョキ" && cpu.hand.type() == "パー")||
			(you.hand.type() == "パー" && cpu.hand.type() == "グー")
		){
			you.win();
			return "勝ち";

		}else {
			cpu.win();
			return "負け";
		}


	}


}
