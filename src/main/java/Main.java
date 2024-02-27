import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        while (true) {
            System.out.print("Enter a command: ");
            String command = scanner.nextLine();

            if (command.isEmpty()) {
                break;
            }

            String[] parts = command.split(" ");
            String operation = parts[0];
            int[] numbers = Arrays.stream(parts, 1, parts.length)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            switch (operation) {
                case "add":
                    System.out.println(calculator.add(numbers[0], numbers[1]));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(numbers[0], numbers[1]));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(numbers[0], numbers[1]));
                    break;
                case "divide":
                    System.out.println(calculator.divide(numbers[0], numbers[1]));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(numbers[0]));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(numbers[0]));
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}