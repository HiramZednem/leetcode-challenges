package com.debuggeandoideas;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class LongestCommonPrefix {
    /*
        evidentemente tengo que recorrer todas las palabras que me mandan....
        Ahora tambien los caracteres? tengo dos ideas en mente.... habria
        que ver cual es menos compleja.


        La primera y mas compleja es guardar la primera palabra en una variable
        llamada prefix..

        Y ahora, de la siguiente palabra ir viendo hasta que letra son iguales.
        Si es la primera letra que se evalua no coincide entonces mando mi output "" en fa

        pues honestamente creo que lo voy a hacer de esta forma ta facil, luego vemos si
        le podemos bajar la complejidad


     */
    public static String longestCommonPrefix(String[] strs) {

        String prefix = "";

        for(int wordToReview = 0; wordToReview < strs.length; wordToReview++) {
            if(strs[wordToReview].equals("")) return "";
            if (wordToReview == 0) {
                prefix = strs[0];
                continue;
            };

            String prefixHelper = "";


            String shortestWord;
            if(prefix.length() > strs[wordToReview].length()) {
                shortestWord = strs[wordToReview];
            } else {
                shortestWord = prefix;
            }

            for (int prefixIndex = 0; prefixIndex < shortestWord.length(); prefixIndex++) {
                if ( prefix.charAt(prefixIndex) == strs[wordToReview].charAt(prefixIndex) ) {
                    prefixHelper += prefix.charAt(prefixIndex);
                    System.out.println(prefixHelper);
                    if(prefixIndex == shortestWord.length()-1) {
                        prefix = prefixHelper;
                    }
                } else {
                    prefix = prefixHelper;
                    break;
                }

            }

        }

        return prefix;
    }

    public static void main(String[] args) {
        var result = longestCommonPrefix(new String[]{"abba","ab",""});
        System.out.println(result);
    }

}
