import java.util.*;
import java.io.*;

public class BlockSectionDA {
    public BlockSectionDA() throws IOException {
        File file = new File("C:\\Users\\Jhoen\\Desktop\\WORK\\IntelliJ\\COMReportVersion2\\src\\blockSection.csv");
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        String row;
        String[] value;

        while(scanner.hasNext()) {
            row = scanner.nextLine();
            value = row.split(",");

            BlockSection blockSection = new BlockSection();
            blockSection.setBlockCode(value[0].trim());
            blockSection.setDescription(value[1].trim());
            blockSection.setAdviser(value[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());
            blockSection.setTotalStudents(studentDA.getTotalStudents());

            System.out.println(blockSection);
        }
        scanner.close();
        fileReader.close();
    }

}
