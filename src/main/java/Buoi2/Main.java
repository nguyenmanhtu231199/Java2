package Buoi2;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // collection
        Collection< String> stringCollectionection = new ArrayList<>();
        // thêm 1 string
        stringCollectionection.add("hello");
        stringCollectionection.add("Hi");
        // In ra collection
        System.out.println(stringCollectionection);
        // thay đổi giá trị 1 phần tử theo index
        // Collection k có
        stringCollectionection.remove("hello");
        System.out.println(stringCollectionection);
        // lấy ra kích thước của collectoion
        System.out.println(stringCollectionection.size());

    }
}
