/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150623;

/**
 *
 * @author TUF Gaming
 */
public class Student extends Person{
    public Student(){ 
        super("ani","Padang");
        //super class jadi di superclass nya cari dua parameter
        System.out.println("Inside Student:Constructor"); 
        //beberapa kode di sini 
        // bisa digunakan untuk inisialisasi awal untuk objek
    }

    @Override 
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }
    
    public static void main( String[] args ){ 
        Student anna = new Student(); 
        anna.name = "Budi";
        anna.address = "Padang";
        System.out.println("Nama " +anna.name);
    }
    
    
}
