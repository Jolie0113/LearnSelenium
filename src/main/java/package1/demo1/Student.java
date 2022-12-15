package package1.demo1;

public class Student {

    // Fields = Attributes = Properties
    public int id;;
    public String name;



    //Constructors
    public Student(){}
    public Student(int sId, String sName){
        id = sId;
        name= sName;
    }


    //Method
    public void setId(int sId){
        id= sId;
    }
    public void setName(String sName){
        name = sName; //5. Method Body
    }
/* Note */
    // 1. public/private: Access Specifier
    // 2. void/int/... : Return Type
    // 3. setName: method Name
    // 4. String sName : Parameter List : danh sach tham so

    //public Method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    //static Method
    public static void getmessage(){
        System.out.println("Hello world!. This is a Static Method");
    }


}
