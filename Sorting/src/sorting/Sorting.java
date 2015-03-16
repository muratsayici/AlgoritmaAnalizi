/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import static java.util.Collections.swap;
import java.util.Random;

/**
 *
 * @author BM
 */
public class Sorting {

    public static int swap = 0;
    public static int karsilastir = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        int[] dizi = new int[500];
        Random randomGenerator = new Random();
        int sayi = 0;
        for (int i = 0; i < 500; i++) {
            sayi = randomGenerator.nextInt(10000);
            dizi[i] = sayi;
        }
        InsertionSort(dizi);
        for (int i = 1; i < 500; i++) {
            System.out.println(dizi[i]);
        }
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double) estimatedTime / 1000; //
        System.out.println(seconds);
        System.out.println("karsilastirma :" + karsilastir);
        System.out.println("swap :" + swap);

    }

    public static void BubbleSort(int[] dizi) {

        int temp;   // Yer değiştirmede kullanılacak geçici değişken
        for (int i = 1; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length - i; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                    swap++;
                }
                karsilastir++;
//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
            }// Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
        }// Her karşılaştırmadan sonra yeniden kaldığımız yerden devam etmemizi sağlayan döngü

    }

    public static void selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                karsilastir++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
                swap++;
            }

        }

    }

    public static void InsertionSort(int[] num) {
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;

        for (j = 1; j < num.length; j++) // Start with 1 (not 0)
        {
            key = num[ j];
            for (i = j - 1; (i >= 0) && (num[ i] < key); i--) // Smaller values are moving up
            {
                num[ i + 1] = num[ i];
                karsilastir++;
                swap++;
            }
            num[ i + 1] = key;    // Put the key in its proper location
            karsilastir++;

        }
    }

    public static void shell(int[] a) {
        int increment = a.length / 2;
        while (increment > 0) {
            for (int i = increment; i < a.length; i++) {
                int j = i;
                int temp = a[i];
                while (j >= increment && a[j - increment] > temp) {
                    a[j] = a[j - increment];
                    j = j - increment;
                    swap++;
                }
                a[j] = temp;
                karsilastir++;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }

}
