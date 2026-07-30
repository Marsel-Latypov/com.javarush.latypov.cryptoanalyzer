import java.util.Scanner;

public class UserMenu {

    public void menuOperations() {
        System.out.println(TextConstants.GREETINGS);
        while (true) {
        System.out.println(TextConstants.CHOOSE_OPERATION);
        System.out.println(TextConstants.OPERATION_LIST);
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();

            switch (menuItem) {
                case 1:
                    System.out.println(TextConstants.INDICATE_PATH_TO_READ);
                    String pathToWriteIn = scanner.nextLine();
                    System.out.println(TextConstants.INDICATE_PATH_TO_WRITE);
                    String pathToOutput = scanner.nextLine();
                    System.out.println(TextConstants.KEY_MESSAGE);
                    int tempKey = scanner.nextInt();
                    scanner.nextLine();
                    FileManager fileManager = new FileManager();
                    Cipher cipher = new Cipher();
                    String cipherProcessOriginalText = cipher.cipherProcess(fileManager.inputOriginalText(pathToWriteIn), tempKey, Alphabet.ALPHABET);
                    fileManager.outputEncryptText((pathToOutput), cipherProcessOriginalText);
                    break;

                case 2:
                    System.out.println(TextConstants.INDICATE_PATH_TO_READ);
                    pathToWriteIn = scanner.nextLine();
                    System.out.println(TextConstants.INDICATE_PATH_TO_WRITE);
                    pathToOutput = scanner.nextLine();
                    System.out.println(TextConstants.KEY_MESSAGE);
                    tempKey = scanner.nextInt();
                    scanner.nextLine();
                    fileManager = new FileManager();
                    cipher = new Cipher();
                    cipherProcessOriginalText = cipher.cipherProcess(fileManager.inputOriginalText(pathToWriteIn), Alphabet.ALPHABET.length - tempKey, Alphabet.ALPHABET);
                    fileManager.outputEncryptText((pathToOutput), cipherProcessOriginalText);
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
