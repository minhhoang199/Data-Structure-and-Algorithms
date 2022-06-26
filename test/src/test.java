public class test {
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if ((long) nums[i] > first) {
                third = second;
                second = first;
                first = (long) nums[i];
            }
            if ((long) nums[i] < first && (long) nums[i] > second) {
                third = second;
                second = (long) nums[i];
            }
            if ((long) nums[i] < second && (long) nums[i] > third) {
                third = (long) nums[i];
            }
        }
        if (third != Long.MIN_VALUE) {
        return (int)third;
        }
        return (int) first;
    }

    //1346, 941
    public static int minimumMountainRemovals(int[] nums) {
        int n= nums.length;
        int[] left = new int[n], right = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i] && left[i] < left[j]){
                    left[i] = left[j];
                }
            }
            left[i]++;
        }

        for(int j = n - 1; j >= 0; j--){
            for(int i = n - 1; i > j; i--){
                if(nums[j] > nums[i] && right[j] < right[i]){
                    right[j] = right[i];
                }
            }
            right[j]++;
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            if(left[i] > 1 && right[i] > 1) max = Math.max(max, left[i] + right[i] - 1);
        }

        return n - max;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,1,5,6,2,3,1};
        System.out.println(minimumMountainRemovals(nums));
    }
}
