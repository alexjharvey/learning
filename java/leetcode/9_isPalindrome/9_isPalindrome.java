//Accepted solution without converting to string
public class Solution {
  public boolean isPalindrome(int x) {
      //No negatives
      //The only palindrome ending in 0 is 0
      if(x<0 || (x%10==0 && x!=0)) return false;


      int revInt=0;
      System.out.println("Start x="+x+" rev="+revInt);
      //build the reverse int by using x%10 to pop off last digit of x and add to revInt
      //next iteration that same digit would take the next highest digit place, so multiply revInt*10 and pop next x
      while(x>revInt){
          revInt=x%10 + revInt*10;
          x/=10;
          System.out.println("During x="+x+" rev="+revInt);
      }
      System.out.println("End x="+x+" rev="+revInt);
      //Second part here is in the event that our palindrome is odd, we drop (what would be) the middle digit
      return x==revInt || x==(revInt/10);
  }
}

/*public class Solution{

    // pop first and last, feed back in recursively
    public boolean isPalindrome(int x){
        //no negs
        if(x<0) return false;
        return isPalindrome(Integer.toString(x));
    }

    public boolean isPalindrome(String string){
        if(string.length() <= 2 && (string.charAt(0)==string.charAt(string.length()-1))){
            return true;
        }else if (string.charAt(0)==string.charAt(string.length()-1)){
            return isPalindrome(string.substring(1,string.length()-1));
        }
        return false;
    }
}*/

/*  Accepted solution without converting to string
    public class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        System.out.println("Start x= "+x+" r= "+revertedNumber);
        while(x > revertedNumber) {

            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
            System.out.println("x= "+x+" r= "+revertedNumber);

        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        System.out.println("End x= "+x+" r= "+revertedNumber);
        return x == revertedNumber || x == revertedNumber/10;
    }
}*/
