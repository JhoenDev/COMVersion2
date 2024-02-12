import java.util.*;
import java.io.*;

public class Course {
    private String courseCode;
    private String description;
    private Integer unit;
    private String day;
    private String time;

    //GETTERS
    public String getCourseCode() {
        return this.courseCode;
    }
    public String getDescription() {
        return this.description;
    }
    public Integer getUnit() {
        return this.unit;
    }
    public String getDay() {
        return this.day;
    }
    public String getTime() {
        return this.time;
    }

    //SETTERS
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setUnit(Integer unit) {
        this.unit = unit;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return String.format("|%-12s |%-22s |%-7d |%-5s |%s\n",courseCode, description, unit, day, time);
    }
}
