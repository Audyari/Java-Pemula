public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;

        System.out.println(iniInteger);

        Long iniLong = 10000L;

        System.out.println(iniLong);

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniInt);
        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);

        Long amount = 1000000L;

        System.out.println(amount);

    }
}
