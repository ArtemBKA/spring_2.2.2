package web.models;

public class Car {
    private boolean transmission;
    private int series;
    private String model;

    public Car(boolean transmission, int series, String model) {
        this.transmission = transmission;
        this.series = series;
        this.model = model;
    }

    public boolean getTransmission() {
        return transmission;
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Transmission = " + (transmission ? "Automatic" : "Manual")+
                ", Series = " + series +
                ", Model = " + model +
                "}";
    }
}
