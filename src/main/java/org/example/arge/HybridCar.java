package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerliter;
    private int batterySize;
    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerliter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerliter = avgKmPerliter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public String startEngine() {
        runEngine(this);
        return getName()+" car starting...";
    }

    @Override
    public String drive() {
        runEngine(this);
        return "run from Electric car";
    }

    public double getAvgKmPerliter() {
        return avgKmPerliter;
    }

    public void setAvgKmPerliter(double avgKmPerliter) {
        this.avgKmPerliter = avgKmPerliter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
