import java.util.Scanner;лл

public class UserMenu {

    public void menuOperations() {
        System.out.println(TextConstants.GREETINGS);
        System.out.println(TextConstants.CHOOSE_OPERATION);
        System.out.println(TextConstants.OPERATION_LIST);
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();
        switch (menuItem) {
            case 1:
                System.out.println(TextConstants.INDICATE_PATH_TO_READ);
                String tempIn = scanner.nextLine();
                System.out.println(TextConstants.INDICATE_PATH_TO_WRITE);
                String tempOut = scanner.nextLine();
                System.out.println(TextConstants.KEY_MESSAGE);
                int tempKey = scanner.nextInt();
                scanner.nextLine();
                FileManager fileManager = new FileManager();
                Cipher cipher = new Cipher();
                cipher.cipherProcess(fileManager.inputOriginalText(tempIn),tempKey,Alphabet.ALPHABET );
                fileManager.outputEncryptText((tempOut),cipher.cipherText);
                menuOperations();
                break;
            case 2:
                System.out.println(TextConstants.INDICATE_PATH_TO_READ);
                tempIn = scanner.nextLine();
                System.out.println(TextConstants.INDICATE_PATH_TO_WRITE);
                tempOut = scanner.nextLine();
                System.out.println(TextConstants.KEY_MESSAGE);
                tempKey = scanner.nextInt();
                scanner.nextLine();
                fileManager = new FileManager();
                cipher = new Cipher();
                cipher.cipherProcess(fileManager.inputOriginalText(tempIn),-tempKey,Alphabet.ALPHABET );
                fileManager.outputEncryptText((tempOut),cipher.cipherText);
                menuOperations();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
