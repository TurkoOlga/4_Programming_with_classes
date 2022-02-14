package task11;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private Word title;
    private List<Sentence> sentences;

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public void addText(Word word) {
        List<Word> wordList = new ArrayList<>();
        wordList.add(word);
        Sentence sentence = new Sentence(wordList);
        sentences.add(sentence);
    }

    public void printTextInConsole() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Text{" +
                "title=" + title +
                ", sentences=" + sentences +
                '}';
    }
}
