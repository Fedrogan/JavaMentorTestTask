package Classes;

import java.util.List;

public class ResultToRoman {

    public static String resultToRoman(int input) {
        if ((input <= 0) || (input > 4000)) {
            throw new IllegalArgumentException(input + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((input > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= input) {
                sb.append(currentSymbol.name());
                input -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
