class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }

        Arrays.sort(position);

        Stack<Double> stack = new Stack<>();

        for (int i = position.length - 1; i >= 0; i--) {
            int pos = position[i];
            int sp = map.get(pos);

            double time = (double)(target - pos) / sp;

            if (!stack.isEmpty() && time <= stack.peek()) {
                continue;
            }
            stack.push(time);
        }

        return stack.size();
    }
}
