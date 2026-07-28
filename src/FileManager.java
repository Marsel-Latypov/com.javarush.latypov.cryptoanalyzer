import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    public String inputOriginalText(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedOriginalText = Files.newBufferedReader(Path.of(path));
        String originalText = "";
        while (bufferedOriginalText.ready()) {
            bufferedOriginalText.readLine();
        }
        stringBuilder.append(originalText);
        return originalText;
    }

    public void outputEncryptText(String encryptText){

    }
}