import java.io.*;

public class FileManager {

    public String originalText;

    public String inputOriginalText(String pathInput) {

        StringBuilder inputOriginalTextStringBuilder = null;
        BufferedReader inputOriginalTextReader = null;

        try {
            inputOriginalTextReader = new BufferedReader(new FileReader(pathInput));
            inputOriginalTextStringBuilder = new StringBuilder();
            String line;
            while ((line = inputOriginalTextReader.readLine()) != null) {
                inputOriginalTextStringBuilder.append(line.toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                inputOriginalTextReader.close();
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        return  originalText = inputOriginalTextStringBuilder.toString();
    }


    public void outputEncryptText(String pathOutput, String cipherText) {
        FileWriter writerForOutput = null;
        try {
            writerForOutput = new FileWriter(pathOutput);
            writerForOutput.write(cipherText);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                writerForOutput.close();
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}