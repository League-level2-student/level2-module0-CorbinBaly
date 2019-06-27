package arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {

	public static void main(String[] args) {
		int small= 0;
		int big= 0;
		int lastnumber = 0;
		// 1. make an array of 5 Strings
		String[] sentences = new String[5];
		// 2. print the third element in the array
		System.out.println(sentences[3]);
		// 3. set the third element to a different value
		sentences[3] = "Different Value";
		// 4. print the third element again
		System.out.println(sentences[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
		}
		// 6. make an array of 50 integers
		int numbers[] = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			Random rand = new Random();
			int value = rand.nextInt(999);
			numbers[i] = value;
			System.out.println(numbers[i]);
		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		small = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (small > numbers[i]) {
				small = numbers[i];
			}
		}
		System.out.println("The smallest number is"+small);
		// 9 print the entire array to see if step 8 was correct
big = numbers[0];
		// 10. print the largest number in the array.
		for (int i1 = 0; i1 < numbers.length; i1++) {
			if (big < numbers[i1]) {
				big = numbers[i1];
			}
			//Resetting lastnumber to be current number
			lastnumber=numbers[i1];
		}
		System.out.println("The Biggest Number"+ big);
	}
}
