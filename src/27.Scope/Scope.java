public class Scope {
    public static void main(String[] args) {
        String Nama = "BUDI";
        System.err.println(Nama);
        {
            String NamaA = "ASEP";
            System.out.println(NamaA);
            System.out.println(Nama);

        }
        System.out.println(Nama);
        {
            String NamaB = "SHOWWW";
            System.out.println(Nama);
            System.out.println(NamaB);
        }
    }
}
