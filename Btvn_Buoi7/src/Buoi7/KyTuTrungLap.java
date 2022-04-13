package Buoi7;

import java.util.Scanner;

public class KyTuTrungLap {
	public static void main(String[] args) {
		String str;

		System.out.println("Nhap chuoi");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

	}

	public static char TimKyTu(String str) {
		// chuyen chuoi thanh mang
		char[] arr = str.toCharArray();
		int lengthArr = arr.length;

		for (int i = 0; i < lengthArr; i++) {
			for (int j = i + 1; j < lengthArr; j++) {

				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}
}
