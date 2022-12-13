public class MyFirstJavaProgram {

    //static variable- sd dc bat ky method nao
    static int m =5;
    //instance variable
    int k=10;


    void method(){
        //local variable
        int n =5;
        System.out.println(m);
    }
    public static int plus(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        //instance variable
        int data = 10;
        int myBirthday = 2000;
        String myName = "ITMS";
        String myInfor = myName + myBirthday;

        System.out.println("Welcome to Van!");
        System.out.println(data);
        System.out.println(myBirthday);
        System.out.println(myInfor);
        System.out.println(m);



    }
}
