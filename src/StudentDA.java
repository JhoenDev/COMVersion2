import java.util.*;
import java.io.*;

public class StudentDA {
    private ArrayList<Student> studentList;
    private Integer totalStudents;

    //CONSTRUCTOR
    public StudentDA(String blockCode) throws IOException {
        File file = new File("C:\\Users\\Jhoen\\Desktop\\WORK\\IntelliJ\\COMReportVersion2\\src\\studentinfo.csv");
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        String row;
        String[] value;
        studentList = new ArrayList<Student>();
        totalStudents = 0;

        while(scanner.hasNext()){
            row = scanner.nextLine();
            value = row.split(",");

            if (blockCode.equals(value[0].trim())) {
                Student student = new Student();
                student.setStudentNumber(value[1].trim());
                student.setName(value[2].trim());
                student.setProgram(value[3].trim());

                CourseDA courseDA = new CourseDA(student.getStudentNumber());
                student.setCourseList(courseDA.getCourseList());
                student.setTotalUnitsEnrolled(courseDA.getTotalUnits());

                studentList.add(student);
                totalStudents ++;
            }
        }
        scanner.close();
        fileReader.close();
    }

    //GETTER
    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }
    public Integer getTotalStudents() {
        return this.totalStudents;
    }
}
