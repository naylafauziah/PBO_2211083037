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
public class Latihan1InputKeyboard {
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = 0;
        char letter;
        boolean result;
        String str;
        
            System.out.print("Number : ");
            number = in.nextInt();
            System.out.print("Letter : ");
            letter = in.next().charAt(0);
            System.out.print("Boolean : ");
            result = in.nextBoolean();
            System.out.print("String : ");
            str = in.nextLine();
       
            System.out.println("Number = " +number);
            System.out.println("letter = " +letter);
            System.out.println("result = " +result);
            System.out.println("str = " +str);
    } 
}
