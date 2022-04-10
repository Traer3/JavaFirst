package com.hillel.classwork.lesson9.ReLearnAgain;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 8, 5, 9, 11, 1, 4, 2};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int search = 88;
        //int index = search(numbers, search);
        int index = binarySearch(numbers, search);
        if (index < 0){
            System.out.println(search + " not found");
        }else {
            System.out.println(search + " found on index " + index);
        }
    }

    private static int search(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                return i;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] numbers, int search){
        int index =-1;
        int low = 0;
        int high = numbers.length-1;


        while (low <= high){
            int mid = (low+high)/2;
            if(numbers[mid] < search){
                low = mid+1;
            }else if (numbers[mid] > search){
                high = mid-1;
            }else if (numbers[mid] == search){
                index = mid;
                break;
            }
        }
        return index;
    }
}
