package p605_CanPlaceFlowers;

public class SolutionTester {
    public static void main(String args[]){
        Solution solution = new Solution();
        int flowerbed[]={1,0,1,0,0,1,0};
        int n=1;
        System.out.println(solution.canPlaceFlowers(flowerbed,n));
    }
}
