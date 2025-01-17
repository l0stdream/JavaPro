package homework10;

public class Task3 {

    public static int[] indexFinder(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNumber + numbers[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
