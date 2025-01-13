package homework9;

import homework9.exceptions.ArrayDataException;
import homework9.exceptions.ArraySizeException;


public class Runner {
    public static void main(String[] args) {

        String[][] example = {{"1", "2", "3", "4"},
                {"3", "4", "s", "6"},
                {"3", "4", "5", "6"},
                {"3", "4", "5", "6"}
        };

        try {
            System.out.println(ArrayValueCalculator.doCalc(example));
        } catch (ArrayDataException | ArraySizeException e) {
            e.printStackTrace();
        }
    }
}
