public class homework2 {
    //leetcode 27
    public int removeElement(int[] A, int elem) {
        int i=0;
        int j=0;

        while(j < A.length){
            if(A[j] != elem){
                A[i] = A[j];
                i++;
            }

            j++;
        }

        return i;}

    //leetcode26
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i;
    }
}
