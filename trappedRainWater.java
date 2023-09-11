package Arrays_in_Java;

import java.util.Scanner;

public class trappedRainWater {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        int trappedRainWaterValue = trappedRainwater(arr);
        System.out.println("trappedRainWaterValue: "+trappedRainWaterValue);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int trappedRainwater(int[] height){
        int n = height.length; 

        // left boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //right boundary
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    
}
