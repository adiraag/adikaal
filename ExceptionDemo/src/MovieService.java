import java.util.InvalidPropertiesFormatException;

/**
 * Created by upadhyad on 7/26/2017.
 */
public class MovieService extends Exception {



    public void watch(User user) throws InvalidUserAge, AgeLessThan10, AgeLessThan20, RatingBelow3 {
        int age = user.getAge();
        int rating = user.getRating();

        if(age < 10) {
            throw new AgeLessThan10("User's age is less than 10 years");
        } else if (age < 20) {
            throw new AgeLessThan20("User's age is less than 20 years");
        } else if (age <= 0) {
            throw new InvalidUserAge("User's age cannot be zero or negative");
        }
        if (rating < 3) {
            throw new RatingBelow3("Rating is below 3");
        }
    }

    public void buy(User user, double price) throws PriceLessThan20000, InvalidPrice {
        if(price < 20000) {
            throw new PriceLessThan20000("Price is less than 20000");
        }else if(price <= 0) {
            throw new InvalidPrice("Price is not valid");
        }
    }

}
