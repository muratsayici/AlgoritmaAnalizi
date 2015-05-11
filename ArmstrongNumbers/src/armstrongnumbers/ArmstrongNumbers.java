/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnumbers;

/**
 *
 * @author Murat SAYICI
 */
public class ArmstrongNumbers {

    public void Test(int sayi) {
        int gecici=sayi;
        int birler, onlar, yüzler;
        birler = sayi % 10;
        sayi = sayi / 10;

        onlar = sayi % 10;
        sayi = sayi / 10;

        yüzler = sayi % 10;

        double toplam = Math.pow(yüzler, 3) + Math.pow(onlar, 3) + Math.pow(birler, 3);
        if (gecici ==(int) toplam) {
            System.out.println("ARMSTRONG SAYISIDIR");
        } else {
            System.out.println("ARMSTRONG SAYISI DEĞİLDİR");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArmstrongNumbers a = new ArmstrongNumbers();
        a.Test(372);
    }

}
