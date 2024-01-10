public class Viginere{
    public static String encrypt(String plaintext, String keyword) {
        StringBuilder ciphertext = new StringBuilder();
        int keywordLength = keyword.length();

        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);
            char keywordChar = keyword.charAt(i % keywordLength);

            if (Character.isLetter(plainChar)) {
                char base = Character.isUpperCase(plainChar) ? 'A' : 'a';
                int encryptedChar = (plainChar + keywordChar - 2 * base) % 26 + base;
                ciphertext.append((char) (encryptedChar < base ? encryptedChar + 26 : encryptedChar));
            } else {
                ciphertext.append(plainChar);
            }
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, String keyword) {
        StringBuilder plaintext = new StringBuilder();
        int keywordLength = keyword.length();

        for (int i = 0; i < ciphertext.length(); i++) {
            char cipherChar = ciphertext.charAt(i);
            char keywordChar = keyword.charAt(i % keywordLength);

            if (Character.isLetter(cipherChar)) {
                char base = Character.isUpperCase(cipherChar) ? 'A' : 'a';
                int decryptedChar = (cipherChar - keywordChar + 26) % 26 + base;
                plaintext.append((char) (decryptedChar < base ? decryptedChar + 26 : decryptedChar));
            } else {
                plaintext.append(cipherChar);
            }
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        String plaintext = "HelloWorld";
        String keyword = "Key";

        String encryptedText = encrypt(plaintext, keyword);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = decrypt(encryptedText, keyword);
        System.out.println("Decrypted: " + decryptedText);
    }
}