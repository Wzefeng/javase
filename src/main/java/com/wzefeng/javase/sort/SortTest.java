package com.wzefeng.javase.sort;

import java.util.Arrays;

/**
 * 测试排序
 *
 * @author wangzefeng
 * @date 2019/5/13 10:12
 */
public class SortTest {

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1};
        // BubbleSort.sort(arr);
        // SelectSort.sort(arr);
        QuickSort.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
