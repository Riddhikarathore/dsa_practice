package arrays;

public class findelement {

    public static void main(String[] args) {

        int nums[] ={1,3,5,4,6,7,8,};
        int target = 49;
        boolean found = false;

        for(int num : nums ) {
            if (num == target) {
                found = true;
                break;

            }
        }


            if(found  ){
                System.out.println("present");
            }
            else System.out.println("not found");


        }

    }

