public class RecursiveMethod {
    public static void main(String[] args) {
        int n = 15;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

        System.out.println(faktorialDua(100));
        System.out.println(factorialRecursive(100));
        testLoop(5531);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static long faktorialDua(long Nilai) {
        var Hasil = 1;
        for (long i = Nilai; i >= 1; i--) {
            Hasil *= i;
        }
        return Hasil;
    }

    /**
     * Metode Factorial dengan Recursive
     * 
     * @param value Nilai Faktorial
     * @return Hasil Faktorial
     */
    static long factorialRecursive(long value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void testLoop(int Nilai) {
        if (Nilai == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Panggil Loop ke " + Nilai);
            testLoop(Nilai - 1);

        }
    }

 
}