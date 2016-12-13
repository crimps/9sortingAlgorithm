/**
 * @(#)insertSort.InsertSort.java Copyright (c) 2014-2018 crimps
 */
package insertSort;

/**
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */

import util.ShowUtils;

/**
 * 1）将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 2）从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 *（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面
 */
public class InsertSort {
    public void insertSort(int[] nums) {
        ShowUtils.showLine(nums);
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i;
            while (j > 0 && nums[j - 1] > temp) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
            ShowUtils.showLine(nums);
        }
    }
}