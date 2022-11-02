import java.util.Scanner;

public class _12_Nested_If_Else {
    public static void main(String[] args) {
        int alınanNot, geçmeNotu;
        char derece;

        geçmeNotu=40;
        System.out.println("Sınav notunuzu giriniz");
        Scanner input= new Scanner(System.in);

        alınanNot=input.nextInt();

        if (alınanNot>=geçmeNotu){
            if (alınanNot>90)
                derece='A';
            else if (alınanNot>75)
                derece='B';
            else if(alınanNot>60)
                derece='C';
            else
                derece='D';
            System.out.println("Sınavı " + derece + " ile geçtiniz");

        }
        else {
            derece='F';
            System.out.println("Sınavda "+ derece +" ile kaldınız");

        }
    }
}
