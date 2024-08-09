
public class StudiKasusArray {

    public static void main(String[] args) {
        int[] NilaiSiswa = {10,20,30,40,50};

        // Mengetahui panjang Array

        System.out.println("Panjang Array nya : " + NilaiSiswa.length);

        // mencetak array tapi menggunakkan Length

        for(int i = 0; i < NilaiSiswa.length; i++){
                System.out.println(NilaiSiswa[i]);
        }

        //menjumlahkan total Array

        int sum = 0;

        for (int i = 0; i < NilaiSiswa.length; i++){
            sum = NilaiSiswa[i] + sum;
            System.out.println("Nilai ke : " + i + " : " + sum);
        }
    }
}
