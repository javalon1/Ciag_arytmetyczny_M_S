package com.sda.algorytmy;

import java.util.Scanner;

/**
 ai = a1 + (i-1)* d
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        System.out.println("Podaj a1: ");
        int a1 = scanner.nextInt();
        System.out.println("Podaj d: ");
        int d = scanner.nextInt();

        int ciag = 0;

        for (int i =1; i<=n; i++){
            ciag = a1 + (i-1)*d;
            System.out.println(ciag);
        }


    }
}
