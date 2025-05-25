package arrays;

public class largestelement {
public static int findlargest(int arr[]){
    int large = arr[0];
    for (int i = 0; i< arr.length;i++){
        if(large<arr[i]){
            large = arr[i];
        }
    }
return (large);
    }
    public static void main(String[] args) {
        int arr[] = {
                4,5,8,9,1
        };
        System.out.println(findlargest(arr));

    }
}
