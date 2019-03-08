package MiniLab_1;/*
GLP ACS Mini-Lab 1
This program prompts the user to enter several numbers,
stores the numbers into an array,
then prints the numbers in forwards and backwards order.
Expected example output:
How many numbers will you enter? 4
Type a number: 12
Type a number: 8
Type a number: -2
Type a number: 39
Your numbers in forward order:
12
8
-2
39
Your numbers in backward order:
39
-2
8
12
*/

import java.util.Arrays;
import java.util.Scanner;

public class PromptNumbers {
	public static void forward(int[] list){
		String answer = list.toString();
		System.out.println(Arrays.toString((list)
		));

	}
	public static void reverse(int[] list){
		int[] backwards = new int[list.length];
		int length = list.length;
		for(int i = 0; i < length; i++){
			backwards[length - (i + 1)] = list[i];
		}
		System.out.println(Arrays.toString(backwards));
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int count = console.nextInt();
		int[] listo = new int[count];
		
		
		for (int i = 0; i < count; i++) {
			// your code goes here; store the numbers
			System.out.print("Type a number: ");
			int enter = console.nextInt();
			listo[i] = enter;
			
		}
		
		System.out.println();
		System.out.println("Your numbers in forward order:");
		
		for (int i = 0; i < count; i++) {
			// your code goes here; print the numbers in forward order

		
		}
		System.out.println(Arrays.toString(listo));

		System.out.println();
		System.out.println("Your numbers in backward order:");
		int[] reverse = new int[count];
		// your code goes here; print the numbers in backward order
		for (int i = 0; i < count; i++) {
			// your code goes here; print the numbers in forward order
			reverse[i] = listo[count - (i+1)];


		}

		System.out.println(Arrays.toString(reverse));

		forward(listo);
		reverse(listo);
		
	}
}
