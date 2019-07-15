package pl.martaprosniak.codewars;

import java.util.Arrays;
import java.util.List;

public class Troll {
    public static String disemvowel(String str) {
        String[] vowels = {"a", "e","o","i", "u"};
        List<String> vowelsList = Arrays.asList(vowels);
        String trollString = str;

        for (int i = 0; i < str.length(); i++) {
            String vowel = String.valueOf(str.charAt(i)).toLowerCase();
            if (vowelsList.contains(vowel)){
                trollString = trollString.replaceAll(vowel, "");
                trollString = trollString.replaceAll(vowel.toUpperCase(), "");
            }
        }

        return trollString;
    }

   /*
    public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
    */
}
