package Arrays_in_Java;

import java.util.Scanner;

public class binSearch {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        input(arr);
        int binNum = sc.nextInt();
        int index = binarySearch(arr,binNum);
        if(index==-1){
            System.out.println("Number not found");
        }else
        System.out.println("the number found at index: " + index);
    }

    public static void input(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == n){
                return mid;               
            }
            if(arr[mid]<n){
                start = mid +1;
            }
            else
             end = mid-1;
            
        }
        return -1;       
    }
    
}
