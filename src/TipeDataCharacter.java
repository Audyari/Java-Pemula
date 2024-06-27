public class TipeDataCharacter {
    public static void main(String[] args) {
        // Contoh 1: Karakter biasa
        char myChar = 'A';
        System.out.println(myChar); // Output: A

        // Contoh 2: Karakter Unicode
        char unicode = '\u0A12';
        System.out.println(unicode); // Output:

        // Contoh 3: Konversi char ke int
        int charAsInt = myChar;
        System.out.println(charAsInt); // Output: 65

        // Contoh 4: Konversi int ke char
        char charFromInt = (char) 65;
        System.out.println(charFromInt); // Output: A

        // Contoh 5: Mencetak beberapa karakter sekaligus
        char e = 'E';
        char k = 'K';
        char o = 'O';
        System.out.print(e);
        System.out.print(k);
        System.out.println(o); // Menggunakan println agar output di baris baru
    }
}