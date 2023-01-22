import java.util.*;
import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<String>();
        stack.push("venu");
        stack.push("from");
        stack.push("RVRjc");
        Iterator<String>itr=stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
        System.out.println();

    }
}
