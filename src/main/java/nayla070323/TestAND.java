/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla070323;

/**
 *
 * @author TUF Gaming
 */
public class TestAND {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test = false;
        
        //demonstrasi && (membandingkan)kalo yang satu salah maka hasil nya false
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demostrasi & (operasi and) harus di kerjakan dua2 nya
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
