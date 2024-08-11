public class MethodOverloading {
    public static void main(String[] args) {

        panggilNama();
        panggilNama("Audyari");

    }

    static void panggilNama() {
        System.out.println("Hai Nama Kamu Siapa");
    }

    /**
     * 
     * @param Nama
     * @return
     */
    static String panggilNama(String Nama) {
        return "Hai Nama Kamu Pasti" + Nama;
    }
}
