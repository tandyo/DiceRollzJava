package diceroll;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		String check = "y";
		
		do {
			
		System.out.println("Die face:");
		Scanner dieFace = new Scanner(System.in);
		int die = dieFace.nextInt();
		
		Dice roll = new Dice(die);
		System.out.println(roll.getValue());
		
		System.out.println("Roll again? [y]/[n]");
		Scanner rollAgain = new Scanner (System.in);
		String check1 = rollAgain.nextLine();
		check = check1;
		}while(check.equals("y"));
		
		System.out.println("okay");
	}

}
