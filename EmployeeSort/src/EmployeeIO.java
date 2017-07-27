import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by upadhyad on 7/28/2017.
 */
public class EmployeeIO {

    public static void main(String[] args) {
        List<Employee> empReader = new ArrayList<Employee>();
        List empWriter = EmployeeData.data();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("C:/Users/upadhyad/Documents/stream/employee.txt");
            oos = new ObjectOutputStream(fos);
            Iterator<Employee> itr = empWriter.iterator();

            while (itr.hasNext()) {
                Employee em = itr.next();
                if (em.getSalary() > 40000.00) {
                    oos.writeObject(em);
                    empReader.add(em);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        boolean check = true;
        try {
            fis = new FileInputStream("C:/Users/upadhyad/Documents/stream/employee.txt");
            ois = new ObjectInputStream(fis);
//            Employee e = (Employee) ois.readObject();
            Collections.sort(empReader);
            Employee empl = (Employee) ois.readObject();
            while (check) {
//        while (empl != null){
                System.out.println(empl);
                try {
                    empl = (Employee) ois.readObject();
                } catch (EOFException e) {
                    check = false;
                }
            }
//        Iterator<Employee> itr2 = empReader.iterator();
//        System.out.println("Cars sorted by Ids");
//        System.out.println();
//        while (itr2.hasNext()) {
//            Employee emp2 = itr2.next();
//            System.out.println(emp2);
//
//        }
//            System.out.println(e.getEmpId());
//            System.out.println(e.getName());
//            System.out.println(e.getSalary());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (EOFException e) {
                check = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

