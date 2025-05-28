package arrays;

public class maxminelement {

    public static void main (String args[]) {
        int num[] = {3, 4, 6, 5, 1, 9};
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length;i++){
            if(num[i]> max ){
                max = num[i];
            }
            if(num[i]<min){
                min = num[i];
            }

        }
        System.out.println("maximun "+max);
        System.out.println("minimum "+min);
    }

}
