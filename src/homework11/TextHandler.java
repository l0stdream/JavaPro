package homework11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class is responsible for handle given text - remove all non-alphabetic symbols,
 * split by each word and leave only unique words containing more than 2 letters
 * then returns collection with words and their frequency in text.
 */


public class TextHandler {

    public Map<String, Long> splitByWords(List<String> words) {
        String symbols = "[^A-Za-z\\s]+";
        return words.stream()
                .flatMap(s -> Arrays.stream(s.toLowerCase().replaceAll(symbols, "").split("\\s")))
                .filter(s -> s.length() > 2)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }
}
