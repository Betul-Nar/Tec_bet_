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

        // Dizinin eleman sayısını ekrana yazdıralım
        System.out.println(dizi.length + " dizinin eleman sayısı");

        // Dizideki elemanların toplamını hesaplayalım
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println("Dizideki Elemanların Toplamı: " + toplam);

        // Dizideki en büyük elemanı  bulalım
        int max = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }
        System.out.println("Dizideki En Büyük Eleman: " + max);
    }
}