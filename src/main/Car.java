public class Car implements Comparable<Car>{

    String brand;
    int miles;
    int year;

    public Car(String brand, int miles, int year) {
        this.brand = brand;
        this.miles = miles;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car compareCar) {
        int compareYear= compareCar.getYear();
        return this.year-compareYear;
    }
}
