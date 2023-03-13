package Buoi3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tao 1 map rong
        Map<Person, List<Car>> listMap = new HashMap<>();
        // Tao 2 nguoi
        Person p1 = new Person(1, "User 1", "Male");
        Person p2 = new Person(2, "User 2", "Female");
        // Tao 3 xe
        Car c1 = new Car(1, "Red","Honda City");
        Car c2 = new Car(2, "White","Volvo");
        Car c3 = new Car(3, "Blue","Blue");

        // p1 sở hữu xe c1?
        listMap.put(p1, Arrays.asList(c1));

        // P2 sở hữu xe c2?
        listMap.put(p2, Arrays.asList(c2));

        // In thu ra map
        System.out.println(listMap);

        // P1 mua thêm xe c3?
        // Lay ra danh sach xe. Them vao list
        List<Car> p1List = new ArrayList<>(listMap.get(p1));
        p1List.add(c3);

        listMap.put(p1, p1List);

        System.out.println(listMap);
    }
}
