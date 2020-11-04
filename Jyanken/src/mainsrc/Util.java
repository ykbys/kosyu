package mainsrc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class Util {

	final Properties prop = new Properties();
    String path = new File(".").getAbsoluteFile().getParent();
    final String filepass = path + "/src/mainsrc/jyanken.properties";

    final int win_count_0 = 0;
    final int win_count_1 = 1;
    final int win_count_3 = 3;
    final int win_count_7 = 7;
    final int win_count_9 = 9;
    final int win_count_10 = 10;


    public static int input_hand() {
    	boolean roop = true;
        int check_int = 0;
    	Scanner scan;

        while(roop) {
	    	scan = new Scanner(System.in);
	    	if(scan.hasNextInt()) {
	    		check_int = scan.nextInt();
	    	}else {
	    		check_int = 0;
	    	}

	        if(1<=check_int && check_int<=3) {
	        	roop = false;
	        }else {
	        	System.out.println("1～3の数字を入力してください。");
	        }
    	};

    	return check_int;
    }

    InputStreamReader inStream = null;{
	    try {
	        inStream =new InputStreamReader(new FileInputStream(filepass), "UTF-8");
	        prop.load(inStream);
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (inStream != null) {
	                inStream.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
    }

    public void mes_start() {
    	System.out.println(prop.getProperty("start"));
    }
    public void mes_battle() {
    	System.out.println(prop.getProperty("battle"));
    }
    public void mes_result(int win_count) {
    	if(win_count_0 == win_count) {
    		System.out.println(prop.getProperty("0win"));
    	}else if(win_count_1<=win_count && win_count<=win_count_3) {
    		System.out.println(prop.getProperty("3win"));
    	}else if(win_count_3<win_count && win_count<=win_count_7) {
    		System.out.println(prop.getProperty("7win"));
    	}else if(win_count_7<win_count && win_count<=win_count_9) {
    		System.out.println(prop.getProperty("9win"));
    	}else if(win_count == win_count_10) {
    		System.out.println(prop.getProperty("10win"));
    	}
    }

}


