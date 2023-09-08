package Arrays_in_Java;

import java.util.Scanner;

public class revArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        reverseArr(arr);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void reverseArr(int[] arr){
        System.out.println("Before Reverse: " + arr);
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            //swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("After reversing: " + arr);
    }
}
