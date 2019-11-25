import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class WordReader {

    HashSet<Word> hSet = new HashSet<Word>();

    public WordReader(){}

    public void reader(String wordRd) {//RepeatedWords.csv
        try {
            BufferedReader br = new BufferedReader(new FileReader(wordRd));
            String line = br.readLine();

            while (null != line) {
                String[] fields = line.split("[ (,.;)]");
                for (int i = 0; i < fields.length; i++) {
                  Word word = new Word(fields[i], i);
                    hSet.add(word);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getWords() {
        Iterator<Word> it = hSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getWord());
        }
    }
}
