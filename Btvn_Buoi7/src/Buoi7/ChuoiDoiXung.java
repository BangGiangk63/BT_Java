package Buoi7;

import java.util.Scanner;

public class ChuoiDoiXung {
	public static void main(String[] args) {
		String str;
		String chuoiDaoNguoc;
		chuoiDaoNguoc = "";

		System.out.println("Nhap chuoi");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		char[] arr = str.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			chuoiDaoNguoc = chuoiDaoNguoc + arr[i];
		}
		if (str.equals(chuoiDaoNguoc))
			System.out.println("Chuoi doi xung");
		else
			System.out.println("Khong la chuoi doi xung");
	}
}
