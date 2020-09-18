package _3_pl_triangl;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class lesson_3 {
    static Scanner aa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Вычисление пощади треугольника по трем сторонам");
        int a,b,c;
        double p,s;
        boolean f;
        System.out.println("Введите сторону 1: ");
        a = aa.nextInt();
        System.out.println("Введите сторону 2: ");
        b = aa.nextInt();
        System.out.println("Введите сторону 3: ");
        c=aa.nextInt();
        f = (a + b > c)&(a + c > b)&(b + c > a);
        if (f){
            p = ((double)a + b + c)/2;
            double sqrt;
            s = sqrt(p*(p - a)*(p - b)*(p - c));
            System.out.println("площадь треугольника = " + s);
        }else System.out.println("Из этих отрезков треугольник не получается (:");
    }
}
