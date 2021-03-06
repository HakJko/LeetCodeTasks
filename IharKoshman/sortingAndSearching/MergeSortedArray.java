package IharKoshman.sortingAndSearching;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 *  You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 */

class SolutionSortedMerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Fill from the backwards
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i>=0 && j >=0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }

        }
        while(j>=0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}
