import java.util.Arrays;
import java.util.Scanner;

class WordArranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        WordProcessor wordProcessor = new WordProcessor(sentence);
        wordProcessor.arrangeLetters();
    }
}

class WordProcessor {
    private String sentence;

    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    public void arrangeLetters() {
        if (isValidInput()) {
            String[] words = sentence.split(" ");

            for (String word : words) {
                char[] letters = word.toCharArray();
                Arrays.sort(letters);
                System.out.print(new String(letters) + " ");
            }
        } else {
            System.out.println(sentence + " is an invalid input");
        }
    }

    private boolean isValidInput() {
        return sentence.matches("[a-z\\s]+");
    }
}
