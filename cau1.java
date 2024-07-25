import java.util.*;
public class cau1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String shortestLastWord = words[0];
        String longestFirstWord = words[0];
        for (String word : words) {
            if (word.length() > longestFirstWord.length()) {
                longestFirstWord = word;
            }
        }
        for (String word : words) {
            if (word.length() <= shortestLastWord.length()) {
                shortestLastWord = word;
            }
        }
        System.out.println("Output:" + shortestLastWord + " " + longestFirstWord);
        scanner.close();
    }
}
