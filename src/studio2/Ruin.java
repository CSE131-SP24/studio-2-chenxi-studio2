package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.print("Enter your start amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Enter the win probability: ");
		double winChance = in.nextDouble();
		System.out.print("Enter your win limit: ");
		double winLimit = in.nextDouble();
		while(0 < startAmount && startAmount <9.5) {
			double chance = Math.random();
			if (chance >= winChance)
			{System.out.println("Win");
			startAmount++;
			}
			if (chance < winChance)
			{System.out.println("Lose");
			startAmount--;
			}
		}
		System.out.println("Win amount: " + startAmount + ".");
		
		
		// TODO Auto-generated method stub

	}

}
