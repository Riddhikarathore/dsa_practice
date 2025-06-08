package patterns;

public class pattern11 {
    public static void main(String[] args) {
        int i ,j;
        int sum;

        int n = 5;
        for(i=1;i<=n;i++){
            for(j =1;j<=i;j++){
                sum=i+j;
                if(sum%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
