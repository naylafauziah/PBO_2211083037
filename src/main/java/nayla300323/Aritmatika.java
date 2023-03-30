/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla300323;

/**
 *
 * @author TUF Gaming
 */
public class Aritmatika {
    /*
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = tambah(a, b);
        System.out.println("Hasil penjumlahan a dan b adalah " + c);
        
        cekGanjil(c);
    }

    public static int tambah(int x, int y) {
        int hasil = x + y;
        return hasil;
    }
    
    public static void cekGanjil(int z) {
        if (z % 2 == 1) {
            System.out.println("Hasil penjumlahan adalah ganjil");
        } else {
            System.out.println("Hasil penjumlahan adalah genap");
        }
    }
    */
    public int tambah(int a, int b)
    {
        return (a+b);
    }
    
    public boolean cekGanjil(int a){
        return (a%2!=0);
    }
    
    public int[] getGanjil(int n) {
        int[] ganjil = new int[n];
        int j = 0;
        for (int i = 1; j < n; i += 2) {
            ganjil[j] = i;
            j++;
        }
        return ganjil;
    }
    
    public static int[] getPrima(int m) {
        int[] prima = new int[m];
        int num = 2;
        int count = 0;
        
        while (count < m) {
            if (isPrima(num)) {
                prima[count] = num;
                count++;
            }
            num++;
        }
        return prima;
    }
    
    public static boolean isPrima(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}