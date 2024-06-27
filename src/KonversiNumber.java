public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println("iniByte: " + iniByte);
        System.out.println("iniShort: " + iniShort);
        System.out.println("iniInt: " + iniInt);

        System.out.println("iniInt2: " + iniInt2);
        System.out.println("iniByte2: " + iniByte2);

    }
}
