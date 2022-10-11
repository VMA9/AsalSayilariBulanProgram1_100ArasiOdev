public class asalsayibulanprogram {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int x = 1; x <= i; x++) {
                int result = i % x;
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