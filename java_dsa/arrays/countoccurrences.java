package arrays;

public class countoccurrences{

    public static void main(String[] args) {
        int nums[] = {34,56,78,23,546,874,55,34,55};
        int target =55;
        int count = 0;

        for(int num : nums ){
            if(num == target ){
                count++;

            }


        }
        System.out.println(count);
    }


}
