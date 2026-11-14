class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //one zipper merge from Merge Sort
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        int i = 0, j = 0, index = 0; //pointers for all three arr

        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[index++] = temp[i++];
            } else {
                nums1[index++] = nums2[j++];
            }
        }

        // Copy remaining elements from temp, if any are left
        while (i < m) {
            nums1[index++] = temp[i++];
        }

        // Copy remaining elements from nums2, if any are left
        while (j < n) {
            nums1[index++] = nums2[j++];
        }
    }
}
