package StartingProgramm;

import java.util.Scanner;

import static Decode.Decode.decode;
import static Decode.DecodeRus.decodeRus;
import static Encode.Encode.encode;
import static Encode.EncodeRus.encodeRus;

public class CryptoAnalizer {

    public static void starting() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 2) {
            encode("input.txt", "encrypted.txt", 3); // Кодируем input.txt с ключом 3
            decode("encrypted.txt", "decrypted.txt", 3);// Декодированный encrypted.txt c ключом 3
        } else {
            encodeRus("input.txt", "encryptedRus.txt", 3); // Аналогично для русского языка
            decodeRus("encryptedRus.txt", "decryptedRus.txt", 3);
        }
    }
}
