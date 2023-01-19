import java.util.Scanner;
public class mult_table16 {
    public static void main(String[] args) {
        /*Scanner integer=new Scanner(System.in);
        System.out.println("enter number to print table");
        int n=integer.nextInt();*/
        for(int n=1;n<=10;n++) {
            for (int i = 1; i <= 10; i++) {
                int s = n * i;
                System.out.println(n + "*" + i + "=" + s);

            }
            System.out.println("\n");
        }
    }
}
