package Homework;

public class InnerCityCar extends TripCar {
    private int routeNumber;
    private float numberKm;
    public InnerCityCar() {

    }

    public InnerCityCar(int routeNumber, float numberKm) {
        this.routeNumber = routeNumber;
        this.numberKm = numberKm;
    }

    public InnerCityCar(int id, String nameDriver, String licensePlate, double revenue, int routeNumber, float numberKm) {
        super(id, nameDriver, licensePlate, revenue);
        this.routeNumber = routeNumber;
        this.numberKm = numberKm;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public float getNumberKm() {
        return numberKm;
    }

    public void setNumberKm(float numberKm) {
        this.numberKm = numberKm;
    }

    public void inputInnerCity() {
        super.inputCar();
        System.out.println("Nhao so tuyen: ");
        routeNumber = scanner.nextInt();
        System.out.println("Nhap so km di duoc:");
        numberKm = scanner.nextFloat();
    }
    @Override
    public String toString() {
        return super.toString() + ", Route number: " +this.routeNumber + ", number km: " + this.numberKm;
    }
}
