class Car {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

public class EncapsulationBasic2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Tesla Model S");
        System.out.println("Car model: " + c.getModel());
    }
}