package Homework;

public class SuburbanCar extends TripCar {
    private String destination;
    private double numberDay;
    public SuburbanCar() {

    }

    public SuburbanCar(String destination, double numberDay) {
        this.destination = destination;
        this.numberDay = numberDay;
    }

    public SuburbanCar(int id, String nameDriver, String licensePlate, double revenue, String destination, double numberDay) {
        super(id, nameDriver, licensePlate, revenue);
        this.destination = destination;
        this.numberDay = numberDay;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(double numberDay) {
        this.numberDay = numberDay;
    }

    public void inputSuburban() {
        super.inputCar();
        scanner.nextLine();
        System.out.println("Nhao noi den: ");
        destination = scanner.nextLine();
        System.out.println("Nhap so ngay di duoc:");
        numberDay = scanner.nextFloat();
    }
    @Override
    public String toString() {
        return super.toString() + ", destination: " +this.destination + ", number day: " + this.numberDay;
    }
}
