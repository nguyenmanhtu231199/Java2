package Buoi2.Ex2;

public class HinhLapPhuong implements HinhHoc3D {
    private double canh;
    public HinhLapPhuong(){

    }
    public HinhLapPhuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhTheTich() {
        return canh*canh*canh;
    }

    @Override
    public String toString() {
        return "HinhLapPhuong{" +
                "canh=" + canh +
                '}';
    }
}
