package Buoi7;

import java.util.Scanner;

public class VietHoaKyTuDau {

	public static void main(String[] args) {
		String str;
		boolean foundSpace;

		foundSpace = true;

		System.out.println("Nhap chuoi");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		// xoa khoang trang thua
		str = (str.replaceAll("\\s\\s+", " ")).trim();

		// chuyen doi string sang array
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {

			// neu ki tu la chu
			if (Character.isLetter(c[i])) {

				// neu truoc do la khoang trang
				if (foundSpace) {
					c[i] = Character.toUpperCase(c[i]);
					foundSpace = false;
				}

			} else {
				foundSpace = true;
			}
		}

		// chuyen doi array ve string
		str = String.valueOf(c);

		System.out.println(str);
	}

}