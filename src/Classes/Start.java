package Classes;

public class Start {

    public static void main(String[] args) throws Exception {
        start();
    }

    public static void start() throws Exception {
        Input input = new Input();
        input.input();
        String expression = Input.getExpression();
        InputCheck.stringToElements(expression);

    }
}
