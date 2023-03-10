package ru.croc.task2;

import ru.croc.task2.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.x1 = 5;
        rectangle.y1 = 10;
        rectangle.x2 = 15;
        rectangle.y2 = 20;

        System.out.println(rectangle.y2);
    }
}
