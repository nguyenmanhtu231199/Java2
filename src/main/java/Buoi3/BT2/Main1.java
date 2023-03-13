package Buoi3.BT2;

public class Main1 {
    public static void main(String[] args) {
        // Viet theo lambda
        HandleString demSoKiTu = s -> s.length();
        // Lambda
        HandleString demSoKiTu2 = (s) -> s.length();

        System.out.println(demSoKiTu.execute("Hello"));
        System.out.println(demSoKiTu2.execute("Hello"));

        HandleString demSoTu = new HandleString() {
            @Override
            public int execute(String s) {
                int count = 0;
                if(s.charAt(0) != ' '){
                    count++;
                }
                for(int i = 1; i < s.length() - 1; i++){
                    if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                        count ++;
                    }
                }
                return count;
            }
        };

        HandleString demSoTu2 = s -> {
            int count = 0;
            if(s.charAt(0) != ' '){
                count++;
            }
            for(int i = 1; i < s.length() - 1; i++){
                if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                    count ++;
                }
            }
            return count;
        };

    }
}
