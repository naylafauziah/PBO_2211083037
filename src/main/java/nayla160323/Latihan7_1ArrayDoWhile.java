/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla160323;
import java.util.Scanner;
/**
 *
 * @author TUF Gaming
 */
public class Latihan7_1ArrayDoWhile {
    public static void main (String[] args){
        String days [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int i = 0;
        
        Scanner in = new Scanner(System.in);
            do{
                System.out.println(days[i]);
                i++;
            }
            while(i<days.length);
        }
    }
 
