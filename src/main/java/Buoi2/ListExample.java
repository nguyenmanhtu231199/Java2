package Buoi2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Tạo 1 ArrayList luwuu trữ thông tin của các bạn sinh viên?
        // CHưa biết số lượng cụ thể
        List<Student> arrayList= new ArrayList<>();
        // thêm 1 sinh viên viên
        Student s1 = new Student(1, "Tú");
        arrayList.add(s1);
        Student s2 = new Student(2, "Trang");
        arrayList.add(s2);
        // IN ra danh sách sinh viên
        System.out.printf(" có %d bạn sinh viên trong danh sách \n", arrayList.size());
        System.out.println(arrayList);
        // thay dổi tên của bạn Student 2 --> sinh viên 2 ???
        Student s = arrayList.get(1);
        s.setName("Sinh vien 2");
        System.out.println(arrayList);
        // thay thế phần tử tại vị trí index=1
        Student s3= new Student(3, "Student 3");
        arrayList.set(1,s3);
        System.out.println(arrayList);
//        // Xóa phần tử theo chỉ số
//        arrayList.remove(0);
//        System.out.println(arrayList);
//        // Xóa phần tử theo Object cụ thể
//        arrayList.remove(s3);
//        System.out.println(arrayList);
        // sắp xếp các phần tu
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
