class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n3=nums1.length+nums2.length;
            int nums3[] = new int[n3];
            int count=0;
            for(int i=0;i<nums1.length;i++){
                nums3[i]=nums1[i];
                count++; 
            }
            for(int j=0;j<nums2.length;j++)
                nums3[count++]=nums2[j];
        return findMedian(nums3,n3);  
    }
    public static double findMedian(int nums3[], int n3){
        Arrays.sort(nums3);
        if (n3 % 2 != 0)
            return (double)nums3[n3 / 2];
        else
            return (double)(nums3[(n3 - 1) / 2] + nums3[n3 / 2]) / 2.0;
    } 
}
