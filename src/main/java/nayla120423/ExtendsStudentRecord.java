/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla120423;

/**
 *
 * @author TUF Gaming
 */
public class ExtendsStudentRecord extends StudentRecord{
    public static void main(String[] args) {
        nayla060423.StudentRecord annaRecord = new nayla060423.StudentRecord();
        nayla060423.StudentRecord crisRecord = new nayla060423.StudentRecord();
        
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(20);
        annaRecord.setMathGrade(85);
        annaRecord.setEnglishGrade(78);
        annaRecord.setScienceGrade(90);
        
        //Tampil data anna
        System.out.println("Nama     : "+annaRecord.getName());
        System.out.println("Alamat   : "+annaRecord.getAddress());
        System.out.println("Umur     : "+annaRecord.getAge());
        System.out.println("Nilai Matematika   : "+annaRecord.getMathGrade());
        System.out.println("Nilai B. Inggris   : "+annaRecord.getEnglishGrade());
        System.out.println("Nilai Sains        : "+annaRecord.getScienceGrade());
        System.out.println("Rata-Rata          : "+annaRecord.getAverage());
        
        crisRecord.setName("Cris");
        crisRecord.setAddress("Kanada");
        crisRecord.setAge(22);
        crisRecord.setMathGrade(80);
        crisRecord.setEnglishGrade(99);
        crisRecord.setScienceGrade(85);
        
        //Tampil data cris
        System.out.println("\nNama     : "+crisRecord.getName());
        System.out.println("Alamat   : "+crisRecord.getAddress());
        System.out.println("Umur     : "+crisRecord.getAge());
        System.out.println("Nilai Matematika   : "+crisRecord.getMathGrade());
        System.out.println("Nilai B. Inggris   : "+crisRecord.getEnglishGrade());
        System.out.println("Nilai Sains        : "+crisRecord.getScienceGrade());
        System.out.println("Rata-Rata          : "+crisRecord.getAverage());
        
        System.out.println("");
        nayla060423.StudentRecord aliRecord = new nayla060423.StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Belgia");
        aliRecord.setAge(18);
        
        aliRecord.print("");
        aliRecord.print(95,80,90);
        System.out.println("Rata-Rata     : "+aliRecord.getAverage());
        
        System.out.println("Count :"+nayla060423.StudentRecord.getstudentCount());
    }
    
    @Override
    public String getName(){
        System.out.println("Nayla");
        return name;
    }
}
