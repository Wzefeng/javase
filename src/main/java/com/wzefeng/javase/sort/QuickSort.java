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
        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;

        while (right >= left) {
            while (right >= left) {
                if (arr[right] < pivot) {
                    arr[index] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > pivot) {
                    arr[index] = arr[left];
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
