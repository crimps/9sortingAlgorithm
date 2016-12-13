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

import util.ShowUtils;

/**
 * 两两相邻元素之间的比较,如果前者大于后者，则交换
 */
public class BubbleSort {

    /**
     * 标准冒泡排序
     * @param nums
     */
    public void bubbleSort(int[] nums) {
        ShowUtils.showLine(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j + 1 < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                    ShowUtils.showLine(nums);
                }
            }
        }
    }

    /**
     * 改进版冒泡排序：
     * 改进在于如果出现一个序列，此序列基本是排好序的，如果是标准的冒泡排序，则还是需要进行不断的比较；
     * 通过一个boolean isChanged，如果一次循环中没有交换过元素，则说明已经排好序；
     * @param nums
     */
    public void bubbleSortUp(int[] nums) {
        ShowUtils.showLine(nums);
        boolean isChange = true;
        for(int i = 0; i < nums.length && isChange; i++) {
            isChange = false;
            for(int j = 0; j + 1 < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                    isChange = true;
                    ShowUtils.showLine(nums);
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