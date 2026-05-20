import java.util.HashSet;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int[] ans = new int[A.length];

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        int count = 0;

        for(int i = 0; i < A.length; i++) {

            if(B[i] == A[i]) {
                count++;
            }
            else {
                if(b.contains(A[i])) count++;
                if(a.contains(B[i])) count++;
            }

            a.add(A[i]);
            b.add(B[i]);

            ans[i] = count;
        }

        return ans;
    }
}