package webinar01;

public class DataType {
    static int b;
    static double b1;
    static char b2;
    static boolean b3;

    public static void main(String[] args) {
        // примитивы
        // целочисленные byte/short/int/long
        // с плавающей точкой double/float
        // символьный char
        // логические boolean

        int a = 0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        long l = 10_000_000_000L;
        float f = 6.000008976060f;

        char char1 = 65;
        System.out.println(char1);
        char char2 = 'A';
        System.out.println(char2);
        System.out.println((int) char2);

        String str1 = "qwerty";
        String str2 = "qwerty";
        String str3 = new String("qwerty");
        if (str1 == str2)
            System.out.println("true");
        else
            System.out.println("false");

        if (str1.equals(str3) == true)
            System.out.println("true");
        else
            System.out.println("false");
    }

    private void first(){

    }
}
