import java.util.concurrent.Callable;

/**
 * Created by upadhyad on 8/2/2017.
 */
public class PrimeRange5 implements Callable {
    public Integer call() {
        int count = 0;

        int i = 0;
        int num = 0;
        int sum = 0;


        for (i = 401; i <= 500; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {

                sum = sum + i;

            }

        }
        return sum;
    }
}

