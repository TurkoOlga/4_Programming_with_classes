package task11;
/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Text text = createText();
        text.addText(new Word("the end"));

        Word title = new Word("Animals");
        text.setTitle(title);
        text.printTextInConsole();
    }

    public static Text createText() {
        Word cat = new Word("cat");
        Word and = new Word("and");
        Word dog = new Word("dog");

        List<Word> words = new ArrayList<>();
        words.add(cat);
        words.add(and);
        words.add(dog);

        Sentence sentence = new Sentence(words);
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence);

        return new Text(sentences);
    }
}
