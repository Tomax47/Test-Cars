import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Car> cars;

    public Inventory() {
        cars = new LinkedList<>();
    }

    public void addCar(String model, int price, int maxSpeed, int fuelBurn, int passengersNum, CarSpec spec) {
        Car car = new Car(model, price, maxSpeed, fuelBurn, passengersNum, spec);
        cars.add(car);
    }

    public Car getCar(String model) {
        for (Iterator<Car> i = cars.iterator(); i.hasNext();) {
            Car car = i.next();
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> search(String bodyType, String engineType, String transmission, String color) {

        CarSpec spec = new CarSpec(bodyType, engineType, transmission, color);
        List<Car> matches = new ArrayList<>();
        for (Iterator<Car> i = cars.iterator(); i.hasNext();) {
            Car car = i.next();
            if (spec.getBodyType() != null && !spec.getBodyType().equals("") && !spec.getBodyType().equals(car.getSpec().getBodyType())) {
                continue;
            }
            if (spec.getEngineType() != null && !spec.getEngineType().equals("") && !spec.getEngineType().equals(car.getSpec().getEngineType())) {
                continue;
            }
            if (spec.getTransmission() != null && !spec.getTransmission().equals("") && !spec.getTransmission().equals(car.getSpec().getTransmission())) {
                continue;
            }
            if (spec.getColor() != null && !spec.getColor().equals("") && !spec.getColor().equals(car.getSpec().getColor())) {
                continue;
            }
            matches.add(car);
        }
        return matches;
    }

}
