
public class IfStatement {

    public static void main(String[] args) {

        int NilaiSiswa = 80;
        int Kehadiran = 80;

        if (NilaiSiswa >= 70 && Kehadiran >= 70) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Anda Tidah Lulus");
        }

        // Datapatkan Grade Siswa

        if (NilaiSiswa >= 90 && Kehadiran >= 90) {
            System.out.println("Anda Masuk Grade A");
        } else if (NilaiSiswa >= 80 && Kehadiran >= 80) {
            System.out.println("Anda Masuk Grade B");
        } else if (NilaiSiswa >= 70 && Kehadiran >= 70) {
            System.out.println("Anda Masuk Grade B");
        } else if (NilaiSiswa >= 60 && Kehadiran >= 60) {
            System.out.println("Anda Masuk Grade B");
        }

    }

}
