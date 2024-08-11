public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 30) {

            var Hasil = (i > 1 && (i == 2 || (i % 2 != 0 && i != 1))) ? i + " Bilangan Prima "
                    : i + " Bukan Bilangan Prima";
            System.out.println(Hasil);

            i++;
        }
    }
}
