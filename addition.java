/*hahhahaha hungry*/
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the start:");int start = sc.nextInt();
        System.out.print("enter the end:");int end = sc.nextInt();
        int sum =0;
        for(int i = start;i<=end;i++){
            sum+=i;
        }System.out.println("the sum is:"+sum);

    }
}
