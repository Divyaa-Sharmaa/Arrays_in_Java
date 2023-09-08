package Arrays_in_Java;

import java.util.Scanner;

public class maxSubArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        // maxSubArraySum(arr);
        prefixSum(arr);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // by brute force approach(or basic/simple one approach)
    public static void maxSubArraySum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           for (int j = i; j < arr.length; j++) {
               for(int k = i; k<=j;k++){
                   sum = sum + arr[k];
                }
                if(sum>maxSum){
                    maxSum= sum;
                }
            }
        } 
        System.out.println("count is: " + maxSum);
    }

    // by Prefix Sum
    public static void prefixSum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] +arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }System.out.println("max sum is: "  +maxSum);
    }
    
}
