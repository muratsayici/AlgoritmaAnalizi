/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author muratsayici
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vezir a = new Vezir();
        a.olustur();

        // System.out.println("tehdit sayisi :" + a.test());
        //System.out.println(a.ektest()[1]);

        int[] dizi = new int[8];
        dizi = a.ektest();
     
    }

}
