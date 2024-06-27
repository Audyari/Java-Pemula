public class RecursiveMethod {

    public static void main(String[] args) {


        System.out.println("Mencari Nilai Faktorial");
        System.out.println("###############################");
        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));


        // pemanggilan contoh eror Stack Overflow
        stackOverflow(1000);
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void stackOverflow(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            stackOverflow(value - 1);
        }
    }



}
