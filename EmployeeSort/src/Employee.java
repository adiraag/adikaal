import java.io.Serializable;

/**
 * Created by upadhyad on 7/28/2017.
 */
public class Employee implements Comparable, Serializable {

    private int empId;
    private String name;
    transient private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Object O) {
        Employee emp = (Employee) O;
        return this.empId - emp.empId;

    }
}
