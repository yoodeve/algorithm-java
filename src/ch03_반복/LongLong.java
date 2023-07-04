package ch03_반복;

import java.util.Scanner;

public class LongLong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean scope = num >= 4 && num <= 1000;

		String longWord = "";

		if (num % 4 == 0 && scope) {
			int multi = num / 4;
			for (int i = 0; i < multi; i++) {
				longWord += "long ";
			}
		}
		System.out.println(longWord + "int");

	}

}
