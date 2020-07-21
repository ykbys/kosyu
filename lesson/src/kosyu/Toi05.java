package kosyu;

import java.util.Scanner;

public class Toi05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 5;
		int count = 0;

		while(a<b) {
			a++;
			count++;
		}

		System.out.println("aの値は" + a + "です");
		System.out.println("繰り返しの回数は" + count + "です");

		scan.close();
	}

}
