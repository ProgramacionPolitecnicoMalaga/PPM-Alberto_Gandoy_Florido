

public class ShowWords {
    public static void main(String[] args){
        WordReader wR = new WordReader();
        wR.reader("RepeatedWords.csv");
        wR.getWords();

    }

}
