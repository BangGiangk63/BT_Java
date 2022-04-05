package bai2;

import java.util.Scanner;

class soPhuc {
	float thuc;
	float ao;
}

class sum {
	public static soPhuc nhap() {
		soPhuc sophuc = new soPhuc();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap phan thuc");
		sophuc.thuc = scanner.nextFloat();
		System.out.println("Nhap phan ao");
		sophuc.ao = scanner.nextFloat();
		return sophuc;
	}

	public static void tong(soPhuc a, soPhuc b) {
		soPhuc tong = new soPhuc();
		tong.thuc = a.thuc + b.thuc;
		tong.ao = a.ao + b.ao;
		System.out.println("Tong 2 so phuc = " + tong.thuc + "+" + tong.ao + "j");
	}

	public static void main(String[] args) {
		soPhuc a = new soPhuc();
		soPhuc b = new soPhuc();
		try {
			a = nhap();
			b = nhap();
			tong(a, b);
		} catch (Exception ex) {
			System.out.println("Vui long nhap so!");
		}
	}
}
