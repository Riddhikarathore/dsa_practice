package patterns;

public class pattern8 {
    public static void main(String[] args) {
        int i;
        int j;
        int num =1;
        int space ;
        for(i=1;i<=4;i++){
            for(space = 1;space <= 4-i;space++){
                System.out.println(" ");
            }

        }
        for(j=1;j<=i;j++){
            System.out.print(num);
            num++;
        }
    }
}
