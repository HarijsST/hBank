package wordCounter;

import java.util.Scanner;

public class WordCounterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadam tekstu");
        WordCounter wordCounter = new WordCounter();
        System.out.println("Vārdu skaits ir: " + wordCounter.countWord(scanner.nextLine()));
    }
}