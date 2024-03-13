import java.util.Scanner;

public class NStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i = 1; i <= n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            int tmp = cnt;
            while(tmp>0){
                tmp--;
                System.out.print("*");
            }
            cnt+=2;
            System.out.println();
        }
    }
}
