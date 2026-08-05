class Student{
    static String college="scsvmv";
    String name;
    Student(String n)
    {
        name=n;
    }
    void display(){
        System.out.println(name+ "studies at college");
    }
    public static void main(String[] args)
    {
        Student s1=new Student("chandu");
        Student s2=new Student("tharish");
        s1.display();
        s2.display();
    }
}