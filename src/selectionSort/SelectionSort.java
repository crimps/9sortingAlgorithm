/**
 * @(#)selectionSort.SelectionSort.java Copyright (c) 2014-2018 crimps
 */
package selectionSort;

/**
 *
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */

import util.ShowUtils;

/**
 * 1）首先在未排序序列中找到最小（大）元素，存放到排序序列的起始(末尾)位置
 * 2）再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的起始(末尾)。
 * 3）重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public void selectionSort(int[] nums) {
        ShowUtils.showLine(nums);
        for(int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, minIndex, i);
            ShowUtils.showLine(nums);
        }
    }

    private void swap(int[] nums, int minIndex, int index) {
        int temp = nums[index];
        nums[index] = nums[minIndex];
        nums[minIndex] = temp;
    }
}