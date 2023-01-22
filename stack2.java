import java.util.*;
import java.util.Scanner;

public class stack2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        Stack<String>stack=new Stack<String>();
        stack.push(s1);
        String s2=input.nextLine();
        stack.push(s2);
        Iterator<String>itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
