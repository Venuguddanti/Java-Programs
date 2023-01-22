import java.util.Scanner;
public class largest_element_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= input.nextInt();
        }
        for(int p=0;p<arr.length;p++)
        {
            System.out.println(arr[p]);
        }
        int max=arr[0];
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>max) {
                max = arr[j];
            }
        }
        System.out.println("maximum element is:"+max);

    }
}
