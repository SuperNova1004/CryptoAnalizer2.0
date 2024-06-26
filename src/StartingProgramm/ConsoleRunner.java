package StartingProgramm;

import static Decode.Decode.decode;
import static Decode.DecodeRus.decodeRus;
import static Encode.Encode.encode;
import static Encode.EncodeRus.encodeRus;

public class ConsoleRunner extends CryptoAnalizer {

    public static void main(String[] args) {

        console();
        encode("input.txt", "encrypted.txt", 3); // Кодируем input.txt с ключом 3
        decode("encrypted.txt", "decrypted.txt", 3);// Декодированный encrypted.txt c ключом 3
        encodeRus("input.txt", "encryptedRus.txt", 3); // Аналогично для русского языка
        decodeRus("encryptedRus.txt", "decryptedRus.txt", 3);
    }
}
