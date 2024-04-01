package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar=new ElectricCar("tesla","electrical car",100,4);
        CarSkeleton hybridCar=new HybridCar("toyota","tt car",0.8,4,4);
        CarSkeleton gasCar=new GasPoweredCar("mustang","shelby",10,4);

        printResult(electricCar);
        printResult(hybridCar);
        printResult(gasCar);

    }

    private static void printResult(CarSkeleton car) {
        System.out.println(car.drive());
    }
}
