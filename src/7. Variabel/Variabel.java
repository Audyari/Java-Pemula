
public class Variabel {
    public static void main(String[] args) {

        String Nama;

        Nama = "Audyari Wiyono";

        byte Usia;
        Usia = 41;

        String Alamat;
        Alamat = "JL PONDOK GEDE";

        System.out.println("Nama Anda : " + Nama);
        System.out.println("Usia Anda :" + Usia);
        System.out.println("Alamat Anda Di : " + Alamat);


        Usia = 25;
        float UsiaUpdate = Usia;
        System.out.println("Ubah Nilai Usia = " + UsiaUpdate);

        // Menghitung Luas

        byte Panjang;
        byte Lebar;
        int Luas;

        Panjang = 10;
        Lebar = 10;
        Luas = Panjang * Lebar;

        System.out.println("Penghitung Luas : ");
        System.out.println("Nilai Panjang = " + Panjang);
        System.out.println("Nilai Lebar = " + Lebar);
        System.out.println("NIlai Luas = " + Luas);

        // Menghitung Nilai Jari Jari

        double PI = 3.14159;
        double PanjangJariJari = 10.1;
        double LuasJariJari;

        LuasJariJari = PI * (PanjangJariJari * PanjangJariJari);

        System.out.println("Nilai Luas Jari - Jari = " + LuasJariJari);

        

    }
}
