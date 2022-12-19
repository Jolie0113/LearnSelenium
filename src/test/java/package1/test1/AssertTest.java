package package1.test1;

import org.testng.Assert;
import org.testng.annotations.Test;
import package1.demo1.Employee;

public class AssertTest {
    @Test
    public void assertNumber(){
        int a = 13;
        int b =13;
        int c =20;

        System.out.println(a ==b);
        System.out.println(a ==c);

        Assert.assertEquals(a,b);
        Assert.assertEquals(a,c);
    }

    @Test
    public void assertNumTest2(){
        int a =10;
        float b =  10.0f;

        Integer c =10;

        System.out.println(a ==b);
        System.out.println(a ==c);

    }
    @Test
    public void assertNumTest3(){
        String s1= "Java";
        String s2= "Java";
        String s3 = "JaVa";

        System.out.println(s1 ==s2);
        System.out.println(s1 ==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        Assert.assertEquals(s1,s2);
//        Assert.assertEquals(s1,s3);

        Assert.assertNotEquals(s1,s3);

    }
    @Test
    public void assertNumTest5(){
        String s1= "Java";
        String s2= "Java"; // s1 && s2 poits to the same object
        String s3 = new String("Java"); //s3 is a new object, which is diffirent from s1, s2


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

// == : compair 2 things: Object & value
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); // false


// equals(): compare value
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
















    @Test
    public void assertTest4(){
        Employee employee1= new Employee(1,"John");
        Employee employee2= new Employee(1,"John");

        Employee employee3= new Employee(6,"Join67");
        Employee employee4= new Employee(3,"Join67");
        Employee employee5= new Employee(7,"Join67");

        System.out.println(employee1 == employee2); //false
        System.out.println(employee1.equals(employee2)); //false

        Assert.assertEquals(employee1,employee2);

        System.out.println(employee1.getId() == employee2.getId());
        System.out.println(employee1.getName() == employee2.getName());

        System.out.println(employee1.getName().equals(employee2.getName()));
    }




}
