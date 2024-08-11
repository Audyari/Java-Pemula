public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i == 0) {
                System.err.println(i + " Ini Tidak Bisa Di Bagi 2");
            } else if (i % 2 == 0) {
                System.err.println(i + " Habis di bagi 2 ");
            } else {
                System.err.println(i + " Tidak Habis di bagi 2 ");
            }

        }

    }
}
