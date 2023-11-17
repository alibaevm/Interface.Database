package model;

public class Laptop {
    private String model;

    public Laptop() {
    }

    public Laptop(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                '}';
    }
}
