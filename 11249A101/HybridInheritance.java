class Student {
    void study() {
        System.out.println("Student is studying");
    }
}
class Marks extends Student {
    void displayMarks() {
        System.out.println("Marks: 95");
    }
}
interface Sports {
    void play();
}
class Result extends Marks implements Sports {
    public void play() {
        System.out.println("Student is playing sports");
    }

    void displayResult() {
        System.out.println("Result: Pass");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.study();
        obj.displayMarks();
        obj.play();
        obj.displayResult();
    }
}