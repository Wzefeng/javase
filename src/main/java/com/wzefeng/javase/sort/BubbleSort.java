package com.wzefeng.javase.sort;

/**
 * 冒泡排序 O(N) = N^2
 * 每次比较将大数和小数交换位置
 *
 * @author wangzefeng
 * @date 2019/5/13 9:23
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
