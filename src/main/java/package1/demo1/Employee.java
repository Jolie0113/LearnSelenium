package package1.demo1;

public class Employee {

    public static String company ="ITMSCoaching";
    public static int countEmployee = 0;


    private int id;
    private String name;
    private String dob;
    private Adrress adrress; // Aggregation : 1 cai Class co thuoc tinh la Class khac

    public Employee(){
        countEmployee ++;
    }
    public Employee(int id, String name){

        this.id = id;
        this.name = name;
        countEmployee ++;
    }
    public Employee(int id, String name, String dob){
        //cach1
        this(id, name); // luon set tai the first line
        // Constructor se dc goi thong qua keyword la this
        this.dob =dob;

        // cach 2
//        countEmployee ++;
//        this.id = id;
//        this.name = name;
//        this.dob= dob;

    }

    public Employee(int id, String name, String dob, Adrress adrress) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.adrress = adrress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public void setId(int id) {
        this.id = id; // this co the goi instance variable
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Adrress getAdrress() {
        return adrress;
    }

    public void setAdrress(Adrress adrress) {
        this.adrress = adrress;
    }

    public void printInfor(){
        System.out.println("ID: " + getId());
        System.out.println("ID: " + this.getName()); // this co the goi instance method
        System.out.println("ID: " + this.getDob());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", adrress=" + adrress +
                '}';
    }
}
