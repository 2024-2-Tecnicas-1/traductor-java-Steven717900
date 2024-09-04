package com.mycompany.traductorjava;
import java.util.HashMap;
import java.util.Scanner;

public class TraductorJava {

    public static HashMap<String, String> obtenerTextos(String idioma) {
        HashMap<String, String> mensajesESP = new HashMap<>();
        mensajesESP.put("0", "cero");
        mensajesESP.put("1", "uno");
        mensajesESP.put("2", "dos");
        mensajesESP.put("3", "tres");
        mensajesESP.put("4", "cuatro");
        mensajesESP.put("5", "cinco");
        mensajesESP.put("6", "seis");
        mensajesESP.put("7", "siete");
        mensajesESP.put("8", "ocho");
        mensajesESP.put("9", "nueve");
        mensajesESP.put("10", "diez");
        mensajesESP.put("11", "once");
        mensajesESP.put("12", "doce");
        mensajesESP.put("13", "trece");
        mensajesESP.put("14", "catorce");
        mensajesESP.put("15", "quince");
        mensajesESP.put("16", "dieciséis");
        mensajesESP.put("17", "diecisiete");
        mensajesESP.put("18", "dieciocho");
        mensajesESP.put("19", "diecinueve");
        mensajesESP.put("20", "veinte");
        mensajesESP.put("30", "treinta");
        mensajesESP.put("40", "cuarenta");
        mensajesESP.put("50", "cincuenta");
        mensajesESP.put("60", "sesenta");
        mensajesESP.put("70", "setenta");
        mensajesESP.put("80", "ochenta");
        mensajesESP.put("90", "noventa");
        mensajesESP.put("100", "cien");
        mensajesESP.put("suma", "La suma de ");
        mensajesESP.put("es", " es ");

        HashMap<String, String> mensajesENG = new HashMap<>();
        mensajesENG.put("0", "zero");
        mensajesENG.put("1", "one");
        mensajesENG.put("2", "two");
        mensajesENG.put("3", "three");
        mensajesENG.put("4", "four");
        mensajesENG.put("5", "five");
        mensajesENG.put("6", "six");
        mensajesENG.put("7", "seven");
        mensajesENG.put("8", "eight");
        mensajesENG.put("9", "nine");
        mensajesENG.put("10", "ten");
        mensajesENG.put("11", "eleven");
        mensajesENG.put("12", "twelve");
        mensajesENG.put("13", "thirteen");
        mensajesENG.put("14", "fourteen");
        mensajesENG.put("15", "fifteen");
        mensajesENG.put("16", "sixteen");
        mensajesENG.put("17", "seventeen");
        mensajesENG.put("18", "eighteen");
        mensajesENG.put("19", "nineteen");
        mensajesENG.put("20", "twenty");
        mensajesENG.put("30", "thirty");
        mensajesENG.put("40", "forty");
        mensajesENG.put("50", "fifty");
        mensajesENG.put("60", "sixty");
        mensajesENG.put("70", "seventy");
        mensajesENG.put("80", "eighty");
        mensajesENG.put("90", "ninety");
        mensajesENG.put("100", "one hundred");
        mensajesENG.put("suma", "The sum of ");
        mensajesENG.put("es", " is ");

        switch (idioma) {
            case "Espanol":
                return mensajesESP;
            case "English":
                return mensajesENG;
            default:
                return null;
        }
    }

    public static String getNumberInWords(int number, HashMap<String, String> textos) {
        if (number < 10) {
            return textos.get(String.valueOf(number));
        } else if (number < 20) {
            return textos.get(String.valueOf(number));
        } else if (number < 100) {
            int tens = number / 10 * 10;
            int ones = number % 10;
            return textos.get(String.valueOf(tens)) + (ones > 0 ? " y " + textos.get(String.valueOf(ones)) : "");
        } else {
            return textos.get(String.valueOf(number));
        }
    }

    public static void main(String[] args) {
             Scanner lector = new Scanner(System.in);
        int a, b;

        System.out.println("Selecciona el idioma");
        String idioma = lector.next();

        HashMap<String, String> textos = obtenerTextos(idioma);

        if (textos != null) {
            if (idioma.equals("Espanol")) {
                System.out.println("Ingresa el primer número");
            } else if (idioma.equals("English")) {
                System.out.println("Enter the first number");
            }
            a = lector.nextInt();

            if (idioma.equals("Espanol")) {
                System.out.println("Ingresa el segundo número");
            } else if (idioma.equals("English")) {
                System.out.println("Enter the second number");
            }
            b = lector.nextInt();

            int suma = a + b;

            String numeroA = getNumberInWords(a, textos);
            String numeroB = getNumberInWords(b, textos);
            String resultado = getNumberInWords(suma, textos);

            if (idioma.equals("Espanol")) {
                System.out.println("La suma de " + numeroA + " y " + numeroB + " es " + resultado);
            } else if (idioma.equals("English")) {
                System.out.println("The sum of " + numeroA + " plus " + numeroB + " is equal to " + resultado);
            }
        }
    }
}