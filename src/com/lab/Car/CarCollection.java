package com.lab.Car;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarCollection {
    private Car[] carsArray;

    public void outputListOfCar() {
        System.out.println("List all cars:");
        for(Car obj: carsArray) {
            System.out.println(obj);
        }
    }

    public ArrayList<Car> listCurrentYearAndPrice(int yearCar, double priceCar) {
        ArrayList<Car> cars = new ArrayList<>();
        for (Car obj: carsArray) {
            if ( (obj.getYear()==yearCar) && (obj.getPrice()>(priceCar)) ) {
                cars.add(obj);
            }
        }
        return cars;
    }

    public ArrayList<Car> listCurrentModelAndYear(String carModel, int age) {
        ArrayList<Car> cars = new ArrayList<>();
        for (Car obj: carsArray) {
            if ( (obj.getModel().equals(carModel)) && (obj.getYear()<(2020-age)) ) {
                cars.add(obj);
            }
        }
        return cars;
    }

    public ArrayList<Car> listCurrentModel(String model){
        ArrayList<Car> cars = new ArrayList<>();
        for (Car obj: carsArray) {
            if (obj.getModel().equals(model)){
                cars.add(obj);
            }
        }
        return cars;
    }

    private int inputNumOfCars(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input numbers of cars :");
        return scanner.nextInt();
    }

    public void createArrayCars() {
        int numOfCar=inputNumOfCars();
        ArrayList<String> model=openFileModelName();
        carsArray =new Car[numOfCar];
        for (int i = 0; i < numOfCar; i++) {
            carsArray[i]=createCar(model) ;
        }
    }

    private Car createCar(ArrayList<String> model){
        Random random = new Random();
        int id =Math.abs(random.nextInt());
        String randomModel =model.get(random.nextInt(model.size()));
        int year = 1980+random.nextInt(40);
        int price =1000+random.nextInt(100000);
        int registrationNumber = Math.abs(random.nextInt());
        return new Car(id,randomModel,year,price,registrationNumber);
    }

    public ArrayList<String> openFileModelName(){
        ArrayList<String> models= new ArrayList<>();
        String tmp;
            try {
            BufferedReader buf=new BufferedReader(new FileReader(new File("model")));
                while ((tmp=buf.readLine())!=null){
                    models.add(tmp);
                }
                  buf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return models;
    }
}
