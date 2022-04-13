package buoi8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Collections {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();

		strings.add("Thu 2");
		strings.add("Thu 3");
		strings.add("Thu 4");
		strings.add("Thu 5");
		strings.add("Thu 6");
		strings.add("Thu 7");
		strings.add("Chu nhat");

		// hien thi cac phan tu cua List
		System.out.println("Cac phan tu trong strings la");
		iterator(strings);
		listIterator(strings);

		// thay doi gia tri phan tu
		System.out.println("Thay doi gia tri");
		strings.set(0, "Hehe");
		iterator(strings);

		// xoa phan tu vua thay doi
		System.out.println("Xoa phan tu vua thay doi");
		strings.remove(0);
		iterator(strings);

		// hien thi list theo chieu nguoc lai
		System.out.println("hien thi list theo chieu nguoc lai");
		hienThiListChieuNguocLai(strings);

	}

	public static void iterator(List strings) {

		// Cach 1: Iterator

		System.out.println("Iterator");
		// khai bao mot Iterator
		Iterator<String> iterator = null;

		iterator = strings.iterator();

		// kiem tra xem Iterator co phan tu tiep theo khong
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

	public static void listIterator(List strings) {
		// Cach 2: ListIterator

		System.out.println("ListIterator");
		// khai bao mot ListIterator
		ListIterator<String> listIterator = null;

		listIterator = strings.listIterator();
		while (listIterator.hasNext())
			System.out.println(listIterator.next());
	}

	public static void hienThiListChieuNguocLai(List strings) {

		ListIterator<String> listIterator = null;
		listIterator = strings.listIterator();

		while (listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}

}
