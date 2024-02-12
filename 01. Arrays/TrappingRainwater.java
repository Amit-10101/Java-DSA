public class TrappingRainwater {
    public static void maxLeft(int[] height, int[] maxLeftArr) {
        maxLeftArr[0] = height[0];
        for(int i = 1; i < maxLeftArr.length; i++) {
            if (maxLeftArr[i - 1] < height[i]) {
                maxLeftArr[i] = height[i];
            } else {
                maxLeftArr[i] = maxLeftArr[i - 1];
            }
        }
    }

    public static void maxRight(int[] height, int[] maxRightArr) {
        maxRightArr[maxRightArr.length - 1] = height[height.length - 1];
        for(int i = maxRightArr.length - 2; i >= 0; i--) {
            if (maxRightArr[i + 1] < height[i]) {
                maxRightArr[i] = height[i];
            } else {
                maxRightArr[i] = maxRightArr[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 }; 
        // Given is array of heights of blocks in array, and width is 1
        // We have to calculate Total rainwater stored between the blocks
        // First calculate Waterlevel, then subtrct it from Block Height, and then multiply the result with the width
        // Trapped Water = (Water Level - Block Height) * Width

        // To calculate water level, get max left and max right of te block, then select min among the, i.e., the Water Level.
        // Water Level = min(Max Left, Max Right)

        // First task would be to calculate the Max Left and Right, and store them in auxillary/helper arrays, for later.

        int[] maxLeftArr = new int[height.length];
        maxLeft(height, maxLeftArr);

        int[] maxRightArr = new int[height.length];
        maxRight(maxLeftArr, maxRightArr);

        int totalTrappedWater = 0;

        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(maxLeftArr[i], maxRightArr[i]);
            int water = (waterLevel - height[i]) * 1;

            totalTrappedWater += water;
        }

        System.out.println("Total Trapped Water: " + totalTrappedWater);

        // Time Complexity: O(n), Space Complexity: O(n)
    }
}
