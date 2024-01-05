import java.util.Scanner;

public class even_bw_range {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter no of terms :");
        n=r.nextInt();

        for(int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
    
}
