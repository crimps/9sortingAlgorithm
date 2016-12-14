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
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j + 1 < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                }
            }
        }
    }

    /**
     * 改进版v1冒泡排序：
     * 改进在于如果出现一个序列，此序列基本是排好序的，如果是标准的冒泡排序，则还是需要进行不断的比较；
     * 通过一个boolean isChanged，如果一次循环中没有交换过元素，则说明已经排好序；
     * @param nums
     */
    public void bubbleSort_Up_V1(int[] nums) {
        boolean isChange = true;
        for(int i = 0; i < nums.length && isChange; i++) {
            isChange = false;
            for(int j = 0; j + 1 < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                    isChange = true;
                }
            }
        }
    }

    /**
     * 改进版V2冒泡排序：
     * 如果有100个数的数组，仅前面10个无序，后面90个都已排好序且都大于前面10个数字，
     * 那么在第一趟遍历后，最后发生交换的位置必定小于10，且这个位置之后的数据必定已经有序了，
     * 记录下这位置，第二次只要从数组头部遍历到这个位置就可以了
     * @param nums
     */
    public void bubbleSort_Up_V2(int[] nums) {
        int lastChangeIndex = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            int temp = 0;
            for(int j = 0; j + 1 <= lastChangeIndex; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                    temp = j;
                }
            }
            lastChangeIndex = temp;
        }
    }

    private void swap(int[] nums, int k) {
        int temp = nums[k + 1];
        nums[k + 1] = nums[k];
        nums[k] = temp;
    }
}