/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150623;

/**
 *
 * @author TUF Gaming
 */
public class Circle extends Shape{
    int r;
    Circle(String nama) {
        super(nama);
        r= 3;
    }
    
    float getArea() {
        float luas;
        luas = (float)(3.14 * r * r);
        return luas;
    }
}
