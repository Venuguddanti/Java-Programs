class Helper {
    public static int sum(int a, int b)
    {
        return a + b;
    }
}
class with_static {
    public static void main(String[] args)
    {
        int n = 3, m = 6;
        int s = Helper.sum(n, m);
        System.out.print("total sum of two numbers is = " + s);
    }
}
