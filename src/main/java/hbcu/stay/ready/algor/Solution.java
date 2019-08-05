package hbcu.stay.ready.algor;

import sun.text.IntHashtable;

import java.util.HashMap;

public class Solution {

    public String countUniqueWords(String input) {
        //loop for # unique words
        /*int duplicateSetCount = 0;
        HashMap<String,Integer> duplicateMap = new HashMap<String, Integer>();
        for(int i = 0;i<input.length();i++){
            if(!duplicateMap.containsKey(input[i])){
                duplicateMap.put(input[i],1);
            }else{
                Integer keyValue = duplicateMap.get(input[i]);
                if(keyValue == 1){
                    duplicateSetCount++;
                    keyValue++;
                    duplicateMap.put(input[i],keyValue);
                }
            }

        }



        HashMap<String, Integer> wordMap = new HashMap<String, Integer>(Integer.parseInt(input));
        String inputArray[] = input.split(" ");
        int duplicateSetCount = 0;
        Integer keyValue=0;
        for (int i = 0; i < inputArray.length; i++) {
            if (!wordMap.containsKey(inputArray[i])) {
                wordMap.put(inputArray[i], 1);
                ;
            } else {
                keyValue = wordMap.get(inputArray[i]);
                if (keyValue == 1) {
                    duplicateSetCount++;
                    keyValue++;
                    wordMap.put(inputArray[i], keyValue);
                }
            }
        }
        return String.valueOf((wordMap.keySet()));

         */
        return input;
    }
}