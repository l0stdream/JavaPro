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
        return new ArrayList<>(new HashSet<Integer>(numbers));
    }

    public static void calcOccurance(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String currentWord : uniqueWords) {
            System.out.println(currentWord + " : " + Collections.frequency(words, currentWord));
        }
    }

    public static LinkedList<String> findOccurance(List<String> words) {
        LinkedList<String> wordsFrequence = new LinkedList<>();
        for (String currentWord : words){
            if (!wordsFrequence.contains(currentWord)){
                wordsFrequence.add("name: " + currentWord + " , occurrence: "  + Collections.frequency(words, currentWord));
            }
        }
        return wordsFrequence;
    }

    public static HashMap<String, Integer> findOccuranceWithMap(List<String> words) {
        HashMap<String, Integer> wordsFrequence = new HashMap<>();

        for (String currentWord : words){
            wordsFrequence.put(currentWord, Collections.frequency(words,currentWord));
            }
        return wordsFrequence;
    }


    public static LinkedList<Map<String, Integer>> findOccuranceWithMapsInList(List<String> words) {
        HashMap<String, Integer> wordsAndOccurance = new HashMap<>();
        LinkedList<Map<String, Integer>> result = new LinkedList<>();
        for (String currentWord : words) {
            wordsAndOccurance.put(currentWord, Collections.frequency(words, currentWord));
        }

        for (Map.Entry<String, Integer> entry : wordsAndOccurance.entrySet()) {
            Map<String, Integer> wordInfo = new HashMap<>();
            wordInfo.put(entry.getKey(), entry.getValue());
            result.add(wordInfo);
        }

        return result;
    }

}


