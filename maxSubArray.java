package Arrays_in_Java;

import java.util.Scanner;

public class maxSubArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        maxSubArraySum(arr);
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
    
}
