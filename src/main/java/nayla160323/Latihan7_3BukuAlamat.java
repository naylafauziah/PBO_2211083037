/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla160323;

/**
 *
 * @author TUF Gaming
 */
public class Latihan7_3BukuAlamat {
    public static void main (String[] args){
        String[][] data = new String[][]
        {{"Florence","765-1234","Manila"},
         {"Joyce","983-3333","Quezon City"},
         {"Becca","456-3322","Manila"}};
        for (int i=0;i<data.length;i++){
            System.out.println("Nama   : " + data[i][0]);
            System.out.println("Telp   : " + data[i][1]);
            System.out.println("Addres : " + data[i][2]);
            System.out.println("");
        }
    }
}
