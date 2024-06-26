package Decode;

import static Encode.EncodeRus.encodeRus;

public class DecodeRus {
    public static void decodeRus(String inputFile, String outputFile, int key) {
        encodeRus(inputFile, outputFile, 33 - key); // Аналогично для русского языка
    }
}
