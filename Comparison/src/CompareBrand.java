import java.util.Comparator;

/**
 * Created by upadhyad on 7/26/2017.
 */
public class CompareBrand implements Comparator<Car> {

    public int compare(Car b1, Car b2) {

        return b1.getBrand().compareTo(b2.getBrand());
    }


}
