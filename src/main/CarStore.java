import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarStore {

    List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public int getNumberOfCarsInStore() {
        return cars.size();
    }

    public void sortCarsByYear() {

        Collections.sort(cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addNewCars(int numberOfCars, String brand, int miles, int year) {

        Car car = new Car(brand, miles, year);

        for (int i = 0; i < numberOfCars; i++) {
            cars.add(car);
        }
    }
}
