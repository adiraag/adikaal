/**
 * Created by upadhyad on 7/25/2017.
 */
public class Car implements Comparable<Car> {

    private int carId;
    private String brand;
    private double price;

    public Car(int carId, String brand, double price) {
        this.carId = carId;
        this.brand = brand;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Car c){
        if(this.price == c.price)
            return 0;
        else if(this.price > c.price) {
            return 1;
        }
        return -1;
    }

}
