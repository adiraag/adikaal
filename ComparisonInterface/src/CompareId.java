import java.util.Comparator;

/**
 * Created by upadhyad on 7/26/2017.
 */
public class CompareId implements Comparator<Car> {
    public int compare(Car c1, Car c2) {

        return c1.getCarId() - c2.getCarId();

    }
}
