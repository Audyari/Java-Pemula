
public class TipeDataBukanPrimitif2 {
    public static void main(String[] args) {

        Integer Usia = 0;

        Integer UsiaPrimitif = Usia;

        Integer UsiaLagi = UsiaPrimitif;

        Short UsiaShort = UsiaLagi.shortValue();

        byte UsiaByte = UsiaLagi.byteValue();

        System.out.println(UsiaShort);
        System.out.println(UsiaByte);

        byte NilaiByte = 100;
        Byte NilaiByte2 = NilaiByte;

        Integer NilaiInt = NilaiByte2.intValue();
        Byte BalikinLagi = NilaiInt.byteValue();

        System.out.println(BalikinLagi);

    }

}
