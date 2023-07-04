package ch03_반복;

import java.util.Scanner;

// 백준 2739번
public class Multiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for (int i = 0 + 1; i < 10; i++) {
			int value = num * i;
			System.out.println(num + " * " + i + " = " + value);
		}

	}
}
