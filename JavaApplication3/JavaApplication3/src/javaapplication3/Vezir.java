/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Random;

/**
 *
 * @author BM
 */
public class Vezir {

    public int[][] matris = new int[8][8];

    public void olustur() {
        int sayi = 0;
        Random rnd = new Random();
        ////olusturma;
        for (int i = 0; i < 8; i++) {
            sayi = rnd.nextInt(8);
            matris[sayi][i] = 1;
        }
        //////ekrana yaz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public int test() {
        int tehdit = 0;
        int capraztehdit = 0;
        /////////////////test et
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matris[i][j] == 1) {///veziri buldun
                    ///satırları kontrol et
                    for (int k = 0; k < 8; k++) {
                        if (matris[i][j] == matris[i][k] && j != k) {
                            ///satırları kontol et
                            tehdit++;
                        }
                        if (matris[i][j] == matris[k][j] && i != k) {
                            ///sutunları kontol et
                            tehdit++;
                        }
                    }
                    int a = i;
                    int b = j;
                    while (a < 7 && b > 0) {
                        //////sol alt capraz kontrol
                        a++;
                        b--;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    a = i;
                    b = j;
                    while (a > 0 && b > 0) {
                        ////sol üst capraz kontrol doğru
                        a--;
                        b--;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    a = i;
                    b = j;
                    while (a < 7 && b < 7) {
                        //////sağ alt capraz kontrol
                        a++;
                        b++;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    a = i;
                    b = j;
                    while (a > 0 && b < 7) {
                        //////sağ üst capraz kontrol
                        a--;
                        b++;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                }
            }
        }
        System.out.println("capraz tehdit: " + capraztehdit);
        return tehdit + capraztehdit;
    }

    public int[] ektest() {
        int sayac = 0;
        int[] tehditler = new int[8];
        int tehdit = 0;
        int capraztehdit = 0;
        /////////////////test et
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matris[i][j] == 1) {///veziri buldun
                    ///satırları kontrol et
                    for (int k = 0; k < 8; k++) {
                        if (matris[i][j] == matris[i][k] && j != k) {
                            ///satırları kontol et
                            tehdit++;
                        }
                        if (matris[i][j] == matris[k][j] && i != k) {
                            ///sutunları kontol et
                            tehdit++;
                        }
                    }
                    int a = i;
                    int b = j;
                    while (a < 7 && b > 0) {
                        //////sol alt capraz kontrol
                        a++;
                        b--;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    a = i;
                    b = j;
                    while (a > 0 && b > 0) {
                        ////sol üst capraz kontrol doğru
                        a--;
                        b--;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    a = i;
                    b = j;
                    while (a < 7 && b < 7) {
                        //////sağ alt capraz kontrol
                        a++;
                        b++;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    a = i;
                    b = j;
                    while (a > 0 && b < 7) {
                        //////sağ üst capraz kontrol
                        a--;
                        b++;
                        if (matris[a][b] == 1) {
                            capraztehdit++;
                        }
                    }
                    tehditler[sayac] = capraztehdit + tehdit;
                    sayac++;
                    capraztehdit = 0;
                    tehdit = 0;
                }
            }
        }
        int toplam = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println(i + 1 + ".satırdaki veziler için tehditler :" + tehditler[i]);
            toplam += tehditler[i];
        }
        return tehditler;
    }

}
