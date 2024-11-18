import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Size of Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter Elements : ");
        for(int i =0;i < r;i++){
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        
        for(int i =0;i < r;i++){
            for (int j = 0; j < c; j++) {
                System.err.print(arr[i][j]+" ");
            }
            System.err.println("");
        }
    }
}
