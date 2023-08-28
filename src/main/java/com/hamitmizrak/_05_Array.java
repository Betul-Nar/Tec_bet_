package com.hamitmizrak;

public class _05_Array {
    public static void main(String[] args) {
        int[] dizi = new int[9];
        dizi[1] = 1;
        dizi[4] = 2;

        // Dizinin tüm elemanlarını ekrana yazdıralım
        System.out.println("Dizi Elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }


    }
}