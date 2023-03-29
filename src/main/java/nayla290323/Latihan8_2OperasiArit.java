/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla290323;
import java.util.Scanner;
/**
 *
 * @author TUF Gaming
 */
public class Latihan8_2OperasiArit {
    public static void main(String[] args){
        String bil1= args[0];
        String bil2= args[1];
        int sum ;
        int difference ;
        int product;
        int quotient;
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan 2 buah Bilangan");
        bil1 = in.nextLine();
        bil2 = in.nextLine();

        if (args.length > 0){
            int a = Integer.parseInt(bil1);
            int b = Integer.parseInt(bil2);
            sum= a+b;
            difference = a - b;
            product = a * b;
            quotient = a / b;
            System.out.println("Sum       = "+sum);
            System.out.println("Different = "+difference);
            System.out.println("Product   = "+product);
            System.out.println("Quotient  = "+quotient);
        }
    }
}
