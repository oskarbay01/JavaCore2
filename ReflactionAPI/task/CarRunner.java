package com.oskarbay.lesson22.task;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyoto", "Corolla");
        System.out.println(car);
    }

//    public static String generateInsert(Car car) {
//        String template = "INSERT INTO %s.%s (%s) VALUES (%S)";
//        Table table = car.getClass().getAnnotation(Table.class);
//        Field[] fields = car.getClass().getDeclaredFields();
//
//        String fieldName = Arrays.stream(fields)
//                .filter(field -> field.isAnnotationPresent(Column.class))
//                .map(field -> field.getAnnotation(Column.class))
//                .map(Column::name)
//                .collect(Collectors.joining(", "));
//
//    }
}
