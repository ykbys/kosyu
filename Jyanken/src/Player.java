import java.util.Random;

public class Player{
	public String name;
	public handtype hand;
	public int win_count;

	Player(String name){
		this.name = name;
	}

	public void set_hand(int type) {

		if(type==1) {
			hand = new gu();
		}else if(type == 2) {
			hand = new choki();
		}else if (type == 3) {
			hand = new pa();
		}
	}

	public void set_hand() {
		Random rund =new Random();
		set_hand(rund.nextInt(3)+1);
	}

	public handtype get_hand() {
		return hand;
	}

	public void win() {
		win_count++;
	}
}
