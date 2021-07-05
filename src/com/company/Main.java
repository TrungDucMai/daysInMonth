package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang can tinh ngay vao day");
        int month = sc.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "Co 31 ngay";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "Co 30 ngay";
                break;

            default:
                daysInMonth = "";
                break;
        }
            if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
            else System.out.print("Invalid input!");

        }

    }

