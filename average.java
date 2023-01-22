import java.sql.SQLOutput;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        float avg;
        int l=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int p=0;p<arr.length;p++)
        {
            System.out.println(arr[p]);
        }
        int sum=0;
        for(int j=0;j<arr.length;j++) {
            sum = sum + arr[j];
        }
        avg=sum/l;
        System.out.println("The average is:" +avg);
    }
}
