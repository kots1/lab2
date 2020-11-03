package com.lab.Main;

import com.lab.Car.Car;

import java.util.Scanner;

public class Main {
    private Car[] masObjects;
    public static void main(String[] args) {

    String carModel;
    int yearCar;
    double priceCar;
    Main start=new Main();
    Scanner scan=new Scanner(System.in);
    start.createObjects();
    start.outputListOfCar();
    System.out.println("-------------------");
    System.out.print("Enter search car model : ");
    carModel=scan.nextLine();
    start.listCurrentModel(carModel);
    System.out.println("-------------------");
    System.out.print("Enter search car model : ");
    carModel=scan.nextLine();
    System.out.print("Enter the minimum age of the car : ");
    yearCar=scan.nextInt();
    start.listCurrentModelAndYear(carModel,yearCar);
    System.out.println("-------------------");
    System.out.print("Enter year of manufacture of the car : ");
    yearCar=scan.nextInt();
    System.out.print("Enter the minimum price of the car : ");
    priceCar=scan.nextDouble();
    start.listCurrentYearAndPrice(yearCar,priceCar);
    }

    private void outputListOfCar() {
        System.out.println("List all cars:");
        for(Car obj:masObjects)
        {
            System.out.println(obj);
        }
    }

    private void createObjects() {
        masObjects=new Car[10];
        masObjects[0]= new Car("378529725" ,"Toyota",2017,9000, 267);
        masObjects[1] = new Car("1689725" ,"BMW",2005,1500, 125);
        masObjects[2]= new Car("6159725" ,"Lexus",2005,1600, 137);
        masObjects[3]= new Car("4373725" ,"Mazda",2010,3300, 598);
        masObjects[4]= new Car("4537025" ,"Mercedes",2011,3500, 158);
        masObjects[5]= new Car("4376725" ,"Mazda",2012,3200, 126);
        masObjects[6]= new Car("7963725" ,"BMW",2013,3500, 489);
        masObjects[7]= new Car("73739725" ,"Tesla",2018,8000, 185);
        masObjects[8]= new Car("7372725" ,"Toyota",2016,9000, 259);
        masObjects[9]= new Car("31478725" ,"Mazda",2014,5000, 489);
    }

    private void listCurrentYearAndPrice(int yearCar, double priceCar) {
        int num=0;
        for (Car obj:masObjects) {
            if ( (obj.getYear()==yearCar) && (obj.getPrice()>(priceCar)) )
            {
                System.out.println(obj);
                num++;
            }
        }
        if(num==0){
            System.out.println("This model doesn't exist");
        }
    }

    private void listCurrentModelAndYear(String carModel, int age) {
        int num=0;
        for (Car obj:masObjects) {
            if ( (obj.getModel().equals(carModel)) && (obj.getYear()<(2020-age)) )
            {
                System.out.println(obj);
                num++;
            }
        }
        if(num==0){
            System.out.println("This model doesn't exist");
        }
    }

/*
    public void createObjects() {
        masObjects=new Car[numOfCars];
        for (int i = 0; i < numOfCars; i++) {
            masObjects[i]=inputCar(i+1);
        }
    }

    private Car inputCar(int num) {
        String id;
        String model;
        int year;
        double price;
        int registrationNumber;
        Scanner scan=new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Car № "+num);
        System.out.println("Enter info about car");
        System.out.print("id = " );
        id =scan.nextLine();
        System.out.print("model = " );
        model =scan.nextLine();
        System.out.print("year = " );
        year =scan.nextInt();
        System.out.print("price = " );
        price =scan.nextDouble();
        System.out.print("registration number = " );
        registrationNumber =scan.nextInt();
        return new Car(id,model,year,price,registrationNumber);
    }
*/
    public void listCurrentModel(String model){
        int num=0;
        for (Car obj:masObjects) {
            if (obj.getModel().equals(model)){
                System.out.println(obj);
                num++;
            }
        }
        if(num==0){
            System.out.println("This model doesn't exist");
        }
    }
}
/*
1689725
BMW
2005
1500
125
6159725
Lexus
2005
1600
137
4373725
Mazda
2010
3300
598
4537025
Mercedes
2011
3500
158
4376725
Mazda
2012
3200
126
7963725
BMW
2013
3500
489
73739725
Tesla
2018
8000
137
7372725
Toyota
2016
9000
259
31478725
Mazda
2014
5000
489
437829725
Mazda
2015
5000
485
378529725
Toyota
2017
9000
267
37389725
Mazda
2010
4500
497
727725
BMW
2018
10000
249

*/