package kosyu;

import java.util.Scanner;

public class Toi07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		int b = 0;

		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();

		for(int i = 0 ; i < max ; i++) {
			if( a > b ) {
				b++;
				System.out.println("a="+a+",b="+b+",i="+i);
			}else {
				a++;
				System.out.println("a="+a+",b="+b+",i="+i);
			}
		}

		scan.close();
	}

}
