package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}

		}

	}
}
