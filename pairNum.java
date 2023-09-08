package Arrays_in_Java;

import java.util.Scanner;

public class pairNum {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        pairWithNum(arr);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void pairWithNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i==j){
                    continue;
                }
                System.out.print("(" + arr[i] +"," +arr[j] + ")");
            }
            System.out.println();
        }
    }    

}

