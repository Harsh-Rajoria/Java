import java.util.Scanner;

public class naturalnumupto_n {
    public static void main(String args[]){
        int n;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter no. Of terms :");
        n=r.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i + " ");
        }
    }    
}
