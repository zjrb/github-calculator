import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the calulator");
        while (true) {
            System.out.print("Enter a command: ");
            String command = scanner.nextLine();

            if (command.isEmpty()) {
                break;
            }

            int[] numbers = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (numbers[0]) {
                case 1:
                    System.out.println(calculator.add(numbers[1], numbers[2]));
                    break;
                case 2:
                    System.out.println(calculator.subtract(numbers[1], numbers[2]));
                    break;
                case 3:
                    System.out.println(calculator.multiply(numbers[1], numbers[2]));
                    break;
                case 4:
                    System.out.println(calculator.divide(numbers[1], numbers[2]));
                    break;
                case 5:
                    System.out.println(calculator.fibonacciNumberFinder(numbers[1]));
                    break;
                case 6:
                    System.out.println(calculator.intToBinaryNumber(numbers[1]));
                    break;
                default:
                    break;
            }
        }
    }
}