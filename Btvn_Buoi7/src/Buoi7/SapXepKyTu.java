package Buoi7;

import java.util.Scanner;

public class SapXepKyTu {

	public static void main(String[] args) {

		int count;

		System.out.println("Nhap so chuoi muon sap xep");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();

		String str[] = new String[count];
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Nhap tung chuoi");
		for (int i = 0; i < count; i++) {
			str[i] = scanner1.nextLine();
		}
		scanner.close();
		scanner1.close();

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {

				if (str[i].compareTo(str[j]) > 0)
					hoanViChuoi(str[i], str[j]);
			}
		}

		System.out.println("Chuoi sau khi da sap xep la");
		for (String s : str)
			System.out.println(s);

	}

	public static void hoanViChuoi(String str1, String str2) {
		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
	}
}
