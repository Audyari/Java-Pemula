public class MethodReturnValue {
    public static void main(String[] args) {

        System.out.println(jumlahKan(10, 10));
        System.out.println("Hasil nya Adalah " + kalkulator(100, 10, '-'));

    }

    static boolean tipeBoolean() {
        return true;
    }

    static int jumlahKan(int NilaiA, int NilaiB) {
        return NilaiA + NilaiB;
    }

    static int kalkulator(int NilaiA, int NilaiB, char Metode) {
        return switch (Metode) {
            case '+' -> NilaiA + NilaiB;
            case '-' -> NilaiA - NilaiB;
            default -> 0;
        };
    }

}
