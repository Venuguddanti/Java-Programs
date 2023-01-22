import java.util.Scanner;

public class standarddeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        double sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println(sum);
        double mean = sum / arr.length;
        double var = 0;
        for (int p = 0; p < arr.length; p++) {
            int r = arr[p];
            var = var + Math.pow((r-mean), 2);
        }
        System.out.println(Math.sqrt(var/arr.length));
    }
}
