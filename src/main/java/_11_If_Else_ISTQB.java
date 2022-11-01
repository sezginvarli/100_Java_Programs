import java.util.Scanner;

public class _11_If_Else_ISTQB {
    public static void main(String[] args) {


        int examScore, minPassScore;

        minPassScore = 26;
        System.out.println("Enter your score");

        Scanner input = new Scanner(System.in);

        examScore = input.nextInt();

        if (examScore >= minPassScore) {
            System.out.println("Congratulations, You have an ISTQB Certificate");

        } else {
            System.out.println("Sorry, You should study a lot!");
        }
    }
}