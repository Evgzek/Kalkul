import java.util.Scanner;
public class Calcul {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operator;
        Scanner people = new Scanner(System.in);
        System.out.print("Введите два числа:");
        num1 = people.nextDouble();
        num2 = people.nextDouble();
        System.out.print("Введите оператор:+, -, *, /");
        operator = people.next().charAt(0);
        switch (operator){
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
        }


    }
}
