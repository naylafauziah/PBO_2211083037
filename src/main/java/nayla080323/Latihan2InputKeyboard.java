/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla080323;
import java.util.Scanner;
/**
 *
 * @author TUF Gaming
 */
public class Latihan2InputKeyboard {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int average;
        
        System.out.print("Number 1 : ");
            number1 = in.nextInt();
        System.out.print("Number 2 : ");
            number2 = in.nextInt();
        System.out.print("Number 3 : ");
            number3 = in.nextInt();    
        
        average = (number1+number2+number3)/3;
            System.out.println("Number 1 = " +number1);
            System.out.println("Number 2 = " +number2);
            System.out.println("Number 3 = " +number3);
            System.out.println("Average is = " +average);
    }
}
