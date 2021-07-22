import java.util.*;

public class Student {
    public String name;
    public ArrayList<Integer> marks;

    public Student(
        String name,
        ArrayList<Integer> marks
    ){
        this.name = name;
        this.marks = marks;
        
    }


    public String toString(){
        String marks_string = "";
        for(int i=0;i<this.marks.size();i++){
            marks_string += "-"+this.marks.get(i);
        }
        return this.name + marks_string;
    }

    public int totalMarksFromString(){
        String student_string = this.toString();
        ArrayList<String> marks = new ArrayList<String>(List.of(student_string.split("-")));
        int total = 0;
        marks.remove(0);
        for(int i=0 ; i < marks.size() ; i++ ){
            total += Integer.parseInt(marks.get(i));
        }
        return total;
    }
}