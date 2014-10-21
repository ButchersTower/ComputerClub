package ComputerClub;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
		new RPS();
	}

	public RPS() {
		simpelGame();
	}

	void simpelGame() {
		int playChoice;
		System.out.println("Make a choice");
		System.out.println("1: rock\n2: paper\n3: Sissors");
		Scanner scan = new Scanner(System.in);
		playChoice = scan.nextInt();
		if (playChoice == 1) {
			System.out.println("you picked rock");
		} else if (playChoice == 2) {
			System.out.println("you picked paper");
		} else if (playChoice == 3) {
			System.out.println("you picked sissors");
		}
		Random rand = new Random();
		int compChoice = rand.nextInt(3);
		if (compChoice == 0) {
			System.out.println("computer picked rock");
		} else if (compChoice == 1) {
			System.out.println("computer picked paper");
		} else if (compChoice == 2) {
			System.out.println("computer picked sissors");
		}

		if (playChoice == 1) {
			if (compChoice == 0) {
				System.out.println("tie");
			} else if (compChoice == 1) {
				System.out.println("you lost");
			} else if (compChoice == 2) {
				System.out.println("you win");
			}
		} else if (playChoice == 1) {
			if (compChoice == 0) {
				System.out.println("you win");
			} else if (compChoice == 1) {
				System.out.println("tie");
			} else if (compChoice == 2) {
				System.out.println("you lost");
			}
		} else if (playChoice == 2) {
			if (compChoice == 0) {
				System.out.println("you lost");
			} else if (compChoice == 1) {
				System.out.println("you win");
			} else if (compChoice == 2) {
				System.out.println("tie");
			}
		}
	}

	void caseGame() {
		int playChoice;
		System.out.println("Make a choice");
		System.out.println("1: rock\n2: paper\n3: Sissors");
		Scanner scan = new Scanner(System.in);
		playChoice = scan.nextInt();
		switch (playChoice) {
		case 1:
			System.out.println("rock");
			break;
		case 2:
			System.out.println("paper");
			break;
		case 3:
			System.out.println("sissors");
			break;
		}
		System.out.println("after");
	}
}
