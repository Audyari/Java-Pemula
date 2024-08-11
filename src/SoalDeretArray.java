public class SoalDeretArray {
    public static void main(String[] args) {

        int[] DeretAngka = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] DataKe = new int[5];

        for (int i = 0; i < DataKe.length; i++) {
            DataKe[i] = DeretAngka[i];
        }

        for (int j = 0; j < DataKe.length; j++) {
            System.out.println(DataKe[j]);
        }

    }

}
