public class fibanoci {
    public static void main(String[] args) {
        int i=0,j=1;
        for(int p=1;p<=10;p++)
        {
            System.out.print(i+",");
            int s=i+j;
            i=j;
            j=s;
        }
    }
}
