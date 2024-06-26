import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CryptoAnalizer extends StartMessage {

    public static void encode(String inputFile, String outputFile, int key) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder encryptedLine = new StringBuilder();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        char base = Character.isLowerCase(c) ? 'a' : 'A';
                        encryptedLine.append((char) ((((c - base) + key) % 26) + base));
                    } else {
                        encryptedLine.append(c);
                    }
                }
                writer.write(encryptedLine.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decode(String inputFile, String outputFile, int key) {
        encode(inputFile, outputFile, 26 - key); // потому что в англ. алфавите 26 букв, а в русском 33
    }
}