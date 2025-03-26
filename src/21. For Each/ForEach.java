public class ForEach {

    public static void main(String[] args) {
        int[][] Nilai = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };

        for (int[] DataArray : Nilai) {
            // System.out.println(DataArray);
            for (int HasilArray : DataArray) {
                System.out.print(" " + HasilArray);
            }
            System.out.println(" ");
        }

        for (int i = 0; i < Nilai.length; i++) {
            for (int j = 0; j < Nilai[i].length; j++) {
                System.out.print(" " + Nilai[i][j]);
            }
            System.out.println(" ");
        }
    }

}
