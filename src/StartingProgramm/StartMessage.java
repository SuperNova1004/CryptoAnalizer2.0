package StartingProgramm;

import static StartingProgramm.CryptoAnalizer.starting;

public class StartMessage {

    public static void console() {

        System.out.println(" ");


        System.out.println("Чтобы работать с Криптоанализатором: ");
        System.out.println(" ");
        System.out.println(" 1. Введите сообщение, которое хотите зашифровать, в файл input.txt");
        System.out.println(" 2. Просто нажмите сочетание клавиш Shift + F10 или значок запуска программы в верхней части страницы");
        System.out.println(" 3. В файлах encrypted.txt или будет ваше зашифрованное сообщение ");
        System.out.println(" 4. В файле decrypted.txt или будет ваше расшифрованное сообщение ");
        System.out.println(" 5. Работайте, наслаждайтесь, Криптоанализатор поддерживает русский и английский");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Выберите язык, в котором зашифровано сообщение: ");
        System.out.println("Введите цифру \"1\" для выбора русского языка, цифру \"2\" для английского");

        starting();
    }
}
