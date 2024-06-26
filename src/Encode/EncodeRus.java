package Encode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodeRus {
    public static void encodeRus(String inputFile, String outputFile, int key) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder encodeRusLine = new StringBuilder();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        char base = Character.isLowerCase(c) ? 'а' : 'А';
                        encodeRusLine.append((char) ((((c - base) + key) % 33) + base));
                    } else {
                        encodeRusLine.append(c);
                    }
                }
                writer.write(encodeRusLine.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
