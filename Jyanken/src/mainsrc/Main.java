package mainsrc;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Util util_mes =new Util();
		Player player_you = new Player("あなた");
		Player player_cpu =new Player("CPU");
		String result;
		final int max_battle = 10;


		util_mes.mes_start();

		for (int count = 0; count < max_battle; count++) {
			boolean roop = true;
			while(roop) {
				System.out.println(count+1 +"回戦目");
				util_mes.mes_battle();
				player_you.set_hand(Util.input_hand());
				player_cpu.set_hand();

				System.out.println(player_you.name+"は"+player_you.hand.type());
				System.out.println(player_cpu.name+"は"+player_cpu.hand.type());

				result = new judge().result(player_you, player_cpu);

				if(result != "あいこ") {
					System.out.println(result+"ました。\n");
					roop = false;
				}else {
					System.out.println(result+"です。\n");
				}

			}

		}

		util_mes.mes_result(player_you.win_count);

	}

}
