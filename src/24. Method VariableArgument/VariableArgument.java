public class VariableArgument {
    public static void main(String[] args) {

        // int[] NilaiSiswa = { 10, 20, 30, 40 };

        testingArgument("Audy", 1, 2, 3, 4, 5);
        panggilNama("Audy", "Asep", "Makan");

        // tanpa variable argument
        testingTanpaVariableArgument("Audy", new int[] { 1, 2, 3, 4, 5 });
    }

    static void testingArgument(String NamaSiswa, int... Nilai) {

        System.out.println("Nama Siswa = " + NamaSiswa);
        int TotalNilai = 0;
        for (int i = 0; i < Nilai.length; i++) {

            TotalNilai = Nilai[i] + TotalNilai;
        }

        System.out.println("Nilai Anda " + TotalNilai);

        if (TotalNilai >= 100) {
            System.out.println("Selamat Nilai Anda Di Atas 100");
        } else {
            System.out.println("Selamat Nilai Anda Di Bawah 100");
        }

    }

    static void panggilNama(String... Pangil) {
        for (String HasilPanggil : Pangil) {
            System.out.println(HasilPanggil);
        }
    }

    static void testingTanpaVariableArgument(String NamaSiswa, int[] Nilai) {
        System.out.println("Nama Siswa = " + NamaSiswa);
        int TotalNilai = 0;
        for (int NilaiSiswa : Nilai) {
            TotalNilai += NilaiSiswa;
        }
        System.out.println("Nilai Anda " + TotalNilai);
        
        if (TotalNilai >= 100) {
            System.out.println("Selamat Nilai Anda Di Atas 100");
        } else {
            System.out.println("Selamat Nilai Anda Di Bawah 100");
        }
    }
}
