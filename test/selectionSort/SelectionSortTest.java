package selectionSort;

import org.junit.Test;
import util.CheckUtils;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */
public class SelectionSortTest {
    @Test
    public void selectionSort() throws Exception {
        CheckUtils.checkSort(SelectionSort.class, "selectionSort");
    }

}