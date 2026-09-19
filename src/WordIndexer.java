import java.util.HashMap;
import java.util.Scanner;

public class WordIndexer {
    private final String fileContains;
    private final HashMap<String, Integer> wordFrequency = new HashMap<String, Integer>();
    private static final String regex = "\\P{L}+";

    public WordIndexer(String fileContains) {
        this.fileContains = fileContains;
    }

    public HashMap<String, Integer> getWordFrequency() {
        return wordFrequency;
    }

    public void index() {
        try (Scanner scanner = new Scanner(fileContains).useDelimiter(regex)) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                this.wordFrequency.merge(word, 1, Integer::sum);
            }
        }
    }
}
