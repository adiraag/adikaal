import java.util.*;

/**
 * Created by upadhyad on 7/25/2017.
 */
public class CarData {

    public static void main(String[] args) {


        Set<Car> treedata = new TreeSet<>();

        treedata.add(new Car(11, "bmw", 1200000));
        treedata.add(new Car(12, "audi", 20000));
        treedata.add(new Car(13, "maruti", 3200000));
        treedata.add(new Car(14, "tata", 4200000));
        treedata.add(new Car(15, "porsche", 5200000));
        treedata.add(new Car(16, "renault", 6200000));
        treedata.add(new Car(17, "mercedes", 7200000));
        treedata.add(new Car(18, "chevrolet", 8200000));
        treedata.add(new Car(19, "nissan", 9200000));
        treedata.add(new Car(20, "rangerover", 200000));
        treedata.add(new Car(21, "landcruiser", 300000));
        treedata.add(new Car(22, "alto", 400000));
        treedata.add(new Car(23, "santro", 500000));
        treedata.add(new Car(24, "beat", 600000));
        treedata.add(new Car(25, "honda", 700000));
        treedata.add(new Car(26, "dzire", 800000));
        treedata.add(new Car(27, "polo", 900000));
        treedata.add(new Car(28, "benz", 100000));
        treedata.add(new Car(29, "tavera", 1100000));
        treedata.add(new Car(30, "indica", 1300000));
        treedata.add(new Car(31, "duster", 140000));
        treedata.add(new Car(32, "jaguar", 1500000));
        treedata.add(new Car(33, "opel", 23400000));
        treedata.add(new Car(35, "nano", 45670000));
        treedata.add(new Car(34, "skoda", 560000));


        System.out.println("Cars Sorted by price");
        List<Car> listByPrice = new ArrayList<>(treedata);

        Iterator<Car> itr = listByPrice.iterator();


        System.out.println();
        while (itr.hasNext()) {
            Car car1 = itr.next();

            System.out.println(car1);
        }
        System.out.println("-------------------------");



        List<Car> listById = new ArrayList<>(treedata);
        Collections.sort(listById, new CompareId());
        Iterator<Car> itr2 = listById.iterator();
        System.out.println("Cars sorted by Ids");
        System.out.println();
        while (itr2.hasNext()) {
            Car car2 = itr2.next();
            System.out.println(car2);

        }
        System.out.println("----------------------------");


        List<Car> listByBrand = new ArrayList<>(treedata);
        Collections.sort(listByBrand, new CompareBrand());
        Iterator<Car> itr3 = listByBrand.iterator();
        System.out.println("Cars sorted by Brands");
        System.out.println();
        while (itr3.hasNext()) {
            Car car3 = itr3.next();
            System.out.println(car3);

        }
    }
}

