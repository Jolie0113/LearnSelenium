package package1.test1;

import org.testng.annotations.Test;
import package1.demo1.Employee;

import java.util.*;

public class ArrayListTest<S> {
    @Test
    public void arryListTest(){
        ArrayList<String> Lista = new ArrayList<String>();
        Lista.add("Mango");
        Lista.add("Banana");
        Lista.add("Grapes");
        Lista.add("Apple");

        System.out.println(Lista);

    }
    @Test
    public void iteratorTest1(){
        ArrayList<String> Lista = new ArrayList<String>();
        Lista.add("Mango");
        Lista.add("Banana");
        Lista.add("Grapes");
        Lista.add("Apple");

        Iterator<String> itr = Lista.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    @Test
    public void iteratorTest2(){
        ArrayList<String> Lista = new ArrayList<String>();
        Lista.add("Mango");
        Lista.add("Banana");
        Lista.add("Grapes");
        Lista.add("Apple");

        Iterator<String> itr = Lista.iterator();


        for (int i =0; i< Lista.size(); i++){
            System.out.println(Lista.get(i));
        }

        System.out.println("-----------------------------");
        for(String fruits : Lista){
            System.out.println(fruits);
        }
    }
    @Test
    public void iteratorTest3(){
        ArrayList<String> Lista = new ArrayList<String>();
        Lista.add("Mango");
        Lista.add("Banana");
        Lista.add("Grapes");
        Lista.add("Apple");

        Iterator<String> itr = Lista.iterator();

        for (int i =0; i<Lista.size();i++){
            System.out.println(String.format("Index %s: %s", i, Lista.get(i)));
        }

        Lista.set(2, "Kiwi");
        for (int i =0; i<Lista.size();i++){
            System.out.println(String.format("Index %s: %s", i, Lista.get(i)));
        }
    }
    @Test
    public void sortingTest(){
//        int[] a = {3,5,67,84,4,23,2,5};

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(34);
        integerArrayList.add(32);
        integerArrayList.add(2);
        integerArrayList.add(34654);
        integerArrayList.add(345);

        Collections.sort(integerArrayList);

        for (Integer num : integerArrayList){
            System.out.println(num);
        }
    }
    @Test
    public void userDefineObjectTest(){
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee(1,"Join","03/01/1999");
        Employee employee2 = new Employee(2,"Harry","03/01/1997");
        Employee employee3 = new Employee(3,"Marry","03/01/1998");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee employee : employees){
            System.out.println(employee.toString());
        }

    }




}
