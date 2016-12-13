/**
 * @(#)bubbleSort.BubbleSort.java Copyright (c) 2014-2018 crimps
 */
package bubbleSort;

/**
 *
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */

/**
 * 两两相邻元素之间的比较,如果前者大于后者，则交换
 */
public class BubbleSort {

    public void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j + 1 < nums.length; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                }
            }
        }
    }

    private void swap(int[] nums, int k) {
        int temp = nums[k + 1];
        nums[k + 1] = nums[k];
        nums[k] = temp;
    }
}