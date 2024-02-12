import java.util.*;
import java.io.*;

public class CourseDA {
    private ArrayList<Course> courseList;
    private Integer totalUnits;

    //CONSTRUCTOR
    public CourseDA(String studentNumber) throws IOException {
        File file = new File("C:\\Users\\Jhoen\\Desktop\\WORK\\IntelliJ\\COMReportVersion2\\src\\scheduleinfo.csv");
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        String row;
        String[] value;
        courseList = new ArrayList<Course>();
        totalUnits = 0;

        while(scanner.hasNext()) {
            row = scanner.nextLine();
            value = row.split(",");

            if (studentNumber.equals(value[0].trim())) {
            Course course = new Course();
            course.setCourseCode(value[1].trim());
            course.setDescription(value[2].trim());
            course.setUnit(Integer.parseInt(value[3].trim()));
            course.setDay(value[4].trim());
            course.setTime(value[5].trim());

            courseList.add(course);
            totalUnits += course.getUnit();
            }
        }
        scanner.close();
        fileReader.close();
    }

    //GETTER
    public ArrayList<Course> getCourseList() {
        return this.courseList;
    }

    public Integer getTotalUnits() {
        return this.totalUnits;
    }
}
