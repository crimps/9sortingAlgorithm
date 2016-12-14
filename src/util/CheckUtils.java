/**
 * @(#)util.CheckUtils.java Copyright (c) 2014-2018 crimps
 */
package util;


import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author crimps
 * @version 1.0  16/12/14
 * @modified crimps  16/12/14  <创建>
 */
public class CheckUtils {

    /**
     * 检测排序算法上否正确
     * @param object
     * @param methName
     * @return
     * @throws Exception
     */
    public static void checkSort(Class object, String methName) throws Exception{
        int[] nums = getRandomNums();
        long startTime = System.nanoTime();
        Method method = object.getDeclaredMethod(methName, nums.getClass());
        method.invoke(object.newInstance(), nums);
        long entTime = System.nanoTime();
        if (checkSortNums(nums)) {
            System.out.println(object.getName() + "执行[" + methName + "]排序(" + nums.length +"元素)用时：" + (entTime - startTime) + "纳秒");
        } else {
            System.out.println("排序错误");
        }
    }

    /**
     * 检查数组是否正确排序：正序、反序
     * @param nums
     * @return
     */
    private static boolean checkSortNums(int[] nums) {
        boolean leftFlag = true;
        boolean rightFlag = true;
        //检查由小到大的排列
        for(int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] > nums[i + 1]) {
                leftFlag = false;
            }
        }
        //检查由大到小的排列
        for(int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] < nums[i + 1]) {
                rightFlag = false;
            }
        }
        if (leftFlag || rightFlag) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 随机生成无序数组
     * 元素个数：100~200
     * 元素大小：1~100000
     * @return
     */
    private static int[] getRandomNums() {
        //随机生成排序元素个数
        Random random = new Random();
        int length = random.nextInt(1000) + 100;
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            numList.add(random.nextInt(100000) + 1);
        }
        return ArrayUtils.toPrimitive(numList.toArray(new Integer[length]));
    }
}