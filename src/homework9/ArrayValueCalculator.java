package homework9;

import homework9.exceptions.ArrayDataException;
import homework9.exceptions.ArraySizeException;

import java.util.Objects;


public class ArrayValueCalculator {
    public static int doCalc(String[][] numbers) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        try {
            if (numbers.length != 4 || numbers[0].length != 4)
                throw new ArraySizeException("Array's size isn't 4x4");
            for (int i = 0; i < numbers.length; i++) {
                Objects.requireNonNull(numbers[i], "array has null at index " + "[" + i + "]");
                for (int j = 0; j < numbers[i].length; j++) {
                    try {
                        Objects.requireNonNull(numbers[i][j], "array has null at index " + "[" + i + "][" + j + "]");
                        sum += Integer.parseInt(numbers[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Not an integer at index " + "[" + i + "][" + j + "]", e);
                    }
                }
            }
        } catch (NullPointerException e) {
            throw new ArrayDataException(String.valueOf(e.getMessage()), e);
        }
        return sum;
    }
}



