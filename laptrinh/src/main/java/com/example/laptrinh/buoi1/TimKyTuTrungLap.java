package com.example.laptrinh.buoi1;

import java.util.*;

public class TimKyTuTrungLap {
    public static void main(String[] args) {

        String str;
        System.out.println("Nhap chuoi");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        timKyTu(str);
        scanner.close();
    }

    public static void timKyTu(String str) {
        //Tạo một HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //Chuyển đổi chuỗi thành mảng char
        char[] chars = str.toCharArray();
        /*
         * char được chèn dưới dạng khóa và
         *  được tính là giá trị. Nếu map đã chứa char
         *  rồi thì hãy tăng giá trị lên 1.
         * */
        for (Character kyTu : chars) {
            if (map.containsKey(kyTu)) {
                map.put(kyTu, map.get(kyTu) + 1);
            } else {
                map.put(kyTu, 1);
            }
        }
        //lấy key ra
        Set<Character> keys = map.keySet();
        /*
          Hiển thị số lượng ký tự nếu nó là
          lớn hơn 1. Tất cả các ký tự trùng lặp sẽ
          có giá trị lớn hơn 1.
         */
        for (Character kyTu : keys) {
            if (map.get(kyTu) > 1) {
                System.out.println("Ky tu " + kyTu + " co so lan lap la:  " + map.get(kyTu));
            }
        }
    }
}
