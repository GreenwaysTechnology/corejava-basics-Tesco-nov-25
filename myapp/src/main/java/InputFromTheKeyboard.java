import java.util.Scanner;

public class InputFromTheKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pin");
        int pin = sc.nextInt();
        System.out.println("Your Pin :" + pin);
        if (pin == 1234) {
            System.out.println("Access Granted!");
            return;
        }
        System.out.println("Card Blocked");
    }
}
