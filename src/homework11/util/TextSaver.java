package homework11.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * This class is responsible for writing given text in storage according transmitted path.
 */
public class TextSaver {

    public void save(List<String> textToSave, Path outputPath) throws IOException {
        Files.write(
                outputPath,
                textToSave
        );
    }
}
