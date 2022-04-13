package buoi8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class KiemTraMatKhau {

	public static void main(String[] args) {
		String password;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mat khau");
		password = scanner.nextLine();
		scanner.close();

		if (regexPassword(password))
			System.out.println("Ban da nhap dung mat khau");
		else
			System.out.println("Ban da nhap sai dinh dang mat khau");
	}

	public static boolean regexPassword(String password) {
		// String passwordPattern =
		// "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		String passwordPattern = "([a-zA-Z])|([0-9]){8,}";
		if (Pattern.matches(passwordPattern, password))
			return true;
		else
			return false;

	}

}
