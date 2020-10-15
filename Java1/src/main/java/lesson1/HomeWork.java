package lesson1;

import java.util.Stack;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Hello !!!");
        int kal = 0;
        kal();

        int a=0; int b=0; a=10; b=20;
        prov(a, b);

        int d=0; d=3;
        otvet(d);

        int f=0; f=10;
        vozvrat(f);

        String otvet = "Паша";
        privet(otvet);
    }

    static void kal() {
        int a = 10, b = 20, c = 300, d = 40;
        int mal = 0;
        mal = a * (b + (c / d));
        System.out.println("mal = " + mal);
    }

    public static boolean prov(int a, int b) {
        int c = 0;
        c = a + b;
        if (c >= 10 || c <=20) {
            System.out.println("TRUE");
            return true;
        }
        else
            {
                System.out.println("FALSE");
                return false;}
    }

    public static void otvet(int d) {
        //int d = 0;
        if (d >= 0){
            System.out.println("Metod положительно");
        } else System.out.println("Metod отрицательно");
    }

    public static boolean vozvrat(int f) {
        if (f > 0) {
            System.out.println("FALSE");
            return false;
        } else {
            System.out.println("TRUE");
            return true;
        }
    }

    public static void privet(String otvet) {
        System.out.println("Привет, " + otvet + "!");
    }


}
