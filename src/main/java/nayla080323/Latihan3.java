/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla080323;

/**
 *
 * @author TUF Gaming
 */
public class Latihan3 {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int max;
        
        System.out.println("Number 1 = "+number1);
        System.out.println("Number 2 = "+number2);
        System.out.println("Number 3 = "+number3);
        
        //mencari nilai max dengan operator kondisi
        max = (number2>=number1)? number2:number1;
        max = (number3>=max)? number3:max;
        System.out.println("Nilai tertingginya adalah angka = "+max);
    }
}
