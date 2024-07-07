import java.util.Objects;

public class Car {
    private String name;
    private int  jearOfissue;
    private int mileage;

    public Car(String name, int jearOfissue, int mileage) {
        this.name = name;
        this.jearOfissue = jearOfissue;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJearOfissue() {
        return jearOfissue;
    }

    public void setJearOfissue(int jearOfissue) {
        this.jearOfissue = jearOfissue;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return jearOfissue == car.jearOfissue && mileage == car.mileage && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jearOfissue, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", jearOfissue=" + jearOfissue +
                ", mileage=" + mileage +
                '}';
    }
}
