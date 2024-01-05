import java.util.Scanner;

public class sumofodd_even_bw_range {
    public static void main(String[] args) {
        int n,evensum=0,oddsum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter no of terms :");
        n=r.nextInt();
        if (n%2==0) {
            for(int i=0;i<=n;i=i+2)
            {
                evensum=evensum+i;
            }            
            System.out.println(evensum);
        }
        else{
            for(int i=1;i<=n;i=i+2)
            {
                oddsum=oddsum+i;
            }
            System.out.println(oddsum);
        }
    }    
}
