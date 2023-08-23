package com.hamitmizrak;

public class stringReplace {
    public static void main(String[] args) {
        String metin1="selam dünyalı , nasılsın dünyalı ";
        String metin2="dünyalı ";
        String metin3="marslı :D ";

        String yeniMetin=metin1.replace(metin2,metin3);
        System.out.println("yeni metin  : "+yeniMetin);
        System.out.println(metin1.length());
        System.out.println(metin1.trim().length());
        System.out.println(metin1.concat("41  kere maşallah "));













    }
}
