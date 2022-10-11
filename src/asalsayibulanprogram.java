public class asalsayibulanprogram {
    public static void main(String[] args) {
        int result;
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int x = 1; x <= i; x++) {
                result = i % x;
                if (result == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }
}