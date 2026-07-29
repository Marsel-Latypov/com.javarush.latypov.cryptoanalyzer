import java.util.Scanner;

public class UserMenu {

    public void menuOperations() {
        System.out.println(Constants.greetings);
        System.out.println(Constants.chooseOperation);
        System.out.println(Constants.operationList);
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        switch (menuItem) {
            case 0:
                break;
            case 1:
                System.out.println(Constants.indicatePathToRead);
                String pathInput = scanner.nextLine();
                String pathOutput = scanner.nextLine();
                FileManager startWriteOriginalText = new FileManager();
                startWriteOriginalText.inputOriginalText(pathInput);
                System.out.println(Constants.keyMessage);
                int key = scanner.nextInt();
                Encrypt startEncryptOriginalText = new Encrypt();
                startEncryptOriginalText.encrypt(key);
                Cipher cipher = new Cipher();
                cipher.cipherProcess(startWriteOriginalText.originalText, Encrypt.key, Alphabet.ALPHABET);
                startWriteOriginalText.outputEncryptText(cipher.cipherText, pathOutput);
                break;
            case 2:
                System.out.println(Constants.indicatePathToRead);
                pathInput = scanner.nextLine();
                pathOutput = scanner.nextLine();
                startWriteOriginalText = new FileManager();
                startWriteOriginalText.inputOriginalText(pathInput);
                System.out.println(Constants.keyMessage);
                key = scanner.nextInt();
                startEncryptOriginalText = new Encrypt();
                startEncryptOriginalText.encrypt(key);
                cipher = new Cipher();
                cipher.cipherProcess(startWriteOriginalText.originalText, Decrypt.key, Alphabet.ALPHABET);
                startWriteOriginalText.outputEncryptText(cipher.cipherText, pathOutput);
                break;
            case 3:
                break;
        }
    }
}