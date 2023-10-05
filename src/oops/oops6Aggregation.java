package oops;

import java.util.ArrayList;
import java.util.List;

class College{
    String name;
    private List<Teacher> teachers;
    //Constructor
    public College(String name, List<Teacher> teacher){
        this.name = name;
        this.teachers = teacher;
    }
    //Getter to get the teacher name.
    public List<Teacher> getTeachers(){
        return teachers;
    }
}

class Teacher{
    String name;
    String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    @Override
    public String toString(){
        return "Teacher "+name+"Subject "+subject;
    }
}

public class oops6Aggregation {
    //A teacher object, and then we'll add that teacher object to the list.
    //Then we will pass that list with along with the name of the college to the College object.
    public static void main(String[] args) {
        List<Teacher> teacherName = new ArrayList<>();
        teacherName.add(new Teacher("Rohn","Java"));
        teacherName.add(new Teacher("Brad","JavaScript"));

        //Object of College Class
        College myCollege = new College("XYZ",teacherName);
        //We know establishing a relationship between two different classes is association.
        // So in this program we pass the object of teacher class to the college class.
    }
}
