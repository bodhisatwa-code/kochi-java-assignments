import java.util.*;

public class StudentExecuter {

    public static void main(String[] args){

        Student sunil = new Student(
            "sunil",
            new ArrayList<Integer>(List.of(56,88,23))
        );
        Student bindul = new Student(
            "bindul",
            new ArrayList<Integer>(List.of(88,70,10))
        );
        Student john = new Student(
            "jhon",
            new ArrayList<Integer>(List.of(70,49,65))
        );

        System.out.println(sunil.toString());
        System.out.println(bindul.toString());
        System.out.println(john.toString());

        System.out.println("");

        System.out.println( "Marks of Sunil : " + sunil.totalMarksFromString());
        System.out.println( "Marks of Bindul : " + bindul.totalMarksFromString());
        System.out.println( "Marks of John : " + john.totalMarksFromString());

        System.out.println("John has the heighst marks");

        ArrayList<Integer> marks_list = new ArrayList<Integer>(List.of(
            sunil.totalMarksFromString(),
            bindul.totalMarksFromString(),
            john.totalMarksFromString()
        ));
        


    }
}