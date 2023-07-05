public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int expectedMaxSum1 = 6;
        testFindMaxSubarraySum(nums1, expectedMaxSum1);

        int[] nums2 = { 1, -2, 3, -4, 5 };
        int expectedMaxSum2 = 5;
        testFindMaxSubarraySum(nums2, expectedMaxSum2);

        int[] nums3 = { 1, 2, 3, 4, 5 };
        int expectedMaxSum3 = 15;
        testFindMaxSubarraySum(nums3, expectedMaxSum3);

        int[] nums4 = { -1, -2, -3, -4, -5 };
        int expectedMaxSum4 = -1;
        testFindMaxSubarraySum(nums4, expectedMaxSum4);

        int[] nums5 = { 5 };
        int expectedMaxSum5 = 5;
        testFindMaxSubarraySum(nums5, expectedMaxSum5);

        int[] failTest = { 5, 5 };
        int hopeWrong = 9;
        testFindMaxSubarraySum(failTest, hopeWrong);
    }

    private static int findMaxSubarraySum(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    private static void testFindMaxSubarraySum(int[] nums, int expectedMaxSum) {

        int maxSum = findMaxSubarraySum(nums);

        if (maxSum != expectedMaxSum) {
            System.out.printf("Test failed! Expected: %d, Received: %d%n", expectedMaxSum, maxSum);
            return;
        }

        System.out.println("Test passed! MaxSum: " + maxSum);
    }

}