public class LamdaSwich {
    public static void main(String[] args) {

        var nilai = "A";
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
        System.out.println(ucapan);

        var Nilai2 = "A";
        String HasilUcapan = switch (Nilai2) {
            case "A":
                yield "Wow Ande Lulus Dengan Baik";

            case "B", "C":
                yield "Anda Lulus";

            case "D":
                yield "Anda Tidak Lulus";

            default:
                yield "Mungkin Anda Saleh Jurusen";

        };

        System.out.println(HasilUcapan);
    }
}
