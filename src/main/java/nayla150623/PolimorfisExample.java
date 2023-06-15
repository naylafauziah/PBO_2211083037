/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150623;

/**
 *
 * @author TUF Gaming
 */
public class PolimorfisExample {
    public static void main (String[] args){
        Person ref;
        
        Student student = new Student();
        Employee employee = new Employee();
        
        student.setName("Ali");
        ref = student;
        System.out.println("Nama "+ref.getName());
        employee.setName("Beni");
        ref = employee;
        System.out.println("Nama "+ref.getName());
    }
}
