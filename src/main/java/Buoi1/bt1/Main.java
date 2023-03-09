package Buoi1.bt1;

public class Main {
    public static void main(String[] args) {
        MayTinh<Double> mayTinh = new MayTinhDouble();
        // Tinh tong
        System.out.println(mayTinh.tong(3.0,4.0,5.0,6.0));
        //Tinh tich
        System.out.println(mayTinh.tich(1.0,2.0,3.0,4.0));
        System.out.println(mayTinh.hieu(4.0, 2.0));
        System.out.println(mayTinh.thuong(4.0, 2.0));
    }
}
