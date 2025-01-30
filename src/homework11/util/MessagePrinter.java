package homework11.util;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

/**
 * This class is responsible for printing messages to console with/without given parameters.
 */
public class MessagePrinter {
    public void printTopWords(Map<String, Long> words) {
        System.out.println("Here's the most frequent words in this book:" + '\n');
        words.entrySet().forEach(System.out::println);
    }

    public void printUniqueWordsCount(Integer uniqueWordsCounter) {
        System.out.println('\n' + "This book has " + uniqueWordsCounter + " unique words." + '\n');
    }

    public void printSaveStatistics(Path outputPath, String usersBookName) {
        System.out.println("Saving the statistics to " + outputPath.toString() +
                File.separator + usersBookName + "_statistic.txt");
    }

    public void printToConsole(String message) {
        System.out.println(message);
    }

    public void printErrorToConsole(String message) {
        System.err.println(message);
    }
}
