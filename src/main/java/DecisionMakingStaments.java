public class DecisionMakingStaments {
    public static void main(String[] args) {
        int age =20;

        if(age >= 13)
            if (age <= 19) System.out.println("you are the teenager!");
            else {
                System.out.println("you are not the adults!");
            }
        else{
            System.out.println("you are a child!");
        }
    }

}
