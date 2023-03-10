package Buoi2.JavaCollectionExercise;
import java.util.Comparator;
public class SinhVien  {
    private String idStudent;
    private String name;
    private String born;
    private String Hometown;
    public SinhVien(){

    }

    public SinhVien(String idStudent, String name, String born, String hometown) {
        this.idStudent = idStudent;
        this.name = name;
        this.born = born;
        Hometown = hometown;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getHometown() {
        return Hometown;
    }

    public void setHometown(String hometown) {
        Hometown = hometown;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "idStudent='" + idStudent + '\'' +
                ", name='" + name + '\'' +
                ", born='" + born + '\'' +
                ", Hometown='" + Hometown + '\'' +
                '}';
    }

}
