package Arrays_in_Java;

import java.util.Scanner;

public class largestNum {
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args){
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArr(arr);
        int largestNum = largestNumber(arr);
        System.out.println("The largest number is: " + largestNum);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int largestNumber(int[] arr){
        int start = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>start){
                start = arr[i];
            }
        }
        return start;
    }

}
