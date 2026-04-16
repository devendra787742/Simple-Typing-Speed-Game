import java.util.*;

public class TypingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = "java is a powerful programming language";

        System.out.println("🎮 Typing Speed Game");
        System.out.println("Type the following sentence:");
        System.out.println("\"" + sentence + "\"");

        long startTime = System.currentTimeMillis();

        String userInput = sc.nextLine();

        long endTime = System.currentTimeMillis();

        long timeTaken = (endTime - startTime) / 1000;

        if (userInput.equals(sentence)) {
            System.out.println("✅ Correct typing!");
        } else {
            System.out.println("❌ There were mistakes.");
        }

        System.out.println("⏱ Time taken: " + timeTaken + " seconds");
    }
}