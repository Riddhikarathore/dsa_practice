package arrays;

import java.util.Scanner;



public class findsum {

    public static int sum(int arr[]){
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            sum+=arr[i];
        }
        return sum;
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
            System.out.println("the sum is:");
            System.out.println(sum(arr));

        }
}
