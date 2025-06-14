package com.debuggeandoideas;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        /*
        Lo primero que voy a hacer es, me vale madre si es negativo,
        entonces tengo que pasarlo a positivo para quitar los '-'...

        Una vez ya lo hice positivo, tengo que transformarlo a string

        ahora aqui tengo dos casos
        1221
        121

        afecta? que sea impar?

        a ver la solucion la tengo clarisima. voy a hacer un for y voy a recorrer el arrelgo
        al mismo tiempo al inicio y al final.
        1 2 2 1


        i=0

        numero[i] == numero[numero.lengt-i]
        [1,2,2,1]
        0 | (4-1-i) = 3
        1 | (4-1-1) = 2

        -> aqui tengo que cortar el esta madre

        numero[i] == numero[numero.lengt-i]
        [1,2,2,2,1]
        0 | (4-1-i) = 3
        1 | (4-1-1) = 2

        -> aqui igual lo corto, el de enmedio no me importa

        divido entre dos el numero de la lengt del arreglo y eso me va a
        dar el numero de iteraciones que tiene que dar


         */

        String number = String.valueOf(x);

        int maxIterations = number.length()/2; // siempre redondea hacia abaqo

        for(int i=0; i < number.length(); i++) {
            if( !( number.charAt(i) == ( number.charAt(number.length() - 1 - i) ) ) ) return false;

            if (i == maxIterations) return  true;
        }

        throw new RuntimeException("error");

    }

    public static void main(String[] args) {
//        121, -121, 10
        System.out.println(isPalindrome(-121));
    }
}
