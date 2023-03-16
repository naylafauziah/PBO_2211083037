/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150323;
import java.util.Scanner;
/**
 *
 * @author TUF Gaming
 */
public class Latihan6_4PangkatFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        System.out.print("Masukkan pangkat: ");
        int pangkat = sc.nextInt();

        int hasil = 1;

        for (int i = 1; i <= pangkat; i++) {
            hasil *= angka;
        }

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }
}


