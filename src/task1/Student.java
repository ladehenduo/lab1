package task1;

public class Student extends Person{
    public String classname;
    public String stunumber;
    public Student(Person p) { // task1.Student 的构造方法
        if (p == null)
            throw new IllegalArgumentException("参数不合法");
        this.name = p.name;
    }
}
