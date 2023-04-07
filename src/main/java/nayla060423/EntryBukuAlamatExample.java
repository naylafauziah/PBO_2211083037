/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla060423;

/**
 *
 * @author TUF Gaming
 */
public class EntryBukuAlamatExample {
    public static void main(String[]args)
    {
        EntryBukuAlamat a = new EntryBukuAlamat("Ibid athoillah");
        EntryBukuAlamat b = new EntryBukuAlamat("Gita Febriani ");
        a.setAlamat("Lebo");
        a.setNotelp("089660705147");
        a.setEmail("i.bidz@yahoo.co.id");
        a.tampilkan();
        b.setAlamat("Batang");
        b.setNotelp("089660795354");
        b.setEmail("febriani@yahoo.co.id");
        b.tampilkan();
    }
}
