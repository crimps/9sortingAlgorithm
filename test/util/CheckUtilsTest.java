package util;

import bubbleSort.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/14
 * @modified crimps  16/12/14  <创建>
 */
public class CheckUtilsTest {
    @Test
    public void checkSort() throws Exception {
        CheckUtils.checkSort(BubbleSort.class, "bubbleSort");
        CheckUtils.checkSort(BubbleSort.class, "bubbleSort_Up_V1");
        CheckUtils.checkSort(BubbleSort.class, "bubbleSort_Up_V2");
    }

}