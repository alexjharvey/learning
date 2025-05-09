package p605_CanPlaceFlowers;
/*
    *Notice that the number of available beds increases for every odd number of zeroes in a row
        3 zeros=1, 4 zeros=1, 5 zeros=2, 6 zeros=2, 7 zeros=3 ...

    1. traverse flowerbed list
        a. count zeroes in a row until hit a 1
        b. open beds=
            if odd, count/2 floor
            if even, count/2 -1
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeroCount=0;
        int openSpaces=0;
        if(n==0)return true;
        if(flowerbed.length==1&&flowerbed[0]==0&&n==1)return true;
        if(flowerbed[0]==0)zeroCount++;
        for(int i=0;i<flowerbed.length;i++){

            if(flowerbed[i]==1&&zeroCount>=1){
                if(zeroCount%2==1) {// if odd
                    openSpaces += zeroCount/2;
                }else{// if even
                    openSpaces+=zeroCount/2 -1;
                }
                zeroCount=0;
            }
            if(flowerbed[i]==0){
                zeroCount++;
            }
            if(i== flowerbed.length-1){
                if(zeroCount%2==1) {// if odd
                    openSpaces += zeroCount/2;
                }else{// if even
                    openSpaces+=zeroCount/2;
                }
            }
        }
        if(openSpaces>0&&n<=openSpaces) return true;
    return false;
    }

}
