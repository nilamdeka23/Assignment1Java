import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the size of your series: ");

		if (userInput.hasNextInt()) {
			int size = userInput.nextInt();
			if (size > 2) {

				System.out.println("Please enter your series of integers");

				int[] sequence = new int[size];

				for (int i = 0; i < size; i++) {
					if (userInput.hasNextInt()) {
						sequence[i] = userInput.nextInt();
					} else {
						System.out.println("Sorry! This is an invalid input.");
						break;
					}
				}

				if (isUnique(sequence)) {
					System.out.println(isAP(sequence) + "");
				} else {
					System.out.println("No, It's not an Arithmetic Progression");
				}

			} else {
				System.out.println("Sorry! Your series must be atleast of size 3");
			}

		} else {
			System.out.println("Sorry! This is an invalid input.");
		}

		userInput.close();

	}

	/*
	 * method to validate if each element of a sequence is unique
	 */
	private static boolean isUnique(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/*
	 * method to validate if a sequence of integers is an arithmetic progression
	 */
	private static String isAP(int[] numbers) {
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 2; i++) {
			if (!(Math.abs(numbers[i] - numbers[i + 1]) == Math.abs(numbers[i + 1] - numbers[i + 2]))) {
				return "No, It's not an Arithmetic Progression";
			}
		}
		return "Yes! It's an Arithmetic Progression";
	}

}
