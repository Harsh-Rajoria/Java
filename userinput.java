import java.util.Scanner;

public class userinput {
    public static void main(String args[]){
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter A:");
        a= obj.nextInt();
        System.out.println("Enter B:");
        b= obj.nextInt();
        System.out.println(a+b);
    }
}
