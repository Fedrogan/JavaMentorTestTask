package Classes;


import java.util.Scanner;

public class Input {

    private static String expression = "";

    public void input() {
        System.out.println("Введите выражение:");
        Scanner scanner = new Scanner(System.in);
        expression = scanner.nextLine();
    }

    public static String getExpression() {
        return expression;
    }
}
