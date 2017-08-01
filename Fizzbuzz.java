/*
Simple program that plays the game Fizzbuzz 
from 1 to 100
If a number is a multiple of 3 you replace the number print with Fizz
If a number is a multiple of 5 you replace the number print with Buzz
If a number is a multiple of both 3 and 5 you replace the number print with FizzBuzz
*/
public class Fizzbuzz {

	private static final int MAX = 100;
	private static final int FIZZ_CONST = 3;
	private static final int BUZZ_CONST = 5;
	//Fizzbuzz
	public static void main(String[] args) {
		System.out.println("Starting game");
		for (int idx = 1; idx < MAX; idx++) {
			String print = "";
			if (idx % FIZZ_CONST == 0) {
				print += "Fizz";
			} 
			if (idx % BUZZ_CONST == 0) {
				print += "Buzz";
			} 
			if (print.isEmpty()) {
				print += idx;
			}
			System.out.println(print);
		}
		System.out.println("Ending game");
	}
}