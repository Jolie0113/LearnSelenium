package package1.test1;

import org.testng.annotations.Test;
import package1.demo1.Adrress;
import package1.demo1.Employee;

public class EmployeeTest1 {
    @Test
    public void accesserMethodTest(){
        Employee employee = new Employee(1,"TOm");
        int n = employee.getId();

        System.out.println(n);
        System.out.println(employee.getId());
    }
    @Test
    public void mutatorMethod(){
        Employee employee = new Employee(1,"TOm");
        System.out.println("old ID: " + employee.getId());

        employee.setId(2);
        System.out.println("newID: " + employee.getId());

    }
    @Test
    public void defaulConstrutorTest(){
        Employee employee = new Employee();
        System.out.println("ID: " + employee.getId());
        System.out.println("ID: " + employee.getName());
        System.out.println("ID: " + employee.getDob());
    }
    @Test
    public void parameterizedContructortest(){
        Employee employee = new Employee(1,"Marry");
        System.out.println("ID: " + employee.getId());
        System.out.println("ID: " + employee.getName());
        System.out.println("ID: " + employee.getDob());

        Employee employee2 = new Employee(2,"Marry","15/01/1999");
        System.out.println("ID: " + employee2.getId());
        System.out.println("ID: " + employee2.getName());
        System.out.println("ID: " + employee2.getDob());

        System.out.println("----------------");
        employee2.printInfor();
    }
    @Test
    public void staticVariableTest(){
        System.out.println("Ten Cong ty vi la chung/ co ding: " + Employee.company);
        System.out.println(Employee.countEmployee);

        System.out.println("-------------------------");

        Employee employee1= new Employee();
        System.out.println(Employee.countEmployee);
        Employee employee2 = new Employee(1,"Marry");
        System.out.println(Employee.countEmployee);
        Employee employee3 = new Employee(2,"Marry","15/01/1999");
        System.out.println(Employee.countEmployee);


    }
    @Test
    public void agrreationAttributeTest(){
        Adrress adrress = new Adrress("1aA","Trung Kinh", "Yen Hoa","CauGiay","HaNoi","VietNam");
        Employee employee= new Employee(1,"Join", "01/01/1999", adrress);

        System.out.println(employee.toString());


    }


}
