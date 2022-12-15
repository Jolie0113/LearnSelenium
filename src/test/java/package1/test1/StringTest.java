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
        String s1= " Welcome to  VietNam ";
        System.out.println(" Word count: "+wordCount(s1));

    }
    public static int wordCount(String str){
        str = str.trim();
        int count = 0;
        if(str.length() > 0){
            count = 1;
        }
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    @Test
    public void charAtTest3(){
        String s1= "    Welcome to  VietNam        ";

//       s1.strim();???????????
        s1 = s1.trim();

        int strlen = s1.length();

        System.out.println(s1);


        System.out.println("Char at 0 index: " +s1.charAt(0));
        System.out.println("char at last index: " + s1.charAt(strlen -1));

    }
    @Test
    public void concatTest(){
        String s1 = "    Welcome to  VietNam        ";

        s1 = s1.trim();

        s1 = s1.concat("2020");

        System.out.println(s1);
    }
    @Test
    public void concatTest2(){

        String s1 = "Welcome";
        String s2 = " to ";
        String s3 = " Java!";

        String s4= s1.concat(s2).concat(s3);

        System.out.println(s4);
    }
    @Test
    public void formatTest1(){
        String s1 = "    Welcome to  VietNam        ";

        String s2 = String.format("Welcome to %s VietNam %s", "2022", "new year");

        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void formatTest2(){
        String s1 = "Well come to %s to our website in %s!";
        String loginName = "Daisy";
        int year = 2022;

        String s2=  String.format(s1, loginName,year);

        System.out.println(s2);
    }
    @Test
    public void containsTest1(){
        String s1 = "Well come to %s to our website!";
        String loginName = "Daisy";
        String LoginID= "10002NV";

        String s2=  String.format(s1, loginName);

        System.out.println(s2.contains(loginName));
        System.out.println(s2.contains(LoginID));

        System.out.println(s2.contains("daisy")); // KQ =false
    }
    @Test
    public void startWithTest1(){
        String s1 = "Welcome to %s to our website";

        System.out.println(s1.startsWith("Welcome"));
        System.out.println(s1.startsWith("wellcome"));
        System.out.println(s1.startsWith("Wel"));

        System.out.println(s1.endsWith("website"));
        System.out.println(s1.endsWith("e"));
        System.out.println(s1.endsWith("Website"));

    }
    @Test
    public void equalsTest(){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "JaVa";
        String s4 = "Javascript";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.equalsIgnoreCase(s3));
    }

    @Test
    public void subString(){
        String s1 = "Well come to Daisy to our website";

        String s2 =s1.substring(10,10+2);

        String s3 =s1.substring(10,10+ "Daisy".length());

        String s4 = s1.substring(10);

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
    @Test
    public void trimTest(){
        String s1 = "    Well come to Daisy to our website    ";
        String s2 =s1.trim();

        System.out.println(s2);

        System.out.println(s1.trim());

        System.out.println(s1.trim().toUpperCase());
        System.out.println(s1.trim().toLowerCase());

    }





}
