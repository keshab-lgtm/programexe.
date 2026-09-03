class Solution {
    public int findKthPositive(int[] arr, int k) {

        int number = 1;

        while (true) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                k--;

                if (k == 0) {
                    return number;
                }
            }

            number++;
        }
    }
}