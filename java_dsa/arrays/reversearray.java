package arrays;

import java.util.Scanner;

import java.util.Scanner;

public class reversearray {
    public static void reverse(int arr[]) {
       for(int i = 0;i< arr.length/2;i++){
           int tem = arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=tem;
       }

    }

    public static void main(String[] args) {


        // but if we want to take array from user then
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter the elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


       reverse(arr);

        for(int value : arr){
            System.out.print(value +" \t ");
        }

    }
}