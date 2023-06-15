/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150623;

/**
 *
 * @author TUF Gaming
 */
public class Square extends Shape {
    private int sisi;
        Square(String nama) {
        super(nama);
        sisi = 3;
    }

        float getArea() {
        float luas;
        luas = sisi * sisi;
        return luas;
    }
}
