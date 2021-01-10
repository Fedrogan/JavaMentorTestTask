package Classes;

public class Start {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Input input = new Input();
        input.input();
        String expression = Input.getExpression();
        InputCheck.stringToElements(expression);

    }
}
