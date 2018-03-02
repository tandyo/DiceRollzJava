package diceroll;
import java.util.Random;
import java.lang.Math;

public class Dice {
	private int random1;
	Random rand = new Random();
	public Dice(int random1) {
		this.random1 = rand.nextInt(random1 +1);
	}
	public int getValue() {
		return this.random1;
		
	}
	
	

}
