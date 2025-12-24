class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1 = 0, cand2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for(int num : nums) {
            if(num == cand1) {
                cnt1++;
            } else if(num == cand2) {
                cnt2++;
            } else if (cnt1 == 0){
                cand1 = num;
                cnt1 = 1;
            } else if(cnt2 == 0){
                cand2 = num;
                cnt2 = 1;
            } else { 
                cnt1--;
                cnt2--;
            }

        } 
        
        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums) {
            if(num == cand1) cnt1++;
            if(num == cand2) cnt2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(cnt1 > nums.length/3) ans.add(cand1);
        if(cnt2 > nums.length/3) ans.add(cand2);

        return ans;
    }
}