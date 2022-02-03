package com.iesebre;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        sc.nextLine();
        String aString = sc.nextLine();
        String bString = sc.nextLine();
        char a = aString.charAt(0);
        char b = bString.charAt(0);
        mostraVarisCaracters(a, b, longitud);


    }

    public static void mostraVarisCaracters(char a, char b, int longitud){
        Random rand = new Random();
        char c;
        String cadena="";
        for (int i=0; i<longitud; i++) {
            if ((int) a > (int) b) {
                int n = rand.nextInt((int) a - (int) b) + (int) b;
                c = (char) n;
            } else {
                int n = rand.nextInt((int) b - (int) a) + (int) a;
                c = (char) n;
            }
            cadena+=c;
        }
        System.out.println("Execució del mètode mostraVarisCaracters:");
        System.out.println(cadena);
    }
}