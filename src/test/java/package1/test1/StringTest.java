package package1.test1;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void StringTest(){

        String s1= "java";

        char[] chars = {'f','2','g'};
        String s2= new String(chars);

        String s3= new String("java");


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
    @Test
    public void charAtTest(){
        String s1= "Welcome to VietNam";

        char ch = s1.charAt(8);
        char invalid = s1.charAt(17);

        System.out.println(ch);
        System.out.println(invalid);
    }
    @Test
    public void charAtTest2(){
        String s1= "Welcome to VietNam";
        
    }
}
