package package1.test1;

import org.testng.annotations.Test;
import package1.demo1.Programer;

public class ProgramerTest {
    @Test
    public void initProgramerTest(){
        Programer programer = new Programer();
        programer.printInfor();

        Programer programer1 = new Programer(1, "ProName1");
        programer1.printInfor();

        Programer programer2 = new Programer(2, "ProName2","16/01/1999");
        programer2.printInfor();

        Programer programer3 = new Programer(2, "ProName2","16/01/1999","English");
        programer3.printInfor();

    }
}
