package com.lab.Main;

import com.lab.Car.Car;
import com.lab.Car.CarCollection;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static CarCollection carCollection;
    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

    carCollection = new CarCollection();
    carCollection.createArrayCars();
    carCollection.outputListOfCar();

    System.out.println("-------------------");
    printListCurrentModel();
    System.out.println("-------------------");
    printListCurrentModelAndYear();
    System.out.println("-------------------");
    printListCurrentYearAndPrice();
    }


    private static String inputCarModel(){
        System.out.print("Enter search car model : ");
        return scan.nextLine();
    }

    private static int inputMinimumCarAge(){
        System.out.print("Enter the minimum age of the car : ");
        return scan.nextInt();
    }

    private static int inputCarYear(){
        System.out.print("Enter year of manufacture of the car : ");
        return scan.nextInt();
    }

    private static double inputCarPrice(){
        System.out.print("Enter the minimum price of the car : ");
        return scan.nextDouble();
    }

    private static void printListCurrentModel(){
        ArrayList<Car> cars;
        String carModel;
        carModel=inputCarModel();
        cars= carCollection.listCurrentModel(carModel);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void printListCurrentModelAndYear(){
        ArrayList<Car> cars;
        int ageCar;
        String carModel;
        carModel=inputCarModel();
        ageCar=inputMinimumCarAge();
        cars= carCollection.listCurrentModelAndYear(carModel,ageCar);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void printListCurrentYearAndPrice(){
        ArrayList<Car> cars;
        int yearCar;
        double priceCar;
        yearCar=inputCarYear();
        priceCar=inputCarPrice();
        cars =carCollection.listCurrentYearAndPrice(yearCar,priceCar);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
