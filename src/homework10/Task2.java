package homework10;

import java.util.*;


public class Task2 {

    public static boolean isDistinct(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : numbers) {
            if (result.contains(num))
                return true;
            result.add(num);
        }
        return result.size() != numbers.length;
    }

}
