package p345_ReverseVowelsString;

/*
1.tranverse chars in string
2.if vowel, write in length - i in string builder
3.if consonant, write it in same position of string builder
 */

import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        LinkedHashMap<Integer, Character> orderedMap = new LinkedHashMap<>();
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            // if consonant just write
            if(this.isVowel(s.charAt(i))){
                orderedMap.put((Integer) i,s.charAt(i));
            }
            // if vowel put in vowel map
        }
        //this is just all the junk you need to iterate forwards and back through the vowel hashmap list
        List<Map.Entry<Integer,Character>> entryList = new ArrayList<>(orderedMap.entrySet());
        ListIterator<Map.Entry<Integer,Character>> forwardIterator = entryList.listIterator();
        ListIterator<Map.Entry<Integer, Character>> reverseIterator = entryList.listIterator(entryList.size());

        while(forwardIterator.hasNext()){

            Map.Entry<Integer, Character> headEntry = forwardIterator.next();
            Map.Entry<Integer, Character> tailEntry = reverseIterator.previous();
            if(forwardIterator.nextIndex()>reverseIterator.previousIndex()) {
                stringBuilder.setCharAt(headEntry.getKey(), tailEntry.getValue());
                stringBuilder.setCharAt(tailEntry.getKey(), headEntry.getValue());
                break;
            }
            if(forwardIterator.nextIndex()>reverseIterator.previousIndex())break;

            stringBuilder.setCharAt(headEntry.getKey(), tailEntry.getValue());
            stringBuilder.setCharAt(tailEntry.getKey(), headEntry.getValue());
        }
        return stringBuilder.toString();
    }
    public boolean isVowel(char c){
        if(c=='a')return true;
        if(c=='e')return true;
        if(c=='i')return true;
        if(c=='o')return true;
        if(c=='u')return true;

        if(c=='A')return true;
        if(c=='E')return true;
        if(c=='I')return true;
        if(c=='O')return true;
        if(c=='U')return true;

        return false;
    }
}

