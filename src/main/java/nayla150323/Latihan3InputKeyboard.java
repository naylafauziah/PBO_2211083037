/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author TUF Gaming
 */
public class Latihan3InputKeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        int a;
        int b;
        int c;
        int max;
        
        try{
            System.out.print("Entri Number 1 : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Number 2 : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Number 3 : ");
            c = Integer.parseInt(dataIn.readLine());
            
            max = (b>=a)? b:a;
            max = (c>=max)? c:max;
            System.out.println("Nilai tertingginya adalah angka = "+max);
        } catch(Exception ex){
        }
    }
}
