
public class TipeDataArray {

    
    public static void main(String[] args) {
        
        Integer[] NilaiSiswa;

        NilaiSiswa = new Integer[3];

        NilaiSiswa[0] = 1;
        NilaiSiswa[1] = 2;
        NilaiSiswa[2] = 3;

        for(Integer Hasil:NilaiSiswa){
            System.out.println(Hasil);
        }

        String[] NamaSiswa = {"ASEP","HALAU"};

        for(String DataNama : NamaSiswa){
            System.out.println(DataNama);
        }

        String[] DataLain = new String[2];
        DataLain[0] = "Makan";

        System.out.println(DataLain.length);

    }
}