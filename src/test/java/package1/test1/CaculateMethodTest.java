package package1.test1;

import org.testng.annotations.Test;
import package1.demo1.CaculateMethod;

public class CaculateMethodTest {
    @Test
    public void addMethodTest(){
        int n = CaculateMethod.add(2,3);
        System.out.println(n);

    }

}
