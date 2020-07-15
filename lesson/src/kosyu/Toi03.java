package kosyu;

import java.util.Scanner;

public class Toi03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int nenrei = scan.nextInt();
		int kakaku = 0;

		if(nenrei <= 12) {
			kakaku = 0;
		}else if(nenrei <= 15) {
			kakaku = 300;
		}else {
			kakaku = 500;
		}

		System.out.println("年齢は" + nenrei + "、価格は" + kakaku + "です");

		scan.close();
	}
}
