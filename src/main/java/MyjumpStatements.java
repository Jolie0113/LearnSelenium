public class MyjumpStatements {
    public static void main(String[] args) {
        // break statement
        for(int i =0; i<=10;i++){
            System.out.println(i);
        }
        System.out.println("----------------------------");

        for(int i =0; i<=10; i++){
            if (i ==5){
                break; // chi exit ra khoi vòng lap for ngay lap tuc
            }
            System.out.println(i);
        }

        System.out.println("final!");

        // continue statemnet
        System.out.println("----------------------------");

        for(int i =0; i<=10; i++){
            if (i ==5){
                continue; // khong thuc hien các cau ệnh dưới mà tăng i tiếp tục chạy vòng lặp for
            }
            System.out.println(i);
        }
    }
}
