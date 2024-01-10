public class Playfair {
    private static final int SIZE = 5; // Размер квадратной матрицы
    private char[][] matrix; // Матрица для хранения ключа

    public Playfair(String key) {
        // Инициализация матрицы с ключом
        matrix = generateKeyMatrix(key);
    }

    private char[][] generateKeyMatrix(String key) {
        char[][] keyMatrix = new char[SIZE][SIZE];
        String keyWithoutDuplicates = removeDuplicateChars(key + "ABCDEFGHIKLMNOPQRSTUVWXYZ");

        // Заполнение матрицы
        int k = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                keyMatrix[i][j] = keyWithoutDuplicates.charAt(k++);
            }
        }

        return keyMatrix;
    }

    private String removeDuplicateChars(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    private String prepareInput(String input) {
        // Удаляем ненужные символы и делаем буквы заглавными
        input = input.toUpperCase().replaceAll("[^A-Z]", "");

        // Добавляем символ X между одинаковыми буквами и после нечетных символов
        StringBuilder preparedInput = new StringBuilder(input);
        for (int i = 0; i < preparedInput.length() - 1; i += 2) {
            if (preparedInput.charAt(i) == preparedInput.charAt(i + 1)) {
                preparedInput.insert(i + 1, 'X');
            }
        }
        if (preparedInput.length() % 2 != 0) {
            preparedInput.append('X');
        }

        return preparedInput.toString();
    }

    private int[] findPosition(char ch) {
        int[] result = new int[2];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (matrix[i][j] == ch) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();
        String preparedText = prepareInput(plaintext);

        for (int i = 0; i < preparedText.length(); i += 2) {
            char firstChar = preparedText.charAt(i);
            char secondChar = preparedText.charAt(i + 1);

            int[] firstPos = findPosition(firstChar);
            int[] secondPos = findPosition(secondChar);

            if (firstPos[0] == secondPos[0]) {
                // Если буквы находятся в одной строке, заменяем их следующими буквами в этой строке
                ciphertext.append(matrix[firstPos[0]][(firstPos[1] + 1) % SIZE]);
                ciphertext.append(matrix[secondPos[0]][(secondPos[1] + 1) % SIZE]);
            } else if (firstPos[1] == secondPos[1]) {
                // Если буквы находятся в одном столбце, заменяем их следующими буквами в этом столбце
                ciphertext.append(matrix[(firstPos[0] + 1) % SIZE][firstPos[1]]);
                ciphertext.append(matrix[(secondPos[0] + 1) % SIZE][secondPos[1]]);
            } else {
                // Буквы не находятся в одной строке и не в одном столбце, заменяем их по диагонали
                ciphertext.append(matrix[firstPos[0]][secondPos[1]]);
                ciphertext.append(matrix[secondPos[0]][firstPos[1]]);
            }
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        Playfair playfairCipher = new Playfair("AHMAD");

        String plaintext = "ABUALLABAN";
        System.out.println("Plaintext: " + plaintext);

        String ciphertext = playfairCipher.encrypt(plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}