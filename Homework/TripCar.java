package Homework;

import java.util.Scanner;

public abstract class TripCar {
    private int id;
    private String nameDriver;
    private String licensePlate;
    private double revenue;

    static Scanner scanner = new Scanner(System.in);

    public TripCar() {

    }

    public TripCar(int id, String nameDriver, String licensePlate, double revenue) {
        this.id = id;
        this.nameDriver = nameDriver;
        this.licensePlate = licensePlate;
        this.revenue = revenue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void inputCar() {
        System.out.println("Nhap ma chuyen xe: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten tai xe: ");
        nameDriver = scanner.nextLine();
        System.out.println("Nhap bien so xe:");
        licensePlate = scanner.nextLine();
        System.out.println("NHap doanh thu:");
        revenue = scanner.nextDouble();
    }
    public String toString() {
        return "Id: " + this.id + " , Name driver: " + this.nameDriver
                + " , License Plate: " + this.licensePlate + " , revenue: " + this.revenue;
    }
}
