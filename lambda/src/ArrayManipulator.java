import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by upadhyad on 7/28/2017.
 */
class ArrayManipulator {
    int arr[];

    public ArrayManipulator(int[] arr) {
        this.arr = arr;
    }

    public void forEach(Consumer<Integer> cons) {
        for (int num : arr) {
            cons.accept(num);
        }


    }

    public void modify(Function<Integer,Integer> function) {
        for(int i =0; i < arr.length; i++) {
            arr[i] = function.apply(arr[i]);
        }
    }
    public void delete(Predicate<Integer> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if(predicate.test(arr[i])) {
                arr[i] = 0;
            }

        }
    }
    public  int fold(BiFunction<Integer, Integer, Integer> biFunction) {
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = biFunction.apply(arr[i-1],arr[i]);

        }
        return arr[arr.length - 1];
    }
}
