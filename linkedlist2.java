import java.io.*;
import java.util.*;
import java.util.Scanner;

public class linkedlist2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt();
        LinkedList<Integer>in1=new LinkedList<Integer>();
        for(int i=n1;i<=n2;i++)
        {
            in1.add(i);
        }
        for(int j=0;j<in1.size();j++)
        {
            System.out.print(in1.get(j)+" ");
        }
        System.out.println();
        System.out.println(in1);
    }
}
