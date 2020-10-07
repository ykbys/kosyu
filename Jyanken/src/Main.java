
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		message mes =new message();
		Player player_you = new Player("あなた");
		Player player_cpu =new Player("CPU");
		String result;
		final int max_battle = 10;


		mes.mes_start();

		for (int count = 0; count < max_battle; count++) {
			boolean roop = true;
			while(roop) {
				System.out.println(count+1 +"回戦目");
				mes.mes_battle();
				player_you.set_hand(Input.input_hand());
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

		mes.mes_result(player_you.win_count);

	}

}
