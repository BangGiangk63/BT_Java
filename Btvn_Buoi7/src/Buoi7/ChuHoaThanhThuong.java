package Buoi7;

import java.util.Scanner;

public class ChuHoaThanhThuong {
	public static void main(String[] args) {
		String str;

		System.out.println("Nhap chuoi");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		// chuyen string ve array
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			c[i] = Character.toLowerCase(c[i]);
		}

		// chuyen array ve string
		str = String.valueOf(c);
		System.out.println(str);

	}
}
