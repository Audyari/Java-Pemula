public class BreakContinue {
    public static void main(String[] args) {

        String[] namaKaryawan = { "ASEP", "BUDI", "JOKO", "Tur" };
        Boolean[] masukTidak = { true, false, false, false };
        String[] keterangan = { "", "Sakit", "", "Cuti" };

        for (int i = 0; i < namaKaryawan.length; i++) {
            System.out.println(namaKaryawan[i]);
            System.out.println(masukTidak[i] ? "Karyawan Masuk" : "Karyawan Gak Masuk");

            String ketStr = keterangan[i];
            System.out.println(ketStr.isEmpty() ? "Gak Ada Keterangan"
                    : ketStr.equals("Sakit") ? "Sedang Sakit" : ketStr.equals("Cuti") ? "Sedang Cuti" : "");
        }
    }
}