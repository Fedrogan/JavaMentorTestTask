package Classes;

public class InputCheck {

    static boolean isArab;
    static String operator;
    static String temp = Input.getExpression();
    static String xTemp;
    static String yTemp;
    static int x;
    static int y;


    private static void inputCheck(String xTemp, String yTemp) {

        if (isArab) {
            x = Integer.parseInt(xTemp);
            y = Integer.parseInt(yTemp);
            if (x > 10 || x < 1 || y > 10 || y < 1) {
                throw new IllegalArgumentException("На вход принимаются числа от 1 до 10 включительно");
            }
            Calculator calc = new Calculator();
            switch (operator) {
                case "+" -> calc.add(x, y);
                case "-" -> calc.subtract(x, y);
                case "*" -> calc.multiply(x, y);
                case "/" -> calc.divide(x, y);
            }
        } else {
            x = RomanToArabConversion.romanToArab(xTemp);
            y = RomanToArabConversion.romanToArab(yTemp);
            Calculator calc = new Calculator();
            switch (operator) {
                case "+" -> calc.add(x, y);
                case "-" -> calc.subtract(x, y);
                case "*" -> calc.multiply(x, y);
                case "/" -> calc.divide(x, y);
            }
        }
    }

    public static void stringToElements(String input) throws Exception {
        try {
            if (input.contains("+")) {
                String[] args = temp.split("\\+", 2);
                xTemp = args[0];
                yTemp = args[1];
                operator = "+";
                isArab();
                inputCheck(xTemp, yTemp);
            } else if (input.contains("-")) {
                String[] args = temp.split("-", 2);
                xTemp = args[0];
                yTemp = args[1];
                operator = "-";
                isArab();
                inputCheck(xTemp, yTemp);
            } else if (input.contains("*")) {
                String[] args = temp.split("\\*", 2);
                xTemp = args[0];
                yTemp = args[1];
                operator = "*";
                isArab();
                inputCheck(xTemp, yTemp);
            } else if (input.contains("/")) {
                String[] args = temp.split("/", 2);
                xTemp = args[0];
                yTemp = args[1];
                operator = "/";
                isArab();
                inputCheck(xTemp, yTemp);
            } else {
                throw new Exception("Ошибка ввода");
            }
        } catch (Exception e) {
            System.exit(666);
        }
    }

    private static void isArab() {
        isArab = InputCheck.isNumeric(xTemp) && InputCheck.isNumeric(yTemp);
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        } return true;
    }
}
