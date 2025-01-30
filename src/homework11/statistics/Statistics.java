package homework11.statistics;

import homework11.enums.CalledMethods;
import homework11.util.TextSaver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is responsible for showing statistics in the console for given text.
 * Such as: unique words counter, top word by frequency. This class can also save it in a storage file.
 */
public class Statistics {
    private LinkedList<CalledMethods> calledMethods = new LinkedList<>();
    private int frequency;
    private Map<String, Long> topTextWords;
    private int uniqueTextWords;
    private int totalWords;

    public Statistics() {
    }


    public Map<String, Long> showTopWords(Map<String, Long> words, Integer wordFrequencyTop) {
        calledMethods.add(CalledMethods.GET_TOP_WORDS);

        this.totalWords = Math.toIntExact(words.values().stream()
                .mapToLong(l -> l).sum());

        this.frequency = wordFrequencyTop;

        return this.topTextWords = words.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(wordFrequencyTop)
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new));
    }

    public Integer showUniqueWordsCount(Map<String, Long> words) {
        calledMethods.add(CalledMethods.SHOW_UNIQUE_WORD_COUNT);

        if (totalWords == 0) {
            this.totalWords = Math.toIntExact(words.values().stream()
                    .mapToLong(l -> l).sum());
        }
        return this.uniqueTextWords = words.size();
    }

    public void save(Path outputPath, String usersBookName) throws IOException {
        ArrayList<String> textToSave = new ArrayList<>();
        TextSaver textSaver = new TextSaver();
        Path pathToSave = Path.of(outputPath + File.separator + usersBookName + "_statistic.txt");

        if (calledMethods.contains(CalledMethods.GET_TOP_WORDS)) {
            textToSave.add("Here's top " + frequency + " frequency " + "words:" + '\n');

            textToSave.addAll(
                    topTextWords.entrySet().stream()
                            .map(entry -> entry.getKey() + " -> " + entry.getValue())
                            .toList());
        }

        if (calledMethods.contains(CalledMethods.SHOW_UNIQUE_WORD_COUNT)) {
            textToSave.add('\n' + "This book has " + uniqueTextWords + " unique words" + '\n');
        }

        textToSave.add("In total this book has " + totalWords + " words." + '\n');

        textSaver.save(textToSave, pathToSave);

        this.flushStatistics();
    }

    private void flushStatistics() {
        if (calledMethods != null)
            this.calledMethods.clear();
        if (topTextWords != null)
            this.topTextWords.clear();
        this.frequency = 0;
        this.uniqueTextWords = 0;
        this.totalWords = 0;
    }

}
