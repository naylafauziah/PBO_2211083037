/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla300323;

/**
 *
 * @author TUF Gaming
 */
public class AritmatikaExample {
    public static void main(String[] args){
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(10,5);
        System.out.println("C : " +c);
        System.out.println("Ganjil? " +aritmatika.cekGanjil(c));
        
        int n = 6;
        int[] ganjil = aritmatika.getGanjil(n);
        System.out.println("Bilangan ganjil sebanyak " + n + " adalah:");
            for (int i = 0; i < ganjil.length; i++) {
            System.out.print(ganjil[i] + " ");
        }
            
        int m = 6; // Ganti dengan nilai n yang diinginkan
        // Cetak n bilangan prima
        int[] prima = aritmatika.getPrima(m);
        System.out.println("\nBilangan prima pertama " + m + " adalah:");
        for (int i = 0; i < m; i++) {
            System.out.print(prima[i] + " ");
        }
    }
}
