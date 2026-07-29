public class Cipher {
    String cipherText;

    public String cipherProcess(String originalText, int key, char[] ALPHABET) {
        StringBuilder cipherProcessOriginalText = new StringBuilder();
        for(int i = 0; i < originalText.length(); i++){
            char currentChar = originalText.charAt(i);
            if(Character.isLetter(currentChar)){
                char cipherProcessChar = ALPHABET[(new String(ALPHABET).indexOf(currentChar) + key) % ALPHABET.length];
                cipherProcessOriginalText.append(cipherProcessChar);
            } else {
                cipherProcessOriginalText.append(currentChar);
            }
        }
        return cipherText = cipherProcessOriginalText.toString();
    }
}