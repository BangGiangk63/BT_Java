package bai2;

import java.util.Scanner;

public class Chanle {
	public static void main(String[] args) {
		try {
			int a;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap so");
			a = scanner.nextInt();
			if (a % 2 == 0)
				System.out.println("So chan");
			else
				System.out.println("So le");
		} catch (Exception ex) {
			System.out.println("Nhap lai");
		}
	}
}
