public class NumberTypes {
    public static void main(String[] args) {
        // Integer
        int intValue = 10;
        System.out.println("Integer: " + intValue);

        // Long
        long longValue = 1000000000000L;
        System.out.println("Long: " + longValue);

        // Short
        short shortValue = 100;
        System.out.println("Short: " + shortValue);

        // Byte
        byte byteValue = 20;
        System.out.println("Byte: " + byteValue);

        // Float
        float floatValue = 3.14f;
        System.out.println("Float: " + floatValue);

        // Double
        double doubleValue = 3.14159;
        System.out.println("Double: " + doubleValue);

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        int amount = 1_000_000_000;
        System.out.println("######################################");

        System.out.println("iniByte: " + iniByte);
        System.out.println("iniShort: " + iniShort);
        System.out.println("iniInt: " + iniInt);
        System.out.println("iniLong: " + iniLong);
        System.out.println("iniLong2: " + iniLong2);

        System.out.println("iniFloat: " + iniFloat);
        System.out.println("iniDouble: " + iniDouble);

        System.out.println("decimalInt: " + decimalInt);
        System.out.println("hexaDecimal: " + hexaDecimal);
        System.out.println("binaryDecimal: " + binaryDecimal);

        System.out.println("amount: " + amount);

        System.out.println("######################################");


    }
}