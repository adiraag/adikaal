import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by upadhyad on 8/2/2017.
 */
public class PrimeRangeDisplay {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future = executor.submit(new PrimeRange1());
        int primeSum = future.get();
        future = executor.submit(new PrimeRange2());
        primeSum = primeSum + future.get();
        future = executor.submit(new PrimeRange3());
        primeSum = primeSum + future.get();
        future = executor.submit(new PrimeRange4());
        primeSum = primeSum + future.get();
        future = executor.submit(new PrimeRange5());
        primeSum = primeSum + future.get();

        System.out.println(primeSum);


    }
}