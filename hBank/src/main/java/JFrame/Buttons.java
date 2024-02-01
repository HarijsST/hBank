package JFrame;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Buttons extends MainFrame{
    public Button textButton(){
        Button textButton = new Button("Teksts");
        textButton.setFont(new Font("Arial", Font.PLAIN, 16));
        textButton.addActionListener(e -> label.setText(String.valueOf(textField.getText())));
        return textButton;
    }

    public Button wordsCount(){
        Button wordsCount = new Button("Skaits");
        wordsCount.setFont(new Font("Arial", Font.PLAIN, 16));
        wordsCount.addActionListener(e -> label.setText(Integer.toString(deletedWords())));
        return wordsCount;
    }

    public Button symbolCount(){
        Button symbolCount = new Button("Simbolu skaits");
        symbolCount.setFont(new Font("Arial", Font.PLAIN, 16));
        symbolCount.addActionListener(e -> label.setText(String.valueOf(textField.getText().trim().length())));
        return symbolCount;
    }

    public Button clear(){
        Button clear = new Button("Clear");
        clear.setFont(new Font("Arial", Font.PLAIN, 16));
        clear.setPreferredSize(new Dimension(400, 35));
        clear.addActionListener(e -> {
            textField.setText("");
            label.setText("");
        });
        return clear;
    }

    public Button longestWordButton(){
        Button longest = new Button("Garākais vārds");
        longest.setFont(new Font("Arial", Font.PLAIN, 16));
        longest.addActionListener(e -> {
            label.setText(longestWord());
        });
        return longest;
    }
    public int deletedWords(){
        int counter = 0;
        String text = String.valueOf(textField.getText());
        for(String word : text.split(" ")){
            if(word.chars().allMatch(Character::isLetter)){
                counter = counter + 1;
            }
        }
        return counter;
    }
    public String longestWord(){
        String text = String.valueOf(textField.getText()).trim();
        if(text.isEmpty()){
            return "Nav teksta";
        }
        List<String> words = Arrays.asList(text.split(" "));
        String longestWord = words.get(0);
        for(String word : words){
            if(longestWord.length() < word.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
}
