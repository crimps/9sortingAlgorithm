package bubbleSort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */
public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();
    @Test
    public void bubbleSort() throws Exception {
        int[] nums = {3, 2, 1, 4, 5};
        long startTime = System.nanoTime();
        bubbleSort.bubbleSort(nums);
        long endTime = System.nanoTime();
        System.out.println("标准版冒泡排序用时：" + (endTime - startTime));
        System.out.println("=============");

        int[] nums_up = {3, 2, 1, 4, 5};
        long startTimeV1 = System.nanoTime();
        bubbleSort.bubbleSort_Up_V1(nums_up);
        long endTimeV1 = System.nanoTime();
        System.out.println("改进版V1冒泡排序用时：" + (endTimeV1 - startTimeV1));
        System.out.println("=============");

        int[] num_up2 = {3, 2, 1, 4, 5};
        long startTimeV2 = System.nanoTime();
        bubbleSort.bubbleSort_Up_V2(num_up2);
        long endTimeV2 = System.nanoTime();
        System.out.println("改进版V2冒泡排序用时：" + (endTimeV2 - startTimeV2));
        System.out.println("=============");
    }

}