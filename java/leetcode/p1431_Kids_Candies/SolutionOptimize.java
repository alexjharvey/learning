package p1431_Kids_Candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SolutionOptimize {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output= new ArrayList<>(Collections.nCopies(candies.length,false));
        int max_candies = Arrays.stream(candies).max().orElseThrow();

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max_candies){output.set(i,true);}
        }

        return output;
    }
}
