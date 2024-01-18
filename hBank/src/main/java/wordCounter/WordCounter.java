package wordCounter;

public class WordCounter {
    public int countWord(String textInput){
        return textInput.split(" ").length;
    }
}
