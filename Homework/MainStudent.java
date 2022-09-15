package Homework;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class MainStudent {
    public static void enterInformation(Student st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        st.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("enter name:");
        st.setName(sc.nextLine());
        System.out.println("enter address");
        st.setAddress(sc.nextLine());
        do {
            System.out.println("enter phone number:");
            st.setPhoneNumber(sc.nextLine());
        } while (st.getPhoneNumber().length() != 7);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student[] = null;
        System.out.println("enter n student:");
        int numberStudent = scanner.nextInt();
        student = new Student[numberStudent];
        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Sinh vien thu " + (i+1) + " la :");
            student[i] = new Student();
            enterInformation(student[i]);
        }
        System.out.println("---------------------------------");
        System.out.println("Thong tin sv vua nhap:");
        System.out.printf("%-5s %-15s %-15s %-20s \n", "MSV","Họ và tên","Địa chỉ","Số điện thoại");
        for (int i = 0; i < numberStudent; i++) {
            student[i].HienDS();
        }

        Student sapxep = student[0];
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getId() > student[j].getId()) {
                    sapxep = student[j];
                    student[j] = student[i];
                    student[i] = sapxep;
                }
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Danh sach sau khi sx:");
        System.out.printf("%-5s %-15s %-15s %-20s \n", "MSV","Họ và tên","Địa chỉ","Số điện thoại");
        for (int i = 0; i < numberStudent; i++) {
            student[i].HienDS();
        }
    }
}
