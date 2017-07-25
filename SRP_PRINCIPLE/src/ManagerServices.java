/**
 * Created by upadhyad on 7/25/2017.
 */
public class ManagerServices {

    public static void changeProject(int exp) {
        if (exp > 1) {
            System.out.println("Project changed to Digital adverising");
        } else {
            System.out.println("Project not changed");
        }
    }

    public static void changeDesignation(int exp) {
        if (exp > 3) {
            System.out.println("Designation changed to Senior member");
        } else {
            System.out.println("Designation not changed");
        }
    }
}

