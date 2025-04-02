package pl.sebastianklimas.lc88MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if (n == 0) {
            return;
        }

        int i = 0, j = 0, k = 0;
        int[] temp = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        if (i < m) {
            System.arraycopy(nums1, i, temp, k, m - i);
        } else if (j < n) {
            System.arraycopy(nums2, j, temp, k, n - j);
        }
        System.arraycopy(temp, 0, nums1, 0, m + n);
    }
}
