package p1431_Kids_Candies;


public class SolutionTester {
    public static void main(String args[]){
        SolutionOptimize solution = new SolutionOptimize();
        int[] test1 = {2,4,1,6,2,6};
        int extra_candies=2;

        System.out.println(solution.kidsWithCandies(test1,extra_candies).toString());
    }
}
