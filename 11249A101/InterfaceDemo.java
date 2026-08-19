interface Student{
    void name();
    void age();
    void course();
}
class Details implements Student{
    public void name(){
        System.out.println("Name:Chandu");
    }
    public void age(){
        System.out.println("Age:19");
    }
    public void course(){
        System.out.println("Course:Computer science");
    }
}
public class InterfaceDemo{
    public static void main(String[] args){
        Details obj=new Details();
        obj.name();
        obj.age();
        obj.course();
    }
}