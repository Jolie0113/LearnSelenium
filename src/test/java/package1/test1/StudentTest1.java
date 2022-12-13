package package1.test1;

import org.testng.annotations.Test;
import package1.demo1.Student;

public class StudentTest1 {

    //Annotation
    @Test
    public void creteOblectthroughtReferenceTest(){
        Student student = new Student();                        // ----Student: class; student: Object---------
        student.id= 1; // gan gtri truc tiep vao fields
        student.name = "Tome";
        System.out.println("ID: "+student.id+" Name: "+student.name);

    }
    @Test
    public  void creteOblectthroughtMethodTest(){
        Student student = new Student();
        student.setId(2); // cham cac ham
        student.setName("Marry");
        System.out.println("ID: "+student.id+" Name: "+student.name); // cham thuoc tinh

    }
    @Test
    public void creteOblectthroughtConstructor(){
        Student student = new Student(3,"Harry"); // nhap truc tiep vao ID, Name
        System.out.println("ID: "+student.id+" Name: "+student.name);

    }




    @Test
    public void accessSpecifierPublictest(){
        Student student = new Student(4,"Join");
        System.out.println("ID: "+student.getId()+" Name: "+student.getName()); // goi ham -> cham ham
    }

}
