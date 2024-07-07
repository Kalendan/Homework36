import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Seat", 1999, 40000);
        Car car2 = new Car("BMW", 2000, 4500);
        Car car3 = new Car("VW", 2012, 20000);
        Car car4 = new Car("WW", 2015, 3000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Optional<Integer> optional = cars.stream()
                .filter(car -> car.getJearOfissue() > 1999)
                .filter(car -> car!= null)
                .reduce(car -> car.getMileage())
                .filter(car->car.getMileage() >= 500000)
                .min(Comparator.comparingInt(car-> car.getJearOfissue()));

        List<Car> maxMileage = cars.stream()
                .filter(car-> car.getName()!=null)
                .filter(car -> car.getName().startsWith("W"||"V"))
                .max(car -> Integer.compare(car.getMileage() <= 200000)
                .toList();



    }
}