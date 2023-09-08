package Arrays_in_Java;

import java.util.Scanner;

public class negativeSum {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        subArrNegaSum(arr);
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
    
}
