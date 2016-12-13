package selectionSort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */
public class SelectionSortTest {
    private SelectionSort selectionSort = new SelectionSort();
    @Test
    public void selectionSort() throws Exception {
        int[] nums = {3, 2, 1, 4, 5};
        selectionSort.selectionSort(nums);
    }

}