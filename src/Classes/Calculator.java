package Classes;

public class Calculator {

    static int result;
    static double divideResult;

    public void add(int x, int y) {
        result = x + y;
        if (InputCheck.isArab) {
            ArabOutput.printArabResult(result);
        } else {
            RomanOutput.printRomanResult(ResultToRoman.resultToRoman(result));
        }
    }

    public void subtract(int x, int y) {
        result = x - y;
        if (InputCheck.isArab) {
            ArabOutput.printArabResult(result);
        } else {
            RomanOutput.printRomanResult(ResultToRoman.resultToRoman(result));
        }
    }

    public void multiply(int x, int y) {
        result = x * y;
        if (InputCheck.isArab) {
            ArabOutput.printArabResult(result);
        } else {
            RomanOutput.printRomanResult(ResultToRoman.resultToRoman(result));
        }
    }

    public void divide(int x, int y) {
        if (InputCheck.isArab) {
            divideResult = (double) x / y;
            ArabOutput.printArabResult(divideResult);
        } else {
            result = x / y;
            RomanOutput.printRomanResult(ResultToRoman.resultToRoman(result));
        }
    }
}
