public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;

            if (i % 2 == 0) {
                System.out.println("Melewati Angka : " + i);
                continue; // keluar dari loop atas dan kembali ke awal loop
            }

            System.out.println("Print Terus ke " + i);

            if (i >= 11) {
                break;
            }
        }
    }
}
