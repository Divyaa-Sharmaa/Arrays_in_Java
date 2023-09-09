package Arrays_in_Java;

import java.util.Scanner;

public class kadane {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        kadanesAlgo(arr);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void kadanesAlgo(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("our max subArray sum is: " + maxSum);
    }
    
}
