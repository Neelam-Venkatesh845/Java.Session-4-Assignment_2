import java.util.Arrays;

public class Assignment2 {

	public static void main(String[] args) {

		int rollNos[] = { 3, 8, 1, -6, 4, -2, 0 };
		for (int number : rollNos) {
			System.out.println("data " + number);
		}
		Arrays.sort(rollNos);
		System.out.println("The sorted array is:");
		for (int number : rollNos) {
			System.out.println("Number = " + number);
		}

	}

}
