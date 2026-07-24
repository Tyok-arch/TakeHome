package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class JsonUtils {

    private JsonUtils() {
        // Prevent instantiation
    }

    public static String readJson(String filePath) {

        try {

            return Files.readString(Path.of(filePath));

        } catch (IOException e) {

            throw new RuntimeException(
                    "Failed to read JSON file: " + filePath,
                    e
            );

        }

    }

}