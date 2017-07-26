/**
 * Created by upadhyad on 7/26/2017.
 */
public class Cinema {

    public static void main(String[] args) {
        User u1 = new User(101,"AMAN",35,2);

        MovieService movie = new MovieService();
        try {
            movie.watch(u1);
            movie.buy(u1,34.6);

        } catch (AgeLessThan10 ageLessThan10) {
            System.out.println(ageLessThan10.getMessage());
        } catch (RatingBelow3 ratingBelow3) {
            System.out.println(ratingBelow3.getMessage());
        } catch (AgeLessThan20 ageLessThan20) {
            System.out.println(ageLessThan20.getMessage());
        } catch (InvalidUserAge invalidUserAge) {
            System.out.println(invalidUserAge.getMessage());
        } catch (InvalidPrice invalidPrice) {
            System.out.println(invalidPrice.getMessage());
        } catch (PriceLessThan20000 priceLessThan20000) {
            System.out.println(priceLessThan20000.getMessage());
        }
    }
}
