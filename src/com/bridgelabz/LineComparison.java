package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();

        double length=Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length :"+length);
    }
}
