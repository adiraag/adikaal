import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by upadhyad on 7/22/2017.
 */
public class Data {

    public static List<Employee> createData() {

       return Arrays.asList(

                new Employee("Virat","Kohli","Sports",01,"Pune"),
                new Employee("Ajay","Shastri","Sports",02,"Pune"),
                new Employee("Virat","AKohli","Sports",03,"Pune"),
                new Employee("Ramesh","Adams","Finance",04,"Pune"),
                new Employee("Suresh","Roy","Finance",05,"Pune"),
                new Employee("Mahesh","Sharma","Finance",06,"Pune"),
                new Employee("Ajit","Verma","HR",07,"Pune"),
                new Employee("Vijit","Kohli","HR",8,"Hyderabad"),
                new Employee("Sid","Sharma","HR",9,"Hyderabad"),
                new Employee("Varun","Roy","R&D",10,"Hyderabad"),
                new Employee("Vikas","Mishra","R&D",11,"Pune"),
                new Employee("Joy","Sharma","R&D",12,"Pune"),
                new Employee("John","Roy","Tech",13,"Pune"),
                new Employee("Bruce","Kohli","Tech",14,"Pune"),
                new Employee("Brian","Adams","Tech",15,"Pune")
        );



    }

    @Test
    public void testCity() {

        List<Employee> employees = createData();



        //Comparator<Employee> comparator = ;
        Collections.sort(employees, new EmployeeComparator());
        for (Employee e : employees) {

            System.out.println(e);
        }

    }



}
