
public class Word {

    String word;
    int numberWord;

    public Word(String word, int numberWord) {
        this.word = word;
        this.numberWord = numberWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumberWord() {
        return numberWord;
    }

    public void setNumberWord(int numberWord) {
        this.numberWord = numberWord;
    }

    @Override
    public String toString() {
        return word;

    }

    @Override
    public int hashCode() {
      return word.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return word.equals(((Word)obj).getWord());
    }
}
