package com.DsaPlaylist.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
//        In a standard binary search, you assume the array is sorted in ascending order. But in real-world scenarios, the array might be sorted in descending order—or you might not know the order at all. Order-agnostic binary search solves this by:
//        - Checking the order of the array by comparing the first and last elements.
//        - Applying binary search logic based on the detected order.
//        > we just don't know if the array is increasing or decreasing order

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("This is Order Agnostic Binary search program (you are free to enter sorted or unsorted array)\nnow enter the Array size to create: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        if (size < 1) {
            System.out.println("size can't be smaller than 1");
            System.exit(0);
        } else {
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter the [%d] element", i);
                arr[i] = scanner.nextInt();
            }

            System.out.println("Perform to Order Agnostic Search?(y/n)");

            char choice = scanner.next().charAt(0);

            if (choice == 'y') {
                System.out.print("Enter the element to find: ");
                int target = scanner.nextInt();

                int result = binarySearch(arr, target);

                if (result >= 0) {
                    System.out.printf("The element is found at index %d", result);
                } else {
                    System.out.println("element is not found");
                }

            } else {
                System.out.println("Shame on you for wasting your time");
                System.exit(0);
            }
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[0] < arr[end]) {
            //ascending order

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {

                    end = mid - 1;

                } else if (target > arr[mid]) {

                    start = mid + 1;

                } else if (target == arr[mid]) {
                    return mid;
                }
            }

            } else if (arr[0] > arr[end]) {
                //descending order

                while (start <= end) {

                    int mid = start + (end - start) / 2;

                    if (target < arr[mid]) {

                        start = mid + 1;

                    } else if (target > arr[mid]) {

                        end = mid - 1;

                    } else if (target == arr[mid]) {
                        return mid;
                    }

                }

            } else {
                System.out.println("The binary search algorithm only works on sorted array");
                return -1;
            }

            return -1;
        }
    }

