package hbcu.stay.ready.algor;

import java.util.LinkedHashMap;

public class Solution {

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

        String[] inputSplit = input.replaceAll("[.!,]", "").split(" ");
        LinkedHashMap<String, Integer> uniqueWordMap = new LinkedHashMap<String, Integer>();

        for(int word = 0;word < inputSplit.length;word++){
            if(!uniqueWordMap.containsKey(inputSplit[word]))
                uniqueWordMap.put(inputSplit[word],1);
            else{
                Integer keyValue = uniqueWordMap.get(inputSplit[word]);
                keyValue++;
            }
        }
        int uniqueNum = uniqueWordMap.size();








//format for output; might need to be loop to print out each keyvalue pair in map
        //String response = String.format("The"+(uniqueNum) + "unique words are: \n" + uniqueWordMap.get(key) + "(Seen "+ uniqueWordMap.get(keyvalue)+")\n");

return response;
    }
    }
