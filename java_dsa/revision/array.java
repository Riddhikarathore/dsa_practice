package revision;
import java.util.*;

public class array {
    // public static void main (String args[]){
    //   int arr[] = {3,2,1,5,2};
    //  int largest = arr[0];
    //int secondlargest = -1;
    //for(int i =0;i< arr.length;i++){
    //  if (largest< arr[i]){
    //    largest = arr[i];
    //}
    //}

    //for (int i = 0;i< arr.length;i++){
    //  if(secondlargest < arr[i] && largest!=arr[i]){
    //    secondlargest = arr[i];
    //}
    //}

    //System.out.println("the largest element is : "+ largest);
    //System.out.println("the second largest element is : "+ secondlargest);


    //check if the array is sorted

//        int arr[]= {2,1,4,5,3,9,8};
//        boolean found = true;
//
//        System.out.println(arr.length);
//
//        for(int i = 0;i< arr.length;i++){
//            if (arr[i] > arr[i+1]) {
//                found = false;
//               break;
//            }
//        }
//        if(found){
//            System.out.println("sorted");
//        }
//        else{
//            System.out.println("unsorted");
//        }

//without using methods remove duplicates

//int arr[]= {3,3,1,1,6,6,7,7};
//int i = 0;
//for(int j = 0;j<arr.length;j++) {
//    if (arr[i] != arr[j]) {
//      i++;
//      arr[i]=arr[j];
//    }
//}
//        System.out.println("after removing duplicates");
//for (int k = 0;k<=i;k++){
//    System.out.print(arr[k]+" ");
//}
//
//        System.out.println("the number of elements are :" + (i+1));


    //}
//}

//using methods remove duplicates in sorted array


//    public static int removeduplicate(int arr[]){
//        int i = 0;
//        for(int j = 1;j< arr.length;j++){
//            if (arr[j]!= arr[i]){
//                i++;
//                arr[i]=arr[j];
//            }
//        }
//        return i+1;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1,2,2,3,4,4,5};
//
//
//
//        int newlength = removeduplicate(arr);
//        System.out.println("after removing the duplicates ");
//
//        for(int i = 0; i<newlength;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }


    //left rotate the array by one place


    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};
        int temp = arr[0];

        for(int i = 1; i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        System.out.println("after rotation ");

        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]+"");
        }

    }


}