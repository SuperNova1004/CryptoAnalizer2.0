package Decode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static Encode.EncodeRus.encodeRus;

public class DecodeRus {
    public static void decodeRus(String inputFile, String outputFile, int key) {
        encodeRus(inputFile, outputFile, 32 - key); // Аналогично для русского языка
    }
}
