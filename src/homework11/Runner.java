package homework11;

import homework11.enums.Messages;
import homework11.statistics.Statistics;
import homework11.util.MessagePrinter;
import homework11.util.TextReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * This is console app for reading text file, analyzing it, show statistic and then writes it to new file.
 * At the first we get all text from the book.
 * <p>
 * Then we handle that text and get by each word with removing all non alphabet symbols + get each word frequency
 * in the text.
 * <p>
 * <p>
 * Next we show all the statistics that we need by the text by using collection from textHandler and save it in new file.
 */
public class Runner {
    private static final Path LIBRARY_PATH = Path.of("src", "resources", "books", "library");
    private static final Path OUTPUT_PATH = Path.of("src", "resources", "books", "output");

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        TextReader textReader = new TextReader();
        TextHandler textHandler = new TextHandler();
        Statistics statistics = new Statistics();
        MessagePrinter messagePrinter = new MessagePrinter();
        StatisticService statisticService = new StatisticService(statistics, messagePrinter);
        boolean exit = true;

        while (exit) {
            messagePrinter.printToConsole(Messages.ENTER_BOOK_NAME.getMessage());
            String usersBookName = scanner.next();
            Path bookPath = LIBRARY_PATH.resolve(usersBookName + ".txt");
            if (Files.exists(bookPath)) {
                try {
                    var bookText = textReader.readText(bookPath);
                    var bookTextByWords = textHandler.splitByWords(bookText);
                    int wordFrequencyTop = 10;

                    statisticService.showTopWords(bookTextByWords, wordFrequencyTop)
                             .showUniqueWordsCount(bookTextByWords)
                             .save(OUTPUT_PATH, usersBookName);

                    exit = false;
                } catch (IOException e) {
                   messagePrinter.printErrorToConsole(Messages.ERROR.getMessage());
                    exit = false;
                }
            } else {
               messagePrinter.printErrorToConsole(Messages.NOT_FOUND.getMessage());
            }
        }
        scanner.close();
    }
}
