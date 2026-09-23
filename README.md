# java-tutorial-project

Counts how many times each word appears in a text file.

## Compile

```bash
javac -d out/classes src/Main.java src/indexer/WordIndexer.java src/io/TextFileReader.java
```

## Run

```bash
java -cp out/classes Main resources/alice_in_wonderland.txt
```

Replace the path with any text file you want to analyze.

## Output

Prints a word-frequency map, e.g.:

```
{the=123, and=45, alice=30, ...}
```

## Notes

- If you run it with no file path, it prints `No path provided.` and exits.
