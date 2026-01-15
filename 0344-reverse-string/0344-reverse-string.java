class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        s = reverse(s, left, right);

    }
    public char[] reverse(char[] s, int left, int right){
        if(left >= right) {
            return s;
        }
        
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        return reverse(s, left+1, right-1);
    }
}