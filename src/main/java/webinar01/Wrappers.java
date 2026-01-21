package webinar01;

public class Wrappers {
    // int --> Integer
    // double --> Double
    // char --> Character
    // boolean --> Boolean
    public static void main(String[] args) {
        int a = 13;
        Integer b = 45;
        System.out.println(a + b);
        String bStr = b.toString();
        System.out.println(bStr + a);
        int c = Integer.parseInt("45");
        System.out.println(a + c);
        //int v = Integer.parseInt("354df54");
        System.out.println("================");
        String[] str = new String[]{};
        System.out.println(str.length);
        String[] str1 = {"str1", "str1", "str3", null};
        System.out.println(str1.length);
        String[] str2 = new String[3];
    }
}
