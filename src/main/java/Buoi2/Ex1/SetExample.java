package Buoi2.Ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // tạo một se chứa các chui nhập từ bàn phím
        Scanner in = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (true){
            System.out.println("Enter your string");
            String tmp = in.nextLine();
            if (tmp.equalsIgnoreCase("exit"))break;
            stringSet.add(tmp);
            // print set
            System.out.println(stringSet);
        }
        // đong phần nhập
        in.close();
    }
}
