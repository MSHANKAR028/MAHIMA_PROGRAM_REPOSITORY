package IceCream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Integer[] heightsArray = new Integer[heights.length];
        for (int i = 0; i < heightsArray.length; i++) {
            heightsArray[i] = heights[i];
        }
        Arrays.sort(heightsArray, Collections.reverseOrder());


        String[] res = new String[names.length];
        for (int i = heightsArray.length - 1; i >= 0; i--) {
            res[i] = map.get(heightsArray[i]);
        }
        return res;

    }


    public static void main(String[] args) {
        SortThePeople s = new SortThePeople();
        String names[] = {"Jannie", "Michelle", "Micheal", "Sarah"};
        int[] heights = {135, 130, 145, 120};
        System.out.println(Arrays.toString(s.sortPeople(names, heights)));
    }
}






















