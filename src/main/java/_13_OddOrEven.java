import java.util.Scanner;

public class _13_OddOrEven {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check if it is oss or even");
        Scanner input= new Scanner(System.in);
        x=input.nextInt();

        if(x%2==0){
            System.out.println(x+ " is an Even number");
        }else
            System.out.println(x+ " is an Odd number");

    }
}
