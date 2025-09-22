// Last updated: 22/09/2025, 08:58:48
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int dup = x;
        int rev = 0;
        while(dup!=0){
            int last = dup % 10;
            rev = rev*10 + last;
            dup = dup / 10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
}