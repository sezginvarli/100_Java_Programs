import java.util.Scanner;

public class _19_WhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner input= new Scanner(System.in);
        System.out.println("Input an Integer");

        while((n=input.nextInt()) !=0) {
            System.out.println("You entered "+n);
            System.out.println("Input an Integer");
        }
        System.out.println("Out of loop");
    }
}
