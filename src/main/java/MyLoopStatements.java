public class MyLoopStatements {
    public static void main(String[] args) {

        //for loop
        for(int i =0; i <= 10 ; i = i+2){
            System.out.println(i);
        }
        // for each loop
        String[] names = {"Tom","Jerry", "Thomas","Merry", "Edison", "Anstan"};
        for (int i = 0; i <names.length; i++){
            System.out.println(names[i]);
        }

        // for each loop
        for (String name: names){
            System.out.println(name);
        }

        //while
        int num =10;
        while (num >= 0) { // neu dieu kien trong while con la True thi cau lenh van dc thuc hien tiep
            System.out.println(num);
            num = num -1;
        }
        // so sanh vs if chi thuc hien 1 lan
        if (num>=0){
            System.out.println(num);
        }
        System.out.println("-----------------------------------------------------------");
        //do-while
        num =- 10;
        do {
            System.out.println(num);
            num -=1;
        }while (num >= 0);



    }
}
