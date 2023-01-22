import java.io.*;
import java.util.*;
import java.util.Scanner;
public class linkedlist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        LinkedList<Integer>l1=new LinkedList<Integer>();
        for(int i=0;i<=n;i++)
        {
            l1.add(i);
        }
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);

    }
}
