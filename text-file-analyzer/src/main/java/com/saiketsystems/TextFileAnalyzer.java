package com.saiketsystems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileAnalyzer {
    public static void analyzeFile(String fileName, String searchWord) {
        int wordCount = 0, lineCount = 0, charCount = 0;
        boolean wordFound = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        wordFound = true;
                    }
                }
            }
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Word '" + searchWord + "' found: " + (wordFound ? "Yes" : "No"));

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.out.println("Error: There was an issue reading the file.");
        }
    }
}
