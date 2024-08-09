public class KasusArayDIdalamAray {

    public static void main(String[] args) {
        String[][]NamaSiswa = {{"ASEP","BUD"},{"MAIL","ISA","KANTO"},{"ARAY","YANTI","DUDUT","MUKLIS"}};

        for(int i = 0; i < NamaSiswa.length; i++){
            for(int j = 0; j< NamaSiswa[i].length; j ++){
                    System.out.print(" "+ NamaSiswa[i][j]);
            }
            System.out.println("");
        }

        String[][] MemberJKT = {
            {"A","B","C"},
            {"D","E"},
        };

        for(int i= 0; i < MemberJKT.length; i++){
            for(int j = 0; j < MemberJKT[i].length; j++  ){
                    System.out.print(" " + MemberJKT[i][j]);
            }
            System.out.println(" ");
        }

    }
}