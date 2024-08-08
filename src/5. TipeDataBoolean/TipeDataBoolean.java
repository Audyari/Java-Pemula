public class TipeDataBoolean {

    public static void main(String[] args) {

        int usia = 25;
        boolean Dewasa = usia >= 17;

        if (Dewasa) {
            System.out.println("Usia Anda Dewasa");
        } else {
            System.out.println("Usia Anda Belum Dewasa");
        }

        int Angka = 11;
        boolean CekAngkaGenap = Angka % 2 == 0;

        if (CekAngkaGenap){
            System.out.println("Angka Genap");
        }else{
            System.out.println("Angka Ganjil");
        }

        
        boolean NilaiBenar = true;
        boolean NilaiSalah = false;

        System.out.println(NilaiBenar);
        System.out.println(NilaiSalah);

    }
}