package webinar04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks {
    public static void main(String[] args) {
        // . \\. \d \D \w \W ^ $ \s+ [a-j] a{3} a{2, }
        String exp = "a!bb";
        String exp1 = "[a-kA-K\\s]+";
        Pattern pattern1 =Pattern.compile(exp1);
        String reg = "a.b";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(exp);
        System.out.println(matcher.matches());
        System.out.println(matcher.find());
        System.out.println(isLettersA_K_a_k_andSpase("c ADK fa"));
        System.out.println(isNotDigits("frt$etrJH"));
        System.out.println(isEnglishFullName("Sveta Sveta"));
    }

    // a-k A-K " "
    static Boolean isLettersA_K_a_k_andSpase(String str){
        if (str == null|| str.isBlank())
            return null;
        Pattern pattern = Pattern.compile("[a-kA-K\\s]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static Boolean isNotDigits(String str){
        if (str == null|| str.isBlank())
            return null;
        Pattern pattern = Pattern.compile("\\D+"); // "[^0-9]+"
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    // Sveta Sveta
    static Boolean isEnglishFullName(String str){
        if (str == null|| str.isBlank())
            return null;
        Pattern pattern = Pattern.compile
                ("^[A-Z]{1}[a-z]{1,9}\\s[A-Z]{1}[a-z]{1,15}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    // " " "\\s+"
}
