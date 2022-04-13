package Buoi7;

import java.util.Scanner;

public class ChuyenCharThanhString {
	public static void main(String[] args) {
		char c;

		System.out.println("Nhap ky tu");
		Scanner scanner = new Scanner(System.in);
		c = scanner.next().charAt(0);
		scanner.close();

		String str = String.valueOf(c);
		System.out.printf("Chuoi sau khi chuyen la %s", str);

	}
}
