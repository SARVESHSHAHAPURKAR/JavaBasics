package CollectionsPractice;

public class Student implements Comparable<Student>{

    int rollno;
    String name;
    int marks;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // COMPARE THE CURRENT OBJECT TO OTHER OBJECT
    @Override
    public int compareTo(Student o) {
        return this.getMarks()<o.getMarks()?-1:1;
    }
}
