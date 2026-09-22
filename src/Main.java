import indexer.WordIndexer;
import io.TextFileReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("No path provided.");
            return;
        }

        TextFileReader fileReader = new TextFileReader(args[0]);
        WordIndexer indexer = new WordIndexer(fileReader.read());
        indexer.index();
        System.out.println(indexer.getWordFrequency());

    }
}
