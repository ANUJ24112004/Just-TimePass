import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.println("Enter the word to count: ");
        String word = scanner.nextLine();
        
        
        String[] words = sentence.split("\\s+");
        
        int count = 0;
        
        
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        
        System.out.println("The word '" + word + "' appears " + count + " times.");
    }
}
