package com.company;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class Program {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int a = scan.nextInt();
        System.out.println("������� ������ �����: ");
        int b = scan.nextInt();
        System.out.println("������� ������ �����: : ");
        int c = scan.nextInt();
        int sum = a+b+c;
        System.out.println("����� ����� ����� = "+sum);
    }
}
