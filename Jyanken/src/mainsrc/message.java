package mainsrc;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class message {
    final Properties prop = new Properties();
    String path = new File(".").getAbsoluteFile().getParent();
    final String filepass = path + "/src/mainsrc/jyanken.properties";

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
    	if(0 == win_count) {
    		System.out.println(prop.getProperty("0win"));
    	}else if(1<=win_count && win_count<=3) {
    		System.out.println(prop.getProperty("3win"));
    	}else if(4<=win_count && win_count<=7) {
    		System.out.println(prop.getProperty("7win"));
    	}else if(8<=win_count && win_count<=9) {
    		System.out.println(prop.getProperty("9win"));
    	}else if(win_count == 10) {
    		System.out.println(prop.getProperty("10win"));
    	}
    }
}


