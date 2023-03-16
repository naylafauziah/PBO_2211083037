/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla160323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF Gaming
 */
public class Latihan7_2NomorTerbesar {
   public static void main (String[] args){
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int[] numbers = new int[10];
       
       for(int i = 0; i<numbers.length; i++){
           String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
           int number = Integer.parseInt(input);
           numbers[i] = number;
       }
       
       int max = numbers[0];
       for(int i = 1; i<numbers.length; i++){
           if(numbers[i]>max){
               max = numbers[i];
           }
       }
       JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah " + max);
    }
}
