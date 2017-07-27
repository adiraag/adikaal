import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by upadhyad on 7/28/2017.
 */
public class EmployeeData implements Serializable {

//    public static void main(String[] args) {

//       List<Employee> empList = new ArrayList<>();
//
//        empList.add(new Employee(11, "AJAY", 45000));
//        empList.add(new Employee(12, "VIJAY", 5000));
//        empList.add(new Employee(13, "SANJAY", 15000));
//        empList.add(new Employee(14, "RAJ", 55000));
//        empList.add(new Employee(15, "ATUL", 65000));
//        empList.add(new Employee(16, "AMAN", 75000));
//        empList.add(new Employee(17, "VARUN", 85000));
//        empList.add(new Employee(18, "AJIT", 95000));
//        empList.add(new Employee(19, "VIJIT", 25000));
//        empList.add(new Employee(20, "SHUBHAM", 35000));
//        empList.add(new Employee(21, "JOHN", 23000));
//        empList.add(new Employee(22, "SHERLOCK", 33000));
//        empList.add(new Employee(23, "ROBERT", 20000));
//        empList.add(new Employee(24, "MUKESH", 11000));
//        empList.add(new Employee(25, "ANIL", 48000));

//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream("C:/Users/upadhyad/Documents/stream/employee.txt");
//            oos = new ObjectOutputStream(fos);
//            Iterator<Employee> itr = empList.iterator();
//
//            while (itr.hasNext()) {
//                Employee e = itr.next();
//                if (e.getSalary() > 40000.00) {
//                    oos.writeObject(e);
//                }
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally{
//            try{
//                if(oos != null){
//                    oos.close();
//                }
//                if(fos != null){
//                    fos.close();
//                }
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//    }
//}

    public static List<Employee> data() {
        return Arrays.asList(
                new Employee(11, "AJAY", 46000),
                new Employee(12, "VIJAY", 5000),
                new Employee(13, "SANJAY", 15000),
                new Employee(14, "RAJ", 55000),
                new Employee(15, "ATUL", 65000),
                new Employee(16, "AMAN", 75000),
                new Employee(17, "VARUN", 85000),
                new Employee(18, "AJIT", 95000),
                new Employee(19, "VIJIT", 25000),
                new Employee(20, "SHUBHAM", 35000),
                new Employee(21, "JOHN", 23000),
                new Employee(22, "SHERLOCK", 33000),
                new Employee(23, "ROBERT", 20000),
                new Employee(24, "MUKESH", 11000),
                new Employee(25, "ANIL", 48000)
        );
    }


}
