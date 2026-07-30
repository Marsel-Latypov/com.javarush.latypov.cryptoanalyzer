public class Cipher {

    public String cipherProcess(String originalText, int key, char[] ALPHABET) {
        StringBuilder cipherProcessOriginalText = new StringBuilder();
        for (int i = 0; i < originalText.length(); i++) {
            char currentChar = originalText.charAt(i);
                char cipherProcessChar = ALPHABET[((new String(ALPHABET).indexOf(currentChar) + key) % ALPHABET.length)];
                cipherProcessOriginalText.append(cipherProcessChar);
            }
        return cipherProcessOriginalText.toString();
    }
}