package p345_ReverseVowelsString;

public class SolutionOptimize {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int forward = 0;
        int reverse = chars.length-1;
        while(forward<reverse){
            while(forward<reverse&&!this.isVowel(chars[forward])){
                forward++;
            }
            while(forward<reverse&&!this.isVowel(chars[reverse])){
                reverse--;
            }
            this.swap(chars,forward,reverse);
            forward++;
            reverse--;
        }
        return String.valueOf(chars);
    }

    private char temp='0';
    private void swap(char[] array, int i1, int i2){
        temp=array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }

    private boolean isVowel(char c){
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
