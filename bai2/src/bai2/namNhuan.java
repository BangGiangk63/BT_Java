package bai2;

import java.util.Scanner;

public class namNhuan {
	public static void main(String[] args) {
		try {
			int year;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap nam");
			year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				System.out.println("Nam nhuan");
			else
				System.out.println("Nam khong nhuan");
		} catch (Exception ex) {
			System.out.println("Nhap lai gia tri so!");
		}

	}
}
