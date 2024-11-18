import java.util.Scanner;
public class Bulletin {
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(sc.hasNextLine()){
            String l = sc.nextLine();
            System.out.println(n + " " + l);
            n++;
        }
        sc.close();
    }
}

