import java.util.*;
import java.io.*;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private Integer totalStudents;
    private ArrayList<Student> studentList;

    //GETTERS
    public String getBlockCode() {
        return this.blockCode;
    }
    public String getDescription() {
        return this.description;
    }
    public String getAdviser() {
        return this.adviser;
    }
    public Integer getTotalStudents() {
        return this.totalStudents;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    //SETTERS
    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }
    public void setTotalStudents(Integer totalStudents) {
        this.totalStudents = totalStudents;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    //PRINT
    public String toString() {
        String string = "_________________________________________________________________________\n\n"
                + String.format("%-21s%s\n","Block Section Code: ",blockCode)
                + String.format("%-21s%s\n","Description: ",description)
                + String.format("%-21s%s\n\n","Adviser: ",adviser)
                + String.format("%-21s%s\n\n","Total Students: ",totalStudents)
                + "_________________________________________________________________________\n";

        for (Student student : studentList)
            string += student;

        return string;
    }
}
