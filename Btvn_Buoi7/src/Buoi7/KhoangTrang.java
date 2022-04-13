package Buoi7;

import java.util.Scanner;

public class KhoangTrang {

	public static void main(String[] args) {
		String str;

		System.out.println("Nhap chuoi");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		;
		scanner.close();

		str = (str.replaceAll("\\s\\s+", " ")).trim();
		System.out.printf("Chuoi sau khi xoa khoang trang la: %s", str);
	}

}
