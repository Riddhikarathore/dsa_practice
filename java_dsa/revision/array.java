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


//    public static void main(String[] args) {
//        int arr[] = {2,4,5,6,7,8};
//        int temp = arr[0];
//
//        for(int i = 1; i< arr.length;i++){
//            arr[i-1]=arr[i];
//        }
//        arr[arr.length-1]=temp;
//
//        System.out.println("after rotation ");
//
//        for(int i =0;i< arr.length;i++){
//            System.out.println(arr[i]+"");
//        }
//
//    }

// left rotate the elements to d place


    //revision

    //1 largest number

//    public static void main(String args[]) {
//        int arr[] = {1, 4, 2, 5, 89};
//        int largest = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        System.out.println("the largest element : ");
//        System.out.println(largest);
//
//    }


    //second largest

//    public static void main (String args[]){
//        int arr[]={1,4,6,8,9,43};
//        int largest = arr[0];
//        int secondlargest = -1;
//
//        for(int i = 0; i< arr.length;i++){
//            if(arr[i]>largest){
//                largest = arr[i];
//
//            }
//        }
//        System.out.println("the largest element :" + largest );
//
//        for(int i = 0;i< arr.length;i++){
//            if(arr[i]>secondlargest && arr[i]!= largest){
//                secondlargest = arr[i];
//            }
//        }
//
//        System.out.println("the second largest element is :"+ secondlargest);
//
//    }

    //check array sorted

//    public static void main (String args[]){
//        int arr[]= {4,2,5,3,8};
//        System.out.println(arr.length);
//        boolean found = true;
//        for(int i = 0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                found = false;
//            }
//        }
//        if(found){
//            System.out.println("sorted");
//        }
//        else{
//            System.out.println("unsorted");
//        }
//    }

    //rotate array from one place

//    public static void main (String args[]){
//        int arr[]= {2,4,6,8,9,10};
//
//        int temp = arr[0];
//        for(int i = 1;i< arr.length;i++){
//            arr[i-1]=arr[i];
//
//        }
//         arr[arr.length-1]=temp;
//
//        System.out.println("after rotate");
//
//        for(int k = 0;k< arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
//
//    }


    //left rotate array by dth place

//    public static void main (String args[]){
//        int arr[]= {2,4,6,8,10};
//
//        int d = 9;
//
//        for (int i =0;i<9;i++){
//            int temp = arr[0];
//
//            for(int j= 0;j< arr.length-1;j++){
//                arr[j]=arr[j+1];
//            }
//
//            arr[arr.length-1]=temp;
//        }
//
//        System.out.println("after rotation");
//
//        for(int i =0;i< arr.length;i++){
//            System.out.print(arr[i]);
//        }
//    }

       //move all zeros to last

//    public static void main (String args[]){
//        int arr[]={1,0,3,0,5,0};
//        int index = 0;
//        for(int i = 0;i<arr.length;i++){
//            //left shift k liye
//
//            if(arr[i]!=0){
//                arr[index]=arr[i];
//                index++;
//            }
//        }
//        //zeros ko last m kr denge
//
//        for(int i =index;i< arr.length;i++){
//            arr[i]=0;
//        }
//        //final print
//        for(int k = 0;k< arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
//    }

//    public static void main (String args[]){
//        int arr[]={2,3,2,3,2,3,4,3,5,4};
//        //sare element aayenge
//        for(int i =0 ; i<arr.length;i++){
//            boolean alreadycount= false;
//
//            //ab campare krenge
//            for(int j =0;j< i;j++){
//                if(arr[j]==arr[i]){
//                    alreadycount=true;
//                    break;
//                }
//            }
//
//            if(alreadycount==false){
//                int count = 1;
//                for(int k = i+1;k<arr.length;k++){
//                    if (arr[k] == arr[i]){
//                        count++;
//                    }
//
//                }
//
//                System.out.println("number"+arr[i]+" frequency"+count);
//            }
//        }
//
//    }

    //find the pair which give k


//    public static void main (String args[]){
//        int arr[]= {1,2,4,3,6};
//        int k = 7;
//        int count = 0;
//
//
//        for(int i =0;i< arr.length;i++){
//            for(int j = i+1;j< arr.length;j++){
//                if(arr[i]+arr[j]==k) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("the number of pair "+ count);
//
//    }


    //count even and add number in array

//    public static void main (String args[]){
//        int arr[]={2,4,6,8,10};
//        int evencount = 0;
//        int oddcount =0;
//
//        for(int i =0;i< arr.length;i++){
//
//            if(arr[i]%2==0){
//                evencount++;
//            }
//            else{
//                oddcount++;
//            }
//        }
//
//        System.out.println("the number of even elements :" + evencount);
//        System.out.println("the number of odd elements :"  + oddcount );
//    }


    //find missing element

//    public static void main (String args[]){
//        int arr[]={2,3,4,5,6};
//
//        int totalsum =0;
//        for(int i =0;i<arr.length;i++){
//            totalsum += arr[i];
//        }
//
//        //actualsum
//        int length = arr.length;
//
//        int actualsum = (length+1)*(length+2)/2;
//
//        int missing = actualsum - totalsum;
//
//
//        System.out.println("the missing element is :" +missing);
//    }


   // Find the maximum sum of any subarray of size k in the array



//        public static void main(String[] args) {
//            int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
//            int k = 4;
//            int n = arr.length;
//
//            if (n < k) {
//                System.out.println("Invalid");
//                return;
//            }
//
//            // Step 1: Calculate sum of first window
//            int windowSum = 0;
//            for (int i = 0; i < k; i++) {
//                windowSum += arr[i];
//            }
//
//            int maxSum = windowSum;
//
//            // Step 2: Slide the window
//            for (int i = k; i < n; i++) {
//                windowSum += arr[i] - arr[i - k]; // Add next element, remove the first element of the previous window
//                maxSum = Math.max(maxSum, windowSum);
//            }
//
//            System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
//        }


    //Rearrange Array Elements





    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, 6, -7};
        rearrangeArray(arr);
    }

    public static void rearrangeArray(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Split the array into positive and negative lists
        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int i = 0, j = 0, k = 0;

        // Alternate placing of positive and negative elements
        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        // Add remaining positive elements
        while (i < pos.size()) {
            arr[k++] = pos.get(i++);
        }

        // Add remaining negative elements
        while (j < neg.size()) {
            arr[k++] = neg.get(j++);
        }

        // Print the result
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
    }




