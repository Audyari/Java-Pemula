
public class TipeDataBukanPrimitf {
    public static void main(String[] args) {

        Byte iniTipeByte = 10;
        System.out.println(iniTipeByte);

        byte iniTipeByte2 = 0;
        System.out.println(iniTipeByte2);

        System.out.println(iniTipeByte.byteValue());

        Byte JumlahBarangA = 10;
        Byte JumlahBarangB = 20;
        var JumlahTotal = JumlahBarangA + JumlahBarangB;

        System.out.println(JumlahTotal);

        System.out.println(JumlahTotal + 10);

        byte DataPrimif = 0;

        Byte DataBukanPrimitif = DataPrimif;

        System.out.println(DataBukanPrimitif);

        int DataInteger = DataBukanPrimitif.intValue();

        System.out.println(DataInteger);

    }
}
