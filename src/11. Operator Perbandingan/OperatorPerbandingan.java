public class OperatorPerbandingan {

    public static void main(String[] args) {
        

        int DataA = 200;
        int DataB = 100;
        int DataC = 50;

        System.out.println(DataA > DataB);
        System.out.println(DataA < DataB);
        System.out.println(DataA >= DataB);
        System.out.println(DataA <= DataB);
        System.out.println(DataA == DataB);
        System.out.println(DataA != DataB);

        // Mencari nilai terendah dengan Math.min
        int hargaTerendah = Math.min(Math.min(DataA,DataB) , DataC);
        int hargaTeringgi = Math.max(DataA, DataB);

        System.err.println("Harga Terendah : " + hargaTerendah);
        System.out.println("Harga Tertinggi : " + hargaTeringgi);

    }
    
}
