import java.util.Scanner;
public class Functions {
    public static void Fact(int n){
    int f=1;
    if(n<0){
    System.out.println("Invalit....");
    }
    else if(n>0){
    for(int i=n; i>=1; i--)
        {
         f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number = ");
    int n = sc.nextInt();
    Fact(n);
}
}