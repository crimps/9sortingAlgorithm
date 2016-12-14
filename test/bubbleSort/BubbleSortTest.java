package bubbleSort;

import org.junit.Test;
import util.CheckUtils;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */
public class BubbleSortTest {

    @Test
    public void bubbleSort() throws Exception {
        CheckUtils.checkSort(BubbleSort.class, "bubbleSort");
        CheckUtils.checkSort(BubbleSort.class, "bubbleSort_Up_V1");
        CheckUtils.checkSort(BubbleSort.class, "bubbleSort_Up_V2");
    }

}