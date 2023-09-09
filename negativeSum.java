package Arrays_in_Java;

import java.util.Scanner;

public class negativeSum {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        // subArrNegaSum(arr);
        prefixSum(arr);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void subArrNegaSum(int[] arr){
        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for(int k=i;k<=j;k++){
                    sum = sum + arr[k];
                }
                if(sum<0){
                    count++;
                }
            }
        }System.out.println("count is: " + count);
    }

    //prefixSum (optimized approach)
    public static void prefixSum(int[] arr){
        int currSum = 0;
        int count = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length;i++){
            for (int j = i; j < prefix.length; j++) {
                currSum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(currSum<0)
                  count++;
            }
        }
        System.out.println("count is: " + count);
    }
}
