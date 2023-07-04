package ch02_조건;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double thousand = 1000;

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if (-thousand <= x && x <= thousand && x != 0 && -thousand <= y && y <= thousand && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println(1);
			} else if (x < 0 && y > 0) {
				System.out.println(2);
			} else if (x < 0 && y < 0) {
				System.out.println(3);
			} else if (x > 0 && y < 0) {
				System.out.println(4);
			}

		}
	}
}
