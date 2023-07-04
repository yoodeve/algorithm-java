package ch03_반복;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		System.out.println(T);
		for (int i = 1; i < T + 1; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			if (0 < A && B < 10) {
				System.out.println("Case #" + i + ": " + (A + B));
			}
		}
		scanner.close();

	}

}
