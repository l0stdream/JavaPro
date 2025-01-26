package homework11.util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


/**
 * This class is responsible for reading given file in storage, convert it into collection
 * and return it as a List of Strings.
 */


public class TextReader {

    public List<String> readText(Path filePath) throws IOException {
        return Files.readAllLines(filePath);
    }

}
