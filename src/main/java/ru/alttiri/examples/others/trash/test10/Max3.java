package ru.alttiri.examples.others.trash.test10;

public class Max3 {
    void max2(Float x, Float y) {
        if (x > y) System.out.println("X - is float");
        else System.out.println("Y - is float");
    }
    void max(Double x, Double y) {
        if (x > y) System.out.println("X - is double");
        else System.out.println("Y - is double");
    }

    public static void main(String[] args) {
        Max3 max = new Max3();
        max.max(null, null); // теперь однозначно
    }
}
