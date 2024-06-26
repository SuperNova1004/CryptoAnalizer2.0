



public class ConsoleRunner extends CryptoAnalizer {

    public static void main(String[] args) {

        console();
        encode("input.txt", "encrypted.txt", 3); // Кодируем input.txt с ключом 3
        decode("encrypted.txt", "decrypted.txt", 3); // Декодированный encrypted.txt c ключом 3
    }
}
