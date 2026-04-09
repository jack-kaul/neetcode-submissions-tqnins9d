class Solution {
        public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                if (stack.peek() < -ast) {
                    // top asteroid is smaller → explode
                    stack.pop();
                } else if (stack.peek() == -ast) {
                    // both equal → both explode
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    // current asteroid is smaller → explode
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(ast);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}