class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        int score = 1;
        for(int n : copy) {
            if(!map.containsKey(n)) {
                map.put(n, score);
                score++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}