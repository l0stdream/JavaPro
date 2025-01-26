package homework11;

import homework11.statistics.Statistics;
import homework11.util.MessagePrinter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;


/**
 * This is just a service class over Statistics class which requests statistics over given data and show it to console.
 */
public class StatisticService {
    private final Statistics statistics ;
    MessagePrinter messagePrinter ;

    public StatisticService(Statistics statistics, MessagePrinter messagePrinter) {
        this.statistics = statistics;
        this.messagePrinter =messagePrinter;
    }

    public StatisticService showTopWords(Map<String, Long> bookWords, Integer wordFrequencyTop) {
        messagePrinter.printTopWords(statistics.showTopWords(bookWords, wordFrequencyTop));
        return this;
    }


    public StatisticService showUniqueWordsCount(Map<String, Long> words) {
        messagePrinter.printUniqueWordsCount(statistics.showUniqueWordsCount(words));
        return this;
    }

    public void save(Path outputPath, String usersBookName) throws IOException {
        messagePrinter.printSaveStatistics(outputPath, usersBookName);
        statistics.save(outputPath, usersBookName);
    }
}
