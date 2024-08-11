
public class ProblemSwitch {
    public static void main(String[] args) {

        char Nilai = 'A';

        switch (Nilai) {
            case 'A':
                System.out.println("Selamat Nilai Anda A");
                break;

            default:
                System.out.println("Nilai Anda Tak Di Ketahui");
                break;
        }

        // Testing Tipe data enum dengan Lamda Expression
        enum JenisHari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        ;
        JenisHari HariIni = JenisHari.MINGGU;

        switch (HariIni) {
            case MINGGU -> System.out.println("Hari Minggu");
            case SENIN -> System.out.println("Hari Senin");
            default -> {
                System.out.println("Hari Apa Ya");
                ;
            }

        }

        String Posisi = "Kayawan";
        int LamaBekerja = 5;
        int Hasil = 0;

        switch (Posisi) {
            case "Pegawai", "Karyawan" -> Hasil = LamaBekerja * 100;

            case "Honorer" -> System.out.println(LamaBekerja * 10);

            default -> {
                System.out.println("Siapa Anda");
            }

        }

        System.out.println("Hasil nya adalah " + Hasil);

    }
}
