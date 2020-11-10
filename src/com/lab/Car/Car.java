package com.lab.Car;

public class Car {
    private int id;
    private String model;
    private int year;
    private int price;
    private int registrationNumber;

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                "$ , registration number=" + registrationNumber +
                '}';
    }

    public Car(int id, String model, int year, int price, int registrationNumber) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
