package buoi8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTuTrungLap {

	public static void main(String[] args) {

		try {
			int n1;
			int n2;
			int l1;
			int l2;

			List<Integer> str1 = new ArrayList<>();
			List<Integer> str2 = new ArrayList<>();
			ArrayList<Integer> finalResult1 = new ArrayList<Integer>();
			ArrayList<Integer> finalResult2 = new ArrayList<Integer>();

			Scanner scanner = new Scanner(System.in);

			System.out.println("Nhap so phan tu cua mang thu nhat");
			n1 = scanner.nextInt();

			System.out.println("Nhap mang thu nhat");
			for (int i = 0; i < n1; i++) {
				l1 = scanner.nextInt();
				str1.add(l1);
			}

			System.out.println("Nhap so phan tu cua mang thu hai");
			n2 = scanner.nextInt();

			System.out.println("Nhap mang thu hai");
			for (int i = 0; i < n2; i++) {
				l2 = scanner.nextInt();
				str2.add(l2);
			}

			for (int i = 0; i < n1; i++) {

				if (!str2.contains(str1.get(i))) {

					finalResult1.add(str1.get(i));
				}
			}

			for (int j = 0; j < n2; j++) {

				if (!str1.contains(str2.get(j))) {

					finalResult2.add(str2.get(j));
				}

			}
			System.out.println("Mang1");
			for (int i : finalResult1)
				System.out.println(i);
			System.out.println("Mang2");
			for (int i : finalResult2)
				System.out.println(i);

		} catch (Exception ex) {
			System.out.println("Ban da nhap sai");
		}

	}

}
