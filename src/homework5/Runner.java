package homework5;

import java.util.*;

public class Runner {

    public static int countOccurance(List<String> words, String targetWord) {
        return Collections.frequency(words, targetWord);
    }

    public static <T> List<T> toList(T[] words) {
        return Arrays.asList(words);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer currentNumber : numbers)
            if (!result.contains(currentNumber))
                result.add(currentNumber);
        return result;
    }

    public static void calcOccurance(List<String> words) {
        List<String> uniqueWords = new LinkedList<>();
        for (String currentWord : words)
            if (!uniqueWords.contains(currentWord)) {
                uniqueWords.add(currentWord);
                System.out.println(currentWord + " : " + Collections.frequency(words, currentWord));
            }
    }

    public static LinkedList<OccurrenceWords> findOccurance(List<String> words) {
        LinkedList<OccurrenceWords> wordsFrequence = new LinkedList<>();
        for (String currentWord : words) {
            if (!wordsFrequence.contains(currentWord)) {
                wordsFrequence.add(new OccurrenceWords(currentWord, Collections.frequency(words, currentWord)));
            }
        }
        return wordsFrequence;
    }


}


