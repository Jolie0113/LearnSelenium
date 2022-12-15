package package1.demo1;

public class Programer extends Employee{

    private  String mainProgramingLanguage;

    public Programer(){};

    public Programer(int id, String name){
        super(id, name);
    };

    public Programer(int id, String name, String dob){
        super(id, name, dob);
    };
    public Programer(int id, String name, String dob, String mainProgramingLanguage ){
        this(id, name, dob); // == super(id, name, dob)
        this.mainProgramingLanguage = mainProgramingLanguage;

    }
    public void printInfor(){ // Vi trung ten method nen khi bi goi se uu tien lop cha

        super.printInfor(); // them super.name Method de goi lai cac function cua lop cha

        System.out.println("Main Programing Language: " +this.mainProgramingLanguage);
    }




}
