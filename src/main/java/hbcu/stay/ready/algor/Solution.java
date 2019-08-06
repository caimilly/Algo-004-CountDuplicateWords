package hbcu.stay.ready.algor;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    //making the input map
    public LinkedHashMap<String, Integer> createMap (String input){
        String[] inputSplit = input.replaceAll("[.!,]", "").split(" ");//1
        LinkedHashMap<String, Integer> uniqueWordMap = new LinkedHashMap<String, Integer>();

        for (int word = 0; word < inputSplit.length; word++) {//2-3
            if (!uniqueWordMap.containsKey(inputSplit[word]))
                uniqueWordMap.put(inputSplit[word], 1);
            else {
                //Integer keyValue = uniqueWordMap.get(inputSplit[word]);
                //keyValue++;
                uniqueWordMap.get(inputSplit[word]+1);
            }
        }
        return uniqueWordMap;
    }
    public String countUniqueWords(String input) {
        /*
        1. split string by spaces
        1b. remove punctuation from string
        2.get iterator to go thru string
        2b.for each word, add to map, and value++
        3. for each unique word, uniquenum++
        4. print out num of unique words
        5. print each unique word and reps on separate line
         */

        //ref to map
        LinkedHashMap<String, Integer> uniqueWordMap = createMap(input);
        Iterator<Map.Entry<String, Integer>> mapIterator = uniqueWordMap.entrySet().iterator();
        Map.Entry mapPair = mapIterator.next();

        String wordKey = mapPair.getKey().toString();
        String wordValue = mapPair.getValue().toString();

        String uniqueWordString = "";
        int uniqueNum = uniqueWordMap.size();//4
        uniqueWordString += String.format("The %d unique words are: \n", uniqueNum);
        while (mapIterator.hasNext()) {
            if (mapIterator.hasNext()) {
                uniqueWordString += wordKey + "(Seen " + wordValue + ")\n";
            } else
                uniqueWordString += wordKey + "(Seen " + wordValue + ")";
        }
        return uniqueWordString;
    }
}
