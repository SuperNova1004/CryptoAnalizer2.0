package Decode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static Encode.Encode.encode;


public class Decode {
        public static void decode(String inputFile, String outputFile, int key) {
            encode(inputFile, outputFile, 26 - key); // потому что в англ. алфавите 26 букв, а в русском 33
        }
}

