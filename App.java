import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        askQuestion();
    }
    public static void askQuestion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first number");
        int a = scanner.nextInt();
        System.out.println("what would your second numebr");
        int b = scanner.nextInt();
        System.out.println("What would you like to do(+, -, *, /)");
        double answer = 0;
        switch (scanner.nextLine()) {
            case "+":
                answer = add(a, b);
                break;
            case "-":
                answer = subtract(a, b);
                break;
            case "*":
                answer = multiply(a, b);
                break;
            default:
                answer = divide(a, b);
                break;
        }

        System.out.println("Answer is " + answer);


    }
    public static double add(double a, double b){
        return a + b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
}