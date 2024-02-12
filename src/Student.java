import java.util.*;
import java.io.*;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private Integer totalUnitsEnrolled;
    private ArrayList<Course> courseList;

    //GETTERS
    public String getStudentNumber() {
        return this.studentNumber;
    }
    public String getName() {
        return this.name;
    }
    public String getProgram() {
        return this.program;
    }
    public Integer getTotalUnitsEnrolled() {
        return this.totalUnitsEnrolled;
    }
    public ArrayList<Course> getCourseList() {
        return this.courseList;
    }

    //SETTERS
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public void setTotalUnitsEnrolled(Integer totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
    }
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    //PRINT
    public String toString() {
        String string = String.format("\n%-25s%s\n","Student Number: ",studentNumber)
                + String.format("%-25s%s\n","Name: ",name)
                + String.format("%-25s%s\n","Program: ",program)
                + String.format("%-25s%d\n\n","Total Units Enrolled: ",totalUnitsEnrolled)
                + String.format("|%-12s |%-22s |%-7s |%-5s |%s\n","Course Code", "Description", "Units", "Day", "Time");

        for (Course course:courseList)
            string += course;

        return string;
    }
}
