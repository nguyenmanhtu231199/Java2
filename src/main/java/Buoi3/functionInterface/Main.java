package Buoi3.functionInterface;

public class Main {
    public static void main(String[] args) {
        MyFunctional sum = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return a + b;
            }
        };
        System.out.println("Tong 3 va 5 là :" +sum.calculator(3.0,5.0)) ;
        // Định nghĩa 1 phương thức tính biểu thức
        // A = 5*a + 3*b - 10
        MyFunctional expression = new MyFunctional() {
            @Override
            public double calculator(double a, double b) {
                return 5*a + 3*b -10;
            }
        };
        System.out.println(expression.calculator(1,2));
    }
}
