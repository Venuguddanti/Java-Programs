public class Inheritance {
    public static void main(String[] args) {
        book b=new book();
        b.eat();
        b.read();
    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class book extends Animal{
    void read()
    {
        System.out.println("reading...");
    }
}
