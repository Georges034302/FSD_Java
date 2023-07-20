package lecture7;

public class Student {
    private int ID;
    private String grade;
    private int mark;

    public Student(int ID, int mark) {
        this.ID = +ID;
        this.mark = mark;
        this.grade = grade(mark);
    }
    
    private String grade(int mark) {
        return mark >= 85 ? "HD" : 
                mark >= 75 ? "D" : 
                mark >= 65 ? "C" : 
                mark >= 50 ? "P" : "Z";
    }
    
    public boolean match(int ID) {
        return this.ID == ID;
    }
    
    public int getMark() {
        return this.mark;
    }

    public String getGrade() {
        return this.grade;
    }
    
    @Override
    public String toString() {
        return String.format("Student-%03d [%2d --> %2s] ", +ID, mark,grade);
    }
}
