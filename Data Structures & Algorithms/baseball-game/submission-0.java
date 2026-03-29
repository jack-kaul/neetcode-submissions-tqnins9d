class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        for(String operation : operations) {
            if(operation.equals("+")) {
                int i1 = scores.pop();
                int i2 = scores.pop();
                scores.push(i2);
                scores.push(i1);
                scores.push(i1 + i2);
            } else if(operation.equals("C")) {
                scores.pop();
            } else if(operation.equals("D")) {
                scores.push(2*scores.peek());
            } else {
                scores.push(Integer.valueOf(operation));
            }
        }
        int result = 0;
        while(!scores.isEmpty()) {
            result += scores.pop();
        }
        return result;
    }
}