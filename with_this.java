class student{
    int rno;
    String name;
    float marks;
    student(int rno,String name,float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    void print()
    {
        System.out.println(rno+" "+name+" "+marks);
    }

}
public class with_this {
    public static void main(String[] args) {
        student s1=new student(65,"Venu",98f);
        student s2=new student(94,"praneeth",98f);
        s1.print();
        s2.print();

    }
}

