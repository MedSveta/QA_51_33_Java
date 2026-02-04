package webinar04;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder strBild = new StringBuilder();
        System.out.println(strBild.length());
        System.out.println(strBild.capacity());
        StringBuilder strBild1 = new StringBuilder(50);
        System.out.println(strBild1.length());
        System.out.println(strBild1.capacity());
        StringBuilder strBild2 = new StringBuilder("good day ");
        System.out.println(strBild2.length());
        System.out.println(strBild2.capacity());

        String str = strBild1.toString();
        System.out.println("==============");
        strBild2.append(true).append(" ").append(145).append(" ").append(87.0);
        System.out.println(strBild2);
        System.out.println("==============");
        strBild2.insert(9, "Mama");
        System.out.println(strBild2);
        System.out.println("==============");
        System.out.println(strBild2.substring(9, 13));
        System.out.println(strBild2);
        System.out.println(strBild2.substring(13));
        System.out.println("==============");
        System.out.println("after delete " + strBild2.deleteCharAt(25));
        System.out.println("after delete " + strBild2.delete(0, 4));
        System.out.println("==============");
        System.out.println("after reverse " + strBild2.reverse());
        String str1 = "Moloko ";
        System.out.println("==============");
        System.out.println(replaceSymbol(str1, 'o', 'a'));
        System.out.println("==============");
        System.out.println(repeatWord(str1, 5));
        System.out.println("==============");
        String str2 = "Mama pa453 pa 78 09 mj 2%";
        System.out.println(removeDigits(str2));
    }

    // Используя StringBuilder, замените все символы из строки на replacement.
    public static String replaceSymbol(String str, char symbol, char replaceSymbol) {
        if (str == null || str.isBlank())
            return null;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == symbol) {
                sb.setCharAt(i, replaceSymbol);
            }
        }
        return sb.toString();
    }

    //Собрать строку, повторив слово n раз, используя StringBuilder
    public static String repeatWord(String str, int count) {
        if (str == null || str.isBlank() || count <= 0)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    //удалить все цифры из строки
    public static String removeDigits(String str) {
        if (str == null || str.isBlank())
            return null;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

}
