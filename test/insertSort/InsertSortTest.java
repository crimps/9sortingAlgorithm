package insertSort;

import org.junit.Test;
import util.CheckUtils;

import static org.junit.Assert.*;

/**
 * @author crimps
 * @version 1.0  16/12/13
 * @modified crimps  16/12/13  <创建>
 */
public class InsertSortTest {
    @Test
    public void insertSort() throws Exception {
        CheckUtils.checkSort(InsertSort.class, "insertSort");
    }

}