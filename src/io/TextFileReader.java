package io;

import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileReader {

    private static final long MAX_SIZE = 50 * 1024 * 1024;

    private final Path path;

    public TextFileReader(String path) {
        this.path = Path.of(path);
    }

    public String read() throws IOException {
        if (!path.toString().endsWith(".txt")) {
            throw new IOException("Not a .txt file: " + path);
        }

        long size = Files.size(path);
        if (size > MAX_SIZE) {
            throw new IOException("File is bigger than " + MAX_SIZE +" bytes: " + size + " bytes");
        }

        try {
            return Files.readString(path); // UTF-8 by default
        } catch (MalformedInputException e) {
            throw new IOException("File is not valid UTF-8: " + path, e);
        }
    }
}
