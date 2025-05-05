public class Solution {

    public int romanToInt(String s){
        char currentChar = Character.MIN_VALUE;
        char leftChar=Character.MIN_VALUE;
        int value = 0;

        /*Working right to left*/
        for(int i=s.length()-1; i>=0; i--) {
            currentChar = s.charAt(i);
            leftChar = (i==0) ? Character.MIN_VALUE : s.charAt(i-1);

            if (currentChar == 'I')
                value += 1;
            if (currentChar == 'V')
                if(leftChar == 'I') {
                    value += 4;
                    i--;
                }else
                value += 5;
            if (currentChar == 'X')
                if(leftChar == 'I') {
                    value += 9;
                    i--;
                }else
                value += 10;
            if (currentChar == 'L')
                if(leftChar == 'X') {
                    value += 40;
                    i--;
                }else
                value += 50;
            if (currentChar == 'C')
                if(leftChar == 'X') {
                    value += 90;
                    i--;
                }else
                value += 100;
            if (currentChar == 'D')
                if(leftChar == 'C') {
                    value += 400;
                    i--;
                }else
                value += 500;
            if (currentChar == 'M')
                if(leftChar == 'C') {
                    value += 900;
                    i--;
                }else
                value += 1000;

        }
        return value;
    }
}

/*
Hashmap was overkill

import java.util.HashMap;
import java.util.Map;

public class Solution{
    int value = 0;

    public int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0; i<s.length(); i++){
           value+=map.get(s.charAt(i));
           if((i+1)<s.length() && (map.get(s.charAt(i+1)) > map.get(s.charAt(i))))
               value-=map.get(s.charAt(i))*2;
        }

        return value;
    }
}*/
