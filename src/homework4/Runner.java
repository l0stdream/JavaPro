package homework4;

import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


    }

    public static int findSymbolOccurance(String source, Character target) {
        int counter = 0;
        for (char ch : source.toCharArray())
            if (ch == target)
                counter++;
        return counter;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String source) {
        return new StringBuilder(source).reverse().toString();
    }

    public static boolean isPalindrome(String source) {
        return (new StringBuilder(source).reverse().toString()).equals(source);
    }

    public static void guessWord(String[] words) {
        Scanner scanner = new Scanner(System.in);
        String targetWord = words[new Random().nextInt(words.length)];
        StringBuilder str = new StringBuilder("###############");

        while (true) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals(targetWord)) {
                System.out.println("You guessed correctly! The word was - " + targetWord);
                break;
            } else {
                for (char ch : answer.toCharArray()) {
                    int index = targetWord.indexOf(ch);
                    while (index >= 0) {
                        str.setCharAt(index, ch);
                        index = targetWord.indexOf(ch, index + 1);
                    }
                }
                System.out.println("You didn't guess, here's a hint : " + '\n' + str);
            }
        }
    }
}
