package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sıcaklık giriniz:");
        heat = scanner.nextInt();

        if (heat < 5) System.out.println("Kayak Yapabilirsiniz.");
        else if (heat <= 15) System.out.println("Sinemaya gidebilirsiniz.");
        else if (heat <= 25) System.out.println("Piknik gidebilirsiniz.");
        else System.out.println("Yüzmeye gidebilirsiniz.");
   }
}
