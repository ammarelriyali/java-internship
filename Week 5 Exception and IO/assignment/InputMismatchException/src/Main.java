import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                sumTwoNumber();
                break;
            } catch (InputMismatchException e) {
                System.out.println("wrong input pleas enter only numbers");
            }
        }
    }

    private static void sumTwoNumber() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("sum = " + (firstNumber + secondNumber));
        scanner.close();
    }
}