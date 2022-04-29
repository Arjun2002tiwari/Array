import java.util.*;

public class Arr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int freq = sc.nextInt();
		for (int j = 0; j < freq; j++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = n - 1; i >= 0; i--) {

				System.out.print(arr[i] + " ");

			}
			System.out.println();
		}
	}

}
