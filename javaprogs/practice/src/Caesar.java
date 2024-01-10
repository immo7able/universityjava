import java.util.HashMap;
import java.util.Map;

public class Caesar {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                // Если русский алфавит, то буквы русские, если инглиш, то английские
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                // 26 для английского и 32 для русского
                ch = (char) ((ch - base + shift) % 26 + base);
            }

            result.append(ch);
        }

        return result.toString();
    }
    public static void decrypt(String text) {
        for(int j=1;j<26;j++){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    // Если русский алфавит, то буквы русские, если инглиш, то английские
                    char base = Character.isUpperCase(ch) ? 'A' : 'a';
                    // 26 для английского и 32 для русского
                    ch = (char) ((ch - base + j) % 26 + base);
                }
                result.append(ch);
            }
            System.out.println("Вариант "+j+" "+result.toString());
        }
    }
    public static String decryptFrequency(String ciphertext) {
        // Создаем словарь для подсчета частоты букв
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            frequencyMap.put(ch, 0);
        }

        for (char ch : ciphertext.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            }
        }
        char mostFrequentLetter = 'a';
        int maxFrequency = 0;
        for (char ch : frequencyMap.keySet()) {
            if (frequencyMap.get(ch) > maxFrequency) {
                mostFrequentLetter = ch;
                maxFrequency = frequencyMap.get(ch);
            }
        }
        int shift = mostFrequentLetter - 'e';
        if (shift < 0) {
            shift += 26;
        }

        // Расшифровываем текст с учетом сдвига
        StringBuilder decryptedText = new StringBuilder();
        for (char ch : ciphertext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base - shift + 26) % 26 + base);
            }
            decryptedText.append(ch);
        }

        return decryptedText.toString();
    }
    public static void main(String[] args) {
        String plaintext = "Kekes, hi.";
        int shift = 3;

        String encryptedText = encrypt(plaintext, shift);
        System.out.println("Зашифрованный текст: " + encryptedText);
        decrypt(encryptedText);
        String decryptedText = decryptFrequency(encryptedText);
        System.out.println(decryptedText);
    }
}
