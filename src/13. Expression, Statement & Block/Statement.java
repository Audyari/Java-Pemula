
import java.util.*;

public class Statement {
    public static void main(String[] args) {
        

        // assigment statenent    
        Double aValue = 8933.234;

        // increment statement 
        aValue++;

        // method invocation statement 
        // Kasus nya Memanggil sebuat fungsion atau metode
        System.out.println("Hello World!"); 

        // object creation statement
        Date date = new Date(); 
        System.out.println(date);

        //assigment statement   
        String NamaKaryawan = "Audyari W";
        int JamLembur = 8;
        int GajiLemburan = 10000;

        //Hitung Gaji Lembur Karyawan
        int GajiDibayar = JamLembur * GajiLemburan;

        System.out.println("Nama Karyawan : " + NamaKaryawan);
        System.out.println("Total Lembur : " + JamLembur);
        System.out.println("GajiDibayar : " + GajiDibayar);

        //increment statement 
        int TotalJualan = 0;

        System.out.println("Transaksi Pertama " + 10000);
        TotalJualan += 10000;
        System.out.println("Teransaksi Ke Dua " + 20000);
        TotalJualan += 20000;
        
        System.out.println("Total Jualan Perhari ini : "+ TotalJualan);

    }
}
