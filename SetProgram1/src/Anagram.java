import java.util.HashMap;
import java.util.Map;

public class Anagram {

public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    for(char c : s.toCharArray()){
        int count = map.getOrDefault(c, 0);
        map.put(c, count + 1);
    }
    for(char c : t.toCharArray()){
        int count = map.getOrDefault(c, 0);
        map.put(c, count - 1);
    }
    for(Map.Entry<Character, Integer> entry : map.entrySet()){
        if(entry.getValue() != 0){
            return false;
        }

    }
    return true;
}
public static void main(String[] args) {
    Anagram a = new Anagram();
    System.out.println(a.isAnagram("anagram", "nagaram"));
    System.out.println(a.isAnagram("rat", "car"));
}












}
