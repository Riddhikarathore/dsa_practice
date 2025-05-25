package arrays;

import java.util.Scanner;

public class largestelement {
public static int findlargest(int arr[]){
    int large = arr[0];
    for (int i = 0; i< arr.length;i++){
        if(large<arr[i]){
            large = arr[i];
        }
    }
    System.out.println("the largest element in the array is : ");
return (large);
    }
    public static void main(String[] args) {
//        int arr[] ={
//                1,4,3,6,8,7,3,9
//        } ;
      //  System.out.println(findlargest(arr));



        // but if we want to take array from user then
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the size of array ");
        int size = sc.nextInt();

        int arr[]= new int[size];

        System.out.println("enter the elements ");
        for (int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }


        System.out.println(findlargest(arr));




    }
}
