package arrays;

public class rotatekthelement {

    public static void main(String args[]){
        int arr[]={2,4,6,8,9};
        int d = 3;
        for(int i = 0;i< d;i++){
            int temp = arr[0];

            for(int j =0;j< arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;

        }

        System.out.println("after rotation");

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
