package com.wzefeng.javase.sort;

/**
 * 选择排序 O(N) = N^2
 * 每次遍历将最小数放到数组左边
 *
 * @author wangzefeng
 * @date 2019/5/13 10:01
 */
public class SelectSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
