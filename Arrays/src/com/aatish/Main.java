package com.aatish;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int [] inputArray = new int[5];
//        int sum = 0;
//        for(int i =0; i< inputArray.length; i++) {
//            System.out.println("Enter number " + i);
//            inputArray[i] = sc.nextInt();
//            sum += inputArray[i];
//        }
//        average(sum);

        // Challenge - Sort numbers in array
//         int[] arrayMade = getArrayNumber();
//         sortArray(arrayMade);

        // Min number array challenge -
//        System.out.println("Enter size of array ");
//        int count = sc.nextInt();
//        int [] array = readIntegers(count);
//        getMinIntegers(array);

        //Reverse array challenge
        reveseArray();
    }

//    public static void getMinIntegers(int[] array) {
//        //int[] array = new int[count];
//        boolean flag = true;
//        int temp = 0;
//        while(flag) {
//            flag = false;
//            for(int i =0; i< array.length-1; i++) {
//                if(array[i] < array[i+1]) {
//                    temp = array[i+1];
//                    array[i+1] = array[i];
//                    array[i] = temp;
//                    flag=true;
//                }
//            }
//        }
//        System.out.println("Min Vlaue " + array[array.length-1] );
//    }
//
//    public static int[] readIntegers(int count) {
//        int[] array = new int[count];
//        System.out.println("Enter numbers of array");
//        for(int i=0; i< count; i++) {
//            array[i] = sc.nextInt();
//        }
//        return  array;
//    }

//    public static int[] getArrayNumber() {
//        int [] array = new int[5];
//        System.out.println("Enter numbers ");
//        for(int i =0; i< array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        return array;
//    }
//    public static void sortArray(int[] arr) {
//        boolean flag = true;
//        int temp;
//        while(flag) {
//            flag = false;
//            int a =0;
//            for (int i=0; i< arr.length-1; i++) {
//                if(arr[i] < arr[i+1]) {
//                    a = arr[i+1];
//                    arr[i+1] = arr[i];
//                    arr[i] = a;
//                    flag = true;
//                }
//            }
//        }
//        for (int i=0; i< arr.length; i++) {
//            System.out.println("Sorted array " + arr[i]);
//        }
//
//    }

    public static void reveseArray() {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = Arrays.copyOf(array1, 6);
        int temp = 0;
        for(int i=0; i< array1.length; i++) {
            for(int j=array2.length-1; j>= 0; j--) {
                array1[i] = temp;
                array1[i] = array2[j];
                array2[j] = temp;
            }
        }
        for(int i=0; i< array1.length; i++) {
            System.out.println("Original array " + array1[i] );
            System.out.println("Reversed Array " + array2[i]);
        }
    }
}
