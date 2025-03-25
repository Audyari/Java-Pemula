
public class OperasiBoolean {

    public static void main(String[] args) {
        int UsiaKaryawan = 41;
        int SyaratUsia = 17;
        Boolean JenisKelamin = true;

        if (UsiaKaryawan >= SyaratUsia && JenisKelamin) {
            System.out.println("Syarat Terpenuhi");
        } else {
            System.out.println("Syarat Tidah Terpenuhi");
        }


        // syarat meminjam buku;
        //1. harus daftar Registrasi
        //2. meminjam tidak lebih dari 3 buku 

        Boolean Registrasi = true;
        int DaftarPinjam = 2;

        if(Registrasi && DaftarPinjam < 3){
            System.out.println("Baik Kamu Boleh Pinjam");
        }else{
            System.out.println("Kamu Tidak Boleh Pinjam");
        }

        //  Cek Kelulusan siswa

        int Absen = 70;
        int Nilai =100;

        if(Absen >= 50 && Nilai >= 80){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Anda Gagal");
        }

    }

}
