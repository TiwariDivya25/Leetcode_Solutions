class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            int sum = sum(word, weights);
            sb.append((char)('z' - (sum % 26)));
        }
        return sb.toString();
    }
    private int sum(String word, int[] weights) {
        int sum = 0;
        for(char c : word.toCharArray()) {
            sum += weights[c-97];
        }
        return sum;
    }
}