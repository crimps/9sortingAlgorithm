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
        System.out.println("标准版冒泡排序：");
        bubbleSort.bubbleSort(nums);
        System.out.println("改进版冒泡排序：");
        int[] nums_up = {3, 2, 1, 4, 5};
        bubbleSort.bubbleSortUp(nums_up);
    }

}