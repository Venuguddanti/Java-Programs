public class MultiInheritance {
    public static void main(String[] args) {
        friend3 f=new friend3();
        f.typing();
        f.read();
        f.writing();
    }
}
class friend1{
    void read()
    {
        System.out.println("reading...");
    }
}
class friend2 extends friend1{
    void writing(){
        System.out.println("writing...");
    }
}
class friend3 extends friend2{
    void typing()
    {
        System.out.println("typing...");
    }
}
