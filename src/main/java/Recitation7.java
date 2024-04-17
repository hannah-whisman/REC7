

public class Recitation7 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList) {
        int index = 0;
        while (index < hopList.length - 1) {
            if (hopList[index] == 0) {
                return false;
            }
            index += hopList[index];
        }
        return true;
    }



    public static int[] slidingWindowMin(int[] numberList, int windowSize){
        if (windowSize <= 0 || windowSize > numberList.length) {
            return new int[0];
        }
        int n = numberList.length;
        int[] result = new int[n - windowSize + 1];

        for (int i = 0; i <= n - windowSize; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < i + windowSize; j++) {
                min = Math.min(min, numberList[j]);
            }
            result[i] = min;
        }

        return result;
    }

}




