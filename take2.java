package ComputerClub;

import java.util.Random;
import java.util.Scanner;

public class take2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your element: ");
		int yourElement = scan.nextInt();

		Random rand = new Random();
		int compElement = rand.nextInt(3);
		System.out.println("computerElement: " + compElement);

		if (yourElement == 0) {
			if (compElement == 0) {
				System.out.println("tie");
			}
			if (compElement == 1) {
				System.out.println("you lose");
			}
		}
	}
}
