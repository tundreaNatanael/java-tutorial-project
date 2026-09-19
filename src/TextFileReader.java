import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileReader {

    private final Path path;

    public TextFileReader(String path) {
        this.path = Path.of(path);
    }

    public String read() throws IOException {
        return Files.readString(path);
    }
}