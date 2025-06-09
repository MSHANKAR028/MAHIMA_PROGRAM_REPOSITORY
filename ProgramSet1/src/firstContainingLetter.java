import java.util.ArrayList;
import java.util.List;

public class firstContainingLetter {
    public List<Integer> findWordsContaining(String[] words, char letter) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == letter){
                    result.add(i);
                    break;
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        firstContainingLetter obj = new firstContainingLetter();
        System.out.println(obj.findWordsContaining(new String[]{"leet", "code"},'e'));
    }











}
