
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class AssessmentTest2Level2 {


    @Test
    public void addCarsToCarStore() {

        CarStore carStore = new CarStore();

        carStore.addCar(new Car("Porsche", 1000, 2004));
        Assert.assertEquals(1, carStore.getNumberOfCarsInStore());

        carStore.addCar(new Car("Volvo", 1200, 1993));
        Assert.assertEquals(2, carStore.getNumberOfCarsInStore());

        carStore.addCar(new Car("Tesla", 100, 2018));
        Assert.assertEquals(3, carStore.getNumberOfCarsInStore());
    }

    @Test
    public void getCarsSortedByYear() {

        CarStore carStore = new CarStore();
        carStore.addCar(new Car("Porsche", 1000, 2004));
        carStore.addCar(new Car("Volvo", 1200, 1993));
        carStore.addCar(new Car("Tesla", 100, 2018));

        carStore.sortCarsByYear();
        List<Car> cars = carStore.getCars();
        Assert.assertEquals("Volvo", cars.get(0).getBrand());
        Assert.assertEquals("Porsche", cars.get(1).getBrand());
        Assert.assertEquals("Tesla", cars.get(2).getBrand());
    }

    @Test
    public void addNewCars() {
        CarStore carStore = new CarStore();
        int year = LocalDate.now().getYear();

        carStore.addNewCars(5, "Volvo", 0, year);
        Assert.assertEquals(5, carStore.getNumberOfCarsInStore());

        carStore.addCar(new Car("Tesla", 100, 2018));
        Assert.assertEquals(6, carStore.getNumberOfCarsInStore());
    }

}