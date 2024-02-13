package maps;

import java.util.HashMap;

public class characterCountMap {
    public static HashMap<Character, Integer> countingMap(String s){
        HashMap<Character, Integer> countMap = new HashMap<>();
        System.out.println(s);
        char[] charArray=s.toCharArray();

        for(char c: charArray){
            if(countMap.get(c) != null ){
                int count=countMap.get(c);
                count++;
                countMap.put(c,count);
            }
            else {
                countMap.put(c,1);
            }

        }


        return countMap;
    }
}
