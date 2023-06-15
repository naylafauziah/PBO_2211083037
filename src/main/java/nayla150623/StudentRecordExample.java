/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla150623;

/**
 *
 * @author TUF Gaming
 */
public class StudentRecordExample {
    public static void main( String[] args ){
        StudentRecord naylaRecord = new StudentRecord();

        //Memberi nama siswa
        naylaRecord.setName("Nayla");

        //Menampilkan nama siswa
        System.out.println(naylaRecord.getName() );

        //Menampilkan jumlah siswa
        System.out.println("Count= "+StudentRecord.getStudentCount());
    }

    class CobaOverride extends StudentRecord {
        @Override
        public String getName(){
            System.out.println("nayla juga student loooh....");
            return name;
        }
    }
}
