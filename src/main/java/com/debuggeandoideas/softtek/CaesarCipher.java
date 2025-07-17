package com.debuggeandoideas.softtek;

import java.util.Scanner;

public class CaesarCipher {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String encrypted = "";

        // ansci 65 -  90 -> A,B,C,...,Z
        // ansci 97 - 122 -> a,b,c,...,z
        for(int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isAlphabetic(character)) {
                int ascii = (int) character;

                // MAYÚSCULAS: 'A' (65) a 'Z' (90)
                if (ascii >= 65 && ascii <= 90) {
                    int charEncrypted = ((ascii - 65 + k) % 26) + 65;
                    encrypted += (char) charEncrypted;
                }

                // MINÚSCULAS: 'a' (97) a 'z' (122)
                else if (ascii >= 97 && ascii <= 122) {
                    int charEncrypted = ((ascii - 97 + k) % 26) + 97;
                    encrypted += (char) charEncrypted;
                }

            } else {
                encrypted += character;
            }
        }

        System.out.println(encrypted);
        scanner.close();
    }
}
