import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (args.length < 2) {

            System.out.println("Invalid input. Please provide a command and input numbers.");
            return;
        }

        String command = args[0];
        int[] numbers = Arrays.stream(args).skip(1).mapToInt(Integer::parseInt).toArray();

        while (true) {
            switch (command) {
            case "add":
                System.out.println(calculator.add(numbers[0], numbers[1]));
                break;
            case "subtract":
                System.out.println(calculator.subtract(numbers[0], numbers[1]));
                break;
            case "multiply":
                System.out.println( calculator.multiply(numbers[0], numbers[1]));
                break;
            case "divide":
                System.out.println( calculator.divide(numbers[0], numbers[1]));
                break;
            case "fibonacciNumberFinder":
                System.out.println( calculator.fibonacciNumberFinder(numbers[0]));
                break;
            case "intToBinaryNumber":
                System.out.println(calculator.intToBinaryNumber(numbers[0]));
                break;
            default:
                System.out.println("Invalid command.");
                return;
        }

    }
}