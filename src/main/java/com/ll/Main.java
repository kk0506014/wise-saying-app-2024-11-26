package com.ll;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lab1();
        lab2();
    }

    private static void lab1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("명령)");
        String cmd = sc.nextLine().trim();
        
        System.out.println("입력한 명령: " + cmd);
    }

    private static void lab2() {
        InputStream in = new ByteArrayInputStream("메롱".getBytes());
        Scanner sc = new Scanner(System.in);

        System.out.println("명령)");
        String cmd = sc.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);
    }
}