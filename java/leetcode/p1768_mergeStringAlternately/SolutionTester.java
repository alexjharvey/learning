package p1768_mergeStringAlternately;

public class SolutionTester {
    public static void main(String args[]){
        SolutionOptimize solution = new SolutionOptimize();
        String string1 = "abcdefg";
        String string2 = "123456789";
        System.out.println(solution.mergeAlternately(string1,string2));
    }
}
