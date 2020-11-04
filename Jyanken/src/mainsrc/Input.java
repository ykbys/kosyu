package mainsrc;
import java.util.Scanner;


public class Input {
    public static int input_hand() {
    	boolean roop = true;
        int i = 0;
    	Scanner scan;

        while(roop) {
	    	scan = new Scanner(System.in);
	    	if(scan.hasNextInt()) {
	    		i = scan.nextInt();
	    	}else {
	    		i = 0;
	    	}

	        if(1<=i && i<=3) {
	        	roop = false;
	        }else {
	        	System.out.println("1～3の数字を入力してください。");
	        }
    	};

    	return i;
    }
}