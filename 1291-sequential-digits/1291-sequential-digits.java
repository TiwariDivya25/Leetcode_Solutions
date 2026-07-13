class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> ans = new ArrayList();
        for(int i = 0; i < 9; i++){
            for(int j = i; j < 9; j++){
                String str = s.substring(i, j+1);
                int num = Integer.parseInt(str);
                if(num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}