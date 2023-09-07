package Arrays_in_Java;

import java.util.Scanner;

public class linearSearch{
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args){
        int size = sc.nextInt();
        int numberToBeSearched = sc.nextInt();
        int[] arr = new int[size];
        inputArr(arr);
        linearArr(arr, numberToBeSearched);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void linearArr(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("number present at index: " + i);                
            }
            else{
                System.out.println("number not found...");
            }
        }
    }
    
}