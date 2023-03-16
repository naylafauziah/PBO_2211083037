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
public class Latihan1InputKeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        int a;
        int b;
        
        try{
            System.out.print("Entri Nilai A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai B : ");
            b = Integer.parseInt(dataIn.readLine());
            int c = a + b;
            System.out.println("Hasil C : "+ c);
        } catch(Exception ex){
        }
    }
}
