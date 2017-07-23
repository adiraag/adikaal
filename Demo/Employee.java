/**
 * Created by upadhyad on 7/22/2017.
 */
public class Employee {

    String fName;
    String lName;
    String deptName;
    int empId;
    String city;

    public Employee(String fName, String lName, String deptName, int empId, String city) {
        this.fName = fName;
        this.lName = lName;
        this.deptName = deptName;
        this.empId = empId;
        this.city = city;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                fName + '\'' +
                lName + '\'' +
                deptName + '\'' +
                 empId +
                     city + '\'' +
                '}';
    }


}
