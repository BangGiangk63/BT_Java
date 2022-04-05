package bai2;

import java.util.Scanner;

public class TinhToan {
	public static void main(String[] args) {
		try {
			int a;
			int b;
			int number;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap so a = ");
			a = scanner.nextInt();
			System.out.println("Nhap so b = ");
			b = scanner.nextInt();
			do {
				System.out.println(" \n>> MAY TINH CA NHAN <<");
				System.out.println("+----------------------+");
				System.out.println("| 1. Cong    |");
				System.out.println("| 2. Tru     |");
				System.out.println("| 3. Nhan     |");
				System.out.println("| 4. Ket thuc   |");
				System.out.println("+----------------------+");
				System.out.println("Chon chuc nang");
				number = scanner.nextInt();
				switch (number) {
				case 1:
					int sum;
					sum = 0;
					sum = Sum(a, b);
					System.out.printf("\nTong 2 so %d + %d = %d", a, b, sum);
					break;
				case 2:
					int sub;
					sub = 0;
					sub = Subtraction(a, b);
					System.out.printf("\nHieu 2 so %d - %d = %d", a, b, sub);
					break;
				case 3:
					int mul;
					mul = 0;
					mul = Mul(a, b);
					System.out.printf("\nTich 2 so %d * %d = %d", a, b, mul);
					break;
				case 4:
					System.out.println("\nKet thuc !");
					break;
				default:
					System.out.println("Vui long nhap lai");
					break;
				}
			} while (number >= 1 && number <= 4);

		} catch (Exception ex) {
			System.out.println("Vui long nhap lai");
		}
	}

	public static int Sum(int a, int b) {
		return a + b;
	}

	public static int Subtraction(int a, int b) {
		return a - b;
	}

	public static int Mul(int a, int b) {
		return a * b;
	}
}
