public class CekGanjilGenap {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap: " + i);
            } else {
                System.out.println("Bilangan Ganjil: " + i);
            }
        }
    }

}
