import java.util.HashSet;
import java.util.Set;

public class Test {

    //1512
    public int numIdenticalPairs(int[] nums) {
        int rs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    rs++;
                }
            }
        }
        return rs;
    }

    //1598
    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (count != 0) {
                    count--;
                }
            } else if (log.equals("./")) {
                count += 0;
            } else {
                count++;
            }
        }
        return count;
    }

    //202
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            n = convert(n);
            if (set.contains(n)) {
                return false;
            } else if (n == 1) {
                return true;
            } else {
                set.add(n);
            }
        }
    }

    public static int convert(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

    //724
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }
        for (int j = 0; j < n; j++) {
            if (j > 0) {
                leftSum += nums[j - 1];
            }
            rightSum -= nums[j];
            if (leftSum == rightSum) {
                return j;
            }
        }
        return -1;
    }
}
