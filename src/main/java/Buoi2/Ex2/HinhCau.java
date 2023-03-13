package Buoi2.Ex2;

public class HinhCau implements HinhHoc3D {
    private double banKinh;

    public HinhCau() {
    }
    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return (4* Math.PI *banKinh*banKinh*banKinh)/3;
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh +
                '}';
    }
}
