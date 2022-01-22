import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <(i+1) ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2*number)-(2*i+1); j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
