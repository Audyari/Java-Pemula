public class ExpressionStatementBlock {
    public static void main(String[] args) {

        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

        {
            System.out.println("Hello World 4");
            System.out.println("Hello World 5");
            System.out.println("Hello World 6");
        }


        // Contoh Ekspresi
        int x = 5;
        int y = 10;
        int hasil = x + y; // Ekspresi x + y

        // Contoh Statement
        System.out.println("Hasil penjumlahan: " + hasil); // Statement dengan ekspresi

        // Contoh Block
        if (hasil > 10) { // Block if-else
            System.out.println("Hasil lebih dari 10");
        } else {
            System.out.println("Hasil kurang dari atau sama dengan 10");
        }

        // Gabungan Ekspresi, Statement, dan Block
        for (int i = 0; i < 3; i++) { // Block for loop
            int kuadrat = i * i; // Ekspresi dalam statement
            System.out.println("Kuadrat dari " + i + " adalah " + kuadrat);
        }

    }
}
