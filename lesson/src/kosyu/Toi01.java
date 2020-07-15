package kosyu;

import java.util.Scanner;

public class Toi01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int c = a + b;
		System.out.println(c);
		System.out.println(++c);

		scan.close();
	}

}
