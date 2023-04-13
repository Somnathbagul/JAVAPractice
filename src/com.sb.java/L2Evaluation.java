package com.sb.java;

import java.util.Arrays;

public class L2Evaluation {

    public static void main(String[] args) {
         int number = 5;
        //Program to check if a number is prime or not
         System.out.println("Number "+number+" Is prime or not? "+ isPrime(number));
        //Program to reverse a string
         System.out.println("String abc and it's reverse string is "+reverseString("abc"));
        //Program to find the factorial of a number
         System.out.println("Calculate factorial of given number "+number+" is "+factorial(number));
        //Program to check if a string is a palindrome
        String inputString = "mam";
         System.out.println("Check the given String as "+inputString+" is palindrome? "+isPalindrome(inputString));
        //Program to find the largest and smallest elements in an array
        int[] inputArray ={1,2,4,5};
        findMinMax(inputArray);

        //Program to find the second-largest element in an array
        System.out.println("second-largest number from array "+Arrays.toString(inputArray)+" is: "+findSecondLargest(inputArray));

        //Program to check if two strings are anagrams
        String str1 = "abc";
        String str2 = "bac";
        System.out.println("check Strings are anagrams or not?"+areAnagrams(str1,str2));
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Given Input Array is "+Arrays.toString(arr));
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }



}
