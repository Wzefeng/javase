package com.wzefeng.javase.sort;

/**
 * 快速排序 O(N) = N * logN
 * 填坑法
 *
 * @author wangzefeng
 * @date 2019/5/13 10:36
 */
public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partitionSwapAndReturnIndex(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    /**
     * 数组填坑并返回基准索引。
     *
     * @param arr
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partitionSwapAndReturnIndex(int[] arr, int startIndex, int endIndex) {
        // 取分区第一个元素为基准值
        int pivot = arr[startIndex];
        // 基准索引
        int index = startIndex;
        // 左边指针
        int left = startIndex;
        // 右边指针
        int right = endIndex;

        while (right >= left) {
            // 由于选择左边值为基准值，所以要从右边指针开始遍历
            while (right >= left) {
                if (arr[right] < pivot) {
                    // 填坑
                    arr[index] = arr[right];
                    // 新的坑的索引
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > pivot) {
                    // 填坑
                    arr[index] = arr[left];
                    // 新的坑的索引
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = pivot;
        return index;
    }
}
