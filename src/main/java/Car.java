public class Car {
    String name;
    String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
