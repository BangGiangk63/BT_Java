package bai2;

import java.util.Scanner;

public class nguyenAm {
	public static void main(String[] args) {
		char kyTu;
		boolean bool = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mot ky tu");
		kyTu = scanner.next().charAt(0);
		switch (kyTu) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			bool = true;

		}
		if ((kyTu >= 'a' && kyTu <= 'z') || (kyTu >= 'A' && kyTu <= 'Z')) {
			if (bool == true)
				System.out.println("Nguyen am");
			else
				System.out.println("Phu am");
		} else
			System.out.println("Nhap lai ky tu trong bang chu cai");

	}
}
