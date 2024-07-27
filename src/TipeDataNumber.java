public class TipeDataNumber {

    public static void main(String[] args) {

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;
        float iniFloat = 3.14f;
        double iniDouble = 3.14159;

        System.out.println("iniByte = " + iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(iniDouble);

        int hexadecimal = 0x10;
        int binary = 0b10;
        int octal = 010;

        System.out.println(hexadecimal);
        System.out.println(binary);
        System.out.println(octal);

    }

}
