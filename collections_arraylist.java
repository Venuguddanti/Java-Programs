import java.util.ArrayList;
import java .util.Scanner;
public class collections_arraylist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<=n;i++)
            al.add(i);
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        for(int j=0;j<al.size();j++)
            System.out.println(al.get(j)+" ");
    }
}

