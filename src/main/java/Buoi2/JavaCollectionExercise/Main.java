package Buoi2.JavaCollectionExercise;

import Buoi2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void mainMenu(){
        System.out.println("1. Danh sách sinh viên");
        System.out.println("2. Thêm sinh viên mới");
        System.out.println("3. Tìm sinh viên theo mã sinh viên");
        System.out.println("4. Danh sách môn học");
        System.out.println("5. Thêm môn học mới");
        System.out.println("6. Nhập điểm môn họ cho sinh viên");
        System.out.println("7. Cập nhật điểm cho sinh viên");
        System.out.println("8. Xem điểm sinh viên theo mã ID");
        System.out.println("9. In ra danh sách sinh viên theo các mã môn học");
        System.out.println("In ra sinh viên có điểm trung bình tất cả các môn cao nhất");
    }
    public static void main( String[] args) {
        // Tạo các danh sách rỗng
        List<SinhVien> sinhVienList= new ArrayList<>();
        SinhVien s1 = new SinhVien("SV001"," Nguyễn Mạnh Tú",
                "23/11/1999", "Vĩnh Phúc" );
        sinhVienList.add(s1);
        SinhVien s2 = new SinhVien("SV002","Trần Thị Thùy Trang",
                "23/03/1999","Hà Nội");
        sinhVienList.add(s2);
        SinhVien s3 = new SinhVien("SV003", "Fall In Love",
                "08/08/2022","Quy Nhơn");
        sinhVienList.add(s3);
        List<MonHoc> monHocList = new ArrayList<>();
        monHocList.add(new MonHoc("Java1","Lập trình Java cơ bản"));
        List<Diem> diemList = new ArrayList<>();
        diemList.add(new Diem("BKC1","Java1",10));
         // Chương trình chính
        Scanner in = new Scanner(System.in);
        int option =-1;
        do {
            mainMenu();
            System.out.println("Nhap lua chon:");
            try {
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e){
                System.out.println(" Nhập sai định dạng");
                continue;
            }
            if (option <1 || option >10){
                System.out.println(" Lựa chọnkhông hợp lệ");
                continue;
            }
            switch (option){
                case 1:
                    // In ra danh sách sinh viên
                    if (sinhVienList.size()==0){
                        System.out.println(" Danh sách sinh viên trống");
                        continue;
                    }
                    System.out.printf(" có %d bạn sinh viên trong danh sách \n", sinhVienList.size());
                    System.out.println(sinhVienList);
                    break;
                case 2:
                    SinhVien s = new SinhVien();
                    System.out.print("\tNhập mã sinh viên: ");
                    s.setIdStudent(in.nextLine());
                    System.out.print("\tNhập tên sinh viên: ");
                    s.setName(in.nextLine());
                    System.out.print("\tNhập ngày sinh: ");
                    s.setBorn(in.nextLine());
                    System.out.print("\tNhập quê quán: ");
                    s.setHometown(in.nextLine());

                    // Them ban sinh vien vua tao vao danh sach
                    sinhVienList.add(s);
                    break;
                case 3:
                    // Y tuong -> duyet arrayList, xem co khop id nhap vao hay ko?
                    System.out.print("\tNhập mã sinh viên cần tìm: ");
                    String maSV = in.nextLine();

                    // Đặt cờ đánh dấu, false là ko có
                    boolean flag = false;

                    for (SinhVien student: sinhVienList) {
                        if(student.getIdStudent().equals(maSV)){
                            flag = true;
                            System.out.println(student);
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.println("Không tìm thấy sinh viên đó!");
                    }

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    // Nhap ma sinh vien -> kiem tra xem co hop le hay ko
                    System.out.print("Nhập mã sinh viên: ");
                    String mSv = in.nextLine();
                    boolean flag1 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getIdStudent().equals(mSv)){
                            flag1 = true;
                            break;
                        }
                    }
                    if(flag1 == false) {
                        System.out.println("Không có sinh viên đó!");
                        continue;
                    }
                    // Nhap ma mon hoc -> kiem tra xem ma mon co hop le hay ko
                    System.out.print("Nhập mã môn học: ");
                    String mMh = in.nextLine();
                    boolean flag2 = false;
                    for (MonHoc monHoc: monHocList) {
                        if(monHoc.getIdSubject().equals(mMh)){
                            flag2 = true;
                            break;
                        }
                    }
                    if(flag2 == false) {
                        System.out.println("Không có môn học đó!");
                        continue;
                    }
                    // Nhap diem
                    System.out.print("Nhập điểm: ");
                    int diem = Integer.parseInt(in.nextLine());
                    Diem d = new Diem(mSv, mMh, diem);

                    // Them diem vao listDiem
                    diemList.add(d);
                    break;
                case 7:
                    // Nhap ma sinh vien -> kiem tra xem co hop le hay ko
                    System.out.print("Nhập mã sinh viên: ");
                    String mSv11 = in.nextLine();
                    boolean flag11 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getIdStudent().equals(mSv11)){
                            flag11 = true;
                            break;
                        }
                    }
                    if(flag11 == false) {
                        System.out.println("Không có sinh viên đó!");
                        continue;
                    }
                    // Nhap ma mon hoc -> kiem tra xem ma mon co hop le hay ko
                    System.out.print("Nhập mã môn học: ");
                    String mMh1 = in.nextLine();
                    boolean flag22 = false;
                    for (MonHoc monHoc: monHocList) {
                        if(monHoc.getIdSubject().equals(mMh1)){
                            flag22 = true;
                            break;
                        }
                    }
                    if(flag22 == false) {
                        System.out.println("Không có môn học đó!");
                        continue;
                    }

                    // Kiểm tra xem bạn sv đã học môn này chưa và có điểm chưa ??
                    Diem diemSv = null;
                    for (Diem diemMH: diemList) {
                        if(diemMH.getIdStudent().equals(mSv11) && diemMH.getIdSubject().equals(mMh1)){
                            diemSv = diemMH;
                            break;
                        }
                    }
                    if(diemSv == null){
                        System.out.println("Sinh viên có mã "+ mSv11 + " chưa có điểm môn học "+ mMh1);
                    }
                    else {
                        System.out.print("Nhập điểm mới: ");
                        diemSv.setMark(Integer.parseInt(in.nextLine()));
                        System.out.println("Cập nhật điểm thành công");
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
        }
        while (option != 0);
        in.close();
    }
}
