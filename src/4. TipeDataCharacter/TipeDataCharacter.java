public class TipeDataCharacter {

    public static void main(String[] args) {

        char Nilai_Char = 'A';
        System.out.println(Nilai_Char);

        //char tab = '\t';
        char NewLine = '\n';

        System.out.println("test tab satu" + "\t" + "test tab dua");
        System.out.println("test new line" + NewLine + "test new line");

        int ConvertHuruf = 65;
        char HasilHuruf = (char) ConvertHuruf;
        System.out.println(HasilHuruf);

        char HurufPertama = 'A';
        char HurufKeDua = 'B';

        System.out.println((int) HurufPertama);
        System.out.println((int) HurufKeDua);

        System.out.println((char) (HurufPertama + 1));     

        char NamaPertama = 'A';
        char NamaKedua = 'B';
        System.err.print((long) (NamaPertama + 1));
        System.err.println(NamaKedua);

    }
}