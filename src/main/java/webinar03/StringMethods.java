package webinar03;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cool";
        int l = str.length();
        System.out.println(l);
        char secondChar = str.charAt(3);
        System.out.println(secondChar);
        System.out.println("=================");
        String adb = " ArefA ";
        String adbWOSpace = adb.trim();
        System.out.println(adbWOSpace);
        String adbReplace = adb.trim().replace('A', 'B');
        System.out.println(adbReplace);
        String adbReplaceAll = adb.trim().replaceAll("re", "ma");
        System.out.println(adbReplaceAll);
        System.out.println("syrte" + "ftryhu");
        String res = str.concat(",").concat(adb)
                .concat(", ").concat(adbReplaceAll);
        System.out.println(res);
        String subStr = res.substring(6, 13);
        System.out.println(subStr);
        System.out.println("==============");
        String text = " Today is a Good Day! ";
        System.out.println(countWords(text));
        System.out.println("==============");
        System.out.println(countChars(text, 'a'));
        System.out.println("==============");
        String sentence = "I have a two cats, first is a black cat," +
                " second is a white Cat";
        System.out.println(replaceWord(sentence));
        System.out.println("==============");
        System.out.println(findLongestWord(sentence));
    }

    //Найти самое длинное слово
    //Из строки найти слово с наибольшей длиной.
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isBlank())
            return null;
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return longestWord;
    }

    //заменить все слова "cat" на "dog" в строке
    public static String replaceWord(String sentence) {
        if (sentence == null || sentence.isBlank())
            return null;
        //String res = sentence.replaceAll("cat", "dog");
        return sentence.toLowerCase()
                .replaceAll("cat", "dog");
    }

    //    Задача 1: Подсчитать количество слов в строке
    //    Условие: Напиши метод, который получает строку и
    //    возвращает количество слов в ней.
    //    Слова разделены пробелами.
    public static Integer countWords(String text) {
        if (text == null || text.isBlank())
            return null;
        String[] words = text.trim().split(" ");
        return words.length;
    }

    //Напиши метод, который считает,
    // сколько раз определённый символ встречается в строке.
    public static int countChars(String text, char target) {
        if (text == null || text.isBlank()) {
            return -1;
        }
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (ch == target)
                count++;
        }
        return count;
    }


}
