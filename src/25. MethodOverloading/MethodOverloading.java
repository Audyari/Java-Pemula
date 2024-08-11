public class MethodOverloading {
    public static void main(String[] args) {

        panggilNama();
        panggilNama("Audyari");

    }

    static void panggilNama() {
        System.out.println("Hai Nama Kamu Siapa");
    }

    static void panggilNama(String Nama) {
        System.out.println("Hai " + Nama + " Salam Kenal Ya");
    }
}
