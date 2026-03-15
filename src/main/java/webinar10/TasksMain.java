package webinar10;

import webinar07.Centaur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TasksMain {
    public static void main(String[] args) {
        Centaur centaur1 = new Centaur(true, 137.,
                237, "Hiron");
        Centaur centaur2 = new Centaur(false, 127.,
                223, "Hirona");
        Centaur centaur3 = new Centaur(false, 101.,
                77, "Ariana");
        Centaur centaur4 = new Centaur(true, 437.,
                299, "Miron");
        Centaur centaur5 = new Centaur(true, 137.,
                237, "Aaron");
        Centaur centaur6 = new Centaur(true, 117.,
                237, "Hiron");
        Centaur[] centaurs = {centaur1, centaur2,
                centaur6, centaur3, null, centaur4, centaur5};

        Integer[] digits = {98, 45, 0, 97, 46, 99, 99};
        Integer[] digits1 = {98};
        Integer[] digits2 = {99, 99, 99, 99};

        System.out.println(returnCentaurNames(centaurs));

        System.out.println("=================");
        System.out.println(isAnagram("Топор", "Ропот"));
        System.out.println("=================");
        System.out.println(isAnagram("Топ ор", " Ропот ")); //оопрт
        System.out.println("=================");
        System.out.println(isAnagram("Топорy", "Ропот"));//оопрту  оопрт
        System.out.println("=================");
        System.out.println(isAnagram("", "Робот"));
        System.out.println("=================");
        System.out.println(isAnagram("Топорy", null));
        System.out.println("=================");
        System.out.println(secondMaxValue(digits));
        System.out.println("=================");
        System.out.println(secondMaxValue(digits1));
        System.out.println("=================");
        System.out.println(secondMaxValue(null));
        System.out.println("=================");
        System.out.println(secondMaxValue(digits2));
    }

    public static List<String> returnCentaurNames(Centaur[] centaurs) {
        if (centaurs == null || centaurs.length == 0)
            return null;
        List<String> namesCentaurs = new ArrayList<>();
        for (Centaur c : centaurs) {
            if (c != null) {
                String name = c.getName();
                namesCentaurs.add(name);
                //namesCentaurs.add(c.getName());
            }
        }
        return namesCentaurs;
    }

    //Проверить, является ли одна строка анаграммой другой
    // ток-кот, куб-бук, апорт-тропа
    //"ко т" " тКо"  кот кот  кот тко

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty())
            return false;
        char[] exp1 = str1.replaceAll("\\s", "")
                .toLowerCase().toCharArray();
        char[] exp2 = str2.replaceAll("\\s", "")
                .toLowerCase().toCharArray();
        Arrays.sort(exp1);
        Arrays.sort(exp2);
        return Arrays.equals(exp1, exp2);
    }

    //Integer[] digits = {98, 45, 0, 97, 46, 99, 99, 99};
    public static Integer secondMaxValue(Integer[] digits) {
        if (digits == null || digits.length <= 1)
            return null;
        Arrays.sort(digits);
        int temp = digits[digits.length - 1];
        for (int i = digits.length - 2; i >= 0; i--) {
            if (temp > digits[i])
                return digits[i];
        }
        return null;
    }
}
