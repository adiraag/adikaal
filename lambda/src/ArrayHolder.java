import org.junit.Test;

/**
 * Created by upadhyad on 7/28/2017.
 */
public class ArrayHolder {
//    public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4, 45, 78, 33, 21};

    ArrayManipulator arm = new ArrayManipulator(arr);

    @Test
    public void testForEach() {
        arm.forEach((Integer num) -> {
            System.out.println(num);
        });
    }
    @Test
    public void testModify() {
        arm.modify((num) -> {
            return (num*10);
        });
    }

    @Test
    public void testDelete() {
        arm.delete((num) -> {
            return  num < 15;
        });
    }

    @Test
    public void testFold() {
        System.out.println(
        arm.fold((num1, num2) -> {
            return num1 + num2;
        }));
    }
}




