import java.io.* ;
import java.util.*;
import java.util.Scanner;
public class collections1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        Vector<Integer>v=new Vector();
        Hashtable<Integer,String>h=new Hashtable();
        v.addElement(1);
        v.addElement(2);
        h.put(1,"venu");
        h.put(2,"RVR");
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}
