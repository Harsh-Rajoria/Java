import java.util.Scanner;

public class sumoffirstnaturanlnum {
    public static void main(String args[]){
        int n,sum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter no. of terms :");
        n=r.nextInt();

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
