public class BilanganPrima {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        for (int number : numbers) {
            boolean isPrime = true;

            // Jika bilangan kurang dari 2, maka bukan bilangan prima
            if (number < 2) {
                isPrime = false;
            }

            // Memeriksa apakah bilangan tersebut prima atau tidak
            int i = 2;

            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            // Menampilkan hasil
            if (isPrime) {
                System.out.println(number + " adalah bilangan prima.");
            } else {
                System.out.println(number + " bukan bilangan prima.");
            }
        }
    }
}