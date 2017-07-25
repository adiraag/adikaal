/**
 * Created by upadhyad on 7/25/2017.
 */
public class AnnotationTest {


    @Company(name = "CDK Global", loacation = "Pune")


    public AnnotationTest() {
        System.out.println("Using company annotation at constructor level");
    }

    @TimeStamp(day = TimeStamp.Day.MONDAY, month = TimeStamp.Month.AUG, year = TimeStamp.Year.YEAR2017)
    void display() {
        System.out.println("using timestamp annotations");
    }
}

