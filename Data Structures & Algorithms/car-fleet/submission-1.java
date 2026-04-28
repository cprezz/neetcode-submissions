class Solution {

    class Pair {
        int position;
        double time;

        Pair(int position, double time) {
            this.position = position;
            this.time = time;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        List<Pair> pair = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            double time = (double)(target - position[i]) / speed[i];
            pair.add(new Pair(position[i], time));
        }

        pair.sort((a, b) -> Integer.compare(b.position, a.position));

        Stack<Double> st = new Stack<>();

        for (Pair p : pair) {
            if (st.isEmpty() || p.time > st.peek()) {
                st.push(p.time);
            }
        }

        return st.size();
    }
}