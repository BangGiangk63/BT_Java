package Buoi7;

import java.util.Scanner;

public class DaoNguocChuoi {
	public static void main(String[] args) {
		String str;
		String chuoiDaoNguoc;
		chuoiDaoNguoc = "";

		System.out.println("Nhap chuoi");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		char[] arr = str.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--)
			chuoiDaoNguoc = chuoiDaoNguoc + arr[i];

		System.out.printf("Chuoi sau khi dao nguoc la %s", chuoiDaoNguoc);
	}
}