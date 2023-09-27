/*
 * by Litvin
In the Take-1,2,3 game two players take turns taking stones from a pile.  On each move a player must take one, two, or three stones.  The player who takes the last stone wins.  
(a)   Determine the winning strategy in this game. 
(b)   Complete the computerMove method
(c)  Complete the humanMove method
(d)   Make sure to test thoroughly!

 */

import java.util.Scanner;

public class Take123 {
	private static Scanner kboard;

	private int stonesLeft;

	public Take123(int n) {
		stonesLeft = n;
	}

	/*
	 * Returns the correct number of stones to take (according to the winning
	 * strategy) when nStones remain in the pile; if such a move is not possible,
	 * returns a random number of stones to take. Precondition: nStones > 0
	 */
	public int computerMove(int nStones) {

		// YOUR CODE HERE
	}

	/*
	 * Prompts the user to take a number of stones; If the move is valid, returns
	 * the number of stones taken; otherwise, displays an error message --
	 * "You are allowed to only take 1, 2, or 3 stones" or
	 * "Can't take that many: only <nStones> left in the pile" -- and returns -1:
	 * Precondition: nStones > 0
	 */
	public int humanMove(int nStones) {
		System.out.print("How many stones do you take? ");
		int n = kboard.nextInt();
		//YOUR CODE HERE
	}

	/**
	 * Plays the game
	 */
	public void play() {
		while (stonesLeft > 0) {
			System.out.println(stonesLeft + " stone(s) left in the pile");

			int n = -1;
			while (n < 0)
				n = humanMove(stonesLeft);
			stonesLeft -= n;
			System.out.println("You took " + n + " stone(s)");
			if (stonesLeft == 0) {
				System.out.println("Congrats -- you won!");
			} else {
				n = computerMove(stonesLeft);
				stonesLeft -= n;
				System.out.println("I take " + n + " stone(s)");
				if (stonesLeft == 0)
					System.out.println("Hooray -- I won!");
			}
		}
	}

	/****************************************************************/

	public static void main(String[] args) {
		kboard = new Scanner(System.in);

		int n = 8 + (int) (4 * Math.random());
		Take123 game = new Take123(n);
		game.play();

		kboard.close();
	}
}