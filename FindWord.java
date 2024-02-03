import java.util.Scanner;

class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word");
        String searchWord = scanner.nextLine();

        SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer(sentence);
        sentenceAnalyzer.checkWordPresence(searchWord);
    }
}

class SentenceAnalyzer {
    private String sentence;

    public SentenceAnalyzer(String sentence) {
        this.sentence = sentence;
    }

    public void checkWordPresence(String searchWord) {
        if (sentence.contains(searchWord)) {
            System.out.println(searchWord + " is present in the sentence");
        } else {
            System.out.println(searchWord + " is not present in the sentence");
        }
    }
}
