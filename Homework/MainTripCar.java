package Homework;

import java.util.Scanner;

public class MainTripCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap di cho chi");
        System.out.println("Nhap so chuyen xe noi thanh:");
        int numberInnerCity = scanner.nextInt();
        System.out.println("Nhap so chuyen xe ngoai thanh:");
        int numberSuburban = scanner.nextInt();
        SuburbanCar[] suburbanCars;
        InnerCityCar[] innerCityCars;
        double totalRevenueOfSuburban = 0;
        double totalRevenueOfInnerCity = 0;
        suburbanCars = new SuburbanCar[numberSuburban];
        innerCityCars = new InnerCityCar[numberInnerCity];

        System.out.println("-------------------------");
        System.out.println("Nhap thong tin chuyen xe noi thanh:");
        for (int i = 0; i < numberInnerCity; i++) {
            System.out.println("chuyen noi thanh thu " + (i + 1) + " la :");
            innerCityCars[i] = new InnerCityCar();
            innerCityCars[i].inputInnerCity();
        }
        System.out.println("---------------------------------");
        System.out.println("Nhap thong tin chuyen xe ngoai thanh:");
        for (int i = 0; i < numberSuburban; i++) {
            System.out.println("chuyen ngoai thanh thu " + (i + 1) + " la :");
            suburbanCars[i] = new SuburbanCar();
            suburbanCars[i].inputSuburban();
        }
        System.out.println("Thong tin cac xe vua nhap:");
        System.out.println("----------------");
        System.out.println("Xe noi thanh");
        for (InnerCityCar element : innerCityCars) {
            System.out.println(element);
            totalRevenueOfInnerCity += element.getRevenue();
        }
        System.out.println("----------------");
        System.out.println("Xe ngoai thanh");
        for (SuburbanCar element : suburbanCars) {
            System.out.println(element);
            totalRevenueOfSuburban += element.getRevenue();
        }
        System.out.println();
        System.out.print("\nTổng doanh thu của các xe nội thành là : " + totalRevenueOfInnerCity);
        System.out.print("Tổng doanh thu của các xe ngoại thành là : " + totalRevenueOfSuburban);
    }
}
