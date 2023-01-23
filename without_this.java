class Student{
    int rno;
    String name;
    float marks;
    Student(int rno,String name,float marks)
    {
        rno=rno;
        name=name;
        marks=marks;
    }
    void print()
    {
        System.out.println(rno+" "+name+" "+marks);
    }

}
public class without_this {
    public static void main(String[] args) {
        Student s1=new Student(65,"Venu",98f);
        Student s2=new Student(94,"praneeth",98f);
        s1.print();
        s2.print();

    }
}
