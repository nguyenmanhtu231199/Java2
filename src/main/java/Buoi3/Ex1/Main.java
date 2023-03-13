package Buoi3.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(3.5);
        numbers.add(2.0);
        numbers.add(5.8);
        // Duyệt List và in ra giá trị cảu biểu thức
        // y = 3x^2 + 5X -1
        Consumer<Double> y = x -> {
            double y1 = 3*x*x + 5*x -1;
            System.out.println(y1);
        };
        for (double n : numbers){
            y.accept(n);
        }
        // Tăng giá trị của number lên giấp đôi
       Consumer<List<Double>> f = new Consumer<List<Double>>() {
           @Override
           public void accept(List<Double> doubles) {
               for (int i=0 ; i<doubles.size(); i++){
                   doubles.set(i, 2 * doubles.get(i));
               }
           }
       };
        System.out.println("Number: " + numbers);
        f.accept(numbers);
        System.out.println("Numver: " + numbers);
    }
}
