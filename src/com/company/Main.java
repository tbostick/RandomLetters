package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		String possibleword = "N";

		String selectedLetters = "";
		String[] rLetters = new String[26];
		//String [] rLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
		//"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		rLetters[0] = "A";
		rLetters[1] = "B";
		rLetters[2] = "C";
		rLetters[3] = "D";
		rLetters[4] = "E";
		rLetters[5] = "F";
		rLetters[6] = "G";
		rLetters[7] = "H";
		rLetters[8] = "I";
		rLetters[9] = "J";
		rLetters[10] = "K";
		rLetters[11] = "L";
		rLetters[12] = "M";
		rLetters[13] = "N";
		rLetters[14] = "O";
		rLetters[15] = "P";
		rLetters[16] = "Q";
		rLetters[17] = "R";
		rLetters[18] = "S";
		rLetters[19] = "T";
		rLetters[20] = "U";
		rLetters[21] = "V";
		rLetters[22] = "W";
		rLetters[23] = "X";
		rLetters[24] = "Y";
		rLetters[25] = "Z";

		String question = "";
		do {
			System.out.println("How long do you want your word to be?");
			int numletters = keyboard.nextInt();

			//int x = 1 + r.nextInt(26);
			for (int i = 0; i < numletters; i++) {
//				int x = 1 + r.nextInt(26);
				int x = r.nextInt(rLetters.length);

				selectedLetters = rLetters[x] + selectedLetters;
			}

			if (selectedLetters.contains("A") || selectedLetters.contains("E") ||
					selectedLetters.contains("I") || selectedLetters.contains("O") ||
					selectedLetters.contains("U")) {
				System.out.println("might be a word");
			} else {
				System.out.println("is not a word.");
			}
			System.out.println("The selected letters were " + selectedLetters);

			{
				selectedLetters = " ";
				System.out.println("Do you want to try again? y or n");
				 question = keyboard.next();

				if (question.equalsIgnoreCase("n")) {
					System.out.println("Thank you for your participation.");
					System.exit(0);
				}
			}
		} while (question.equalsIgnoreCase("y"));
	}
}