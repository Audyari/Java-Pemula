
import java.lang.Math;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean gameSelesai = true;
        int i = 1;
        do {
            int nilai = (int) (Math.random() * 10) + 1;
            System.out.println("Tebak Angka Ke " + i + " Adalah " + nilai);
            if (nilai == 10) {
                System.out.println("Nilai Nya Benar");
                gameSelesai = false;
            }

            i++;
        } while (gameSelesai);
        System.out.println("Permainan Selesai.");
    }
}