class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            // If lightest + heaviest can share a boat
            if (people[left] + people[right] <= limit) {
                left++;
            }
            // Heaviest person always goes in this boat
            right--;
            boats++;
        }

        return boats;
    }
}