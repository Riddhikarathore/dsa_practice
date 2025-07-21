package arrays;

public class checksorted {


    public static void main(String[] args) {
        int num[] = {2,6,45,78,2,54};
       // int min = num[0];
        boolean found = true ;

     for (int i = 0; i< num.length-1;i++){
         if(num[i]>num[i+1]){
             found = false;
             break;
         }
     }
     if(found)
         System.out.println("sorted");
     else
         System.out.println("unsorted");

    }

}
