import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=input.nextInt();
        int target=65;
        System.out.println(search(int arr[],target));
    }
    static int search(int arr[],target)
    {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i
            }
        }
    }

}
