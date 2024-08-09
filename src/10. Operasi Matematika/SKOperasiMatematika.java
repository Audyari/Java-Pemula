

public class SKOperasiMatematika {
    public static void main(String[] args) {
        int NilaiA = 10;
        int NilaiB = 20;

        // Penjumlahan

        System.out.println("Nilai 1 : " + ((int)NilaiA + NilaiB));
        System.err.println("Nilai 2 : " + (NilaiA += NilaiB));
        System.out.println("Nilai 3 : " + (NilaiA++));
        System.out.println("Nilai 4 : " + (NilaiA));
        System.out.println("Nilai 5 : " + NilaiA--);
        System.out.println("Nilai 6 : " + NilaiA);



        
        // Pengurangan

        System.out.println(NilaiA - NilaiB);

        //Perkalian

        System.out.println(NilaiA * NilaiB);

        //Pembangian

        System.out.println(NilaiA / NilaiB);

        //Sisa Bagi

        System.out.println(NilaiA % NilaiB);
    }
    
}
