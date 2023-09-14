package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise003 {

    public static void main(String[] args) throws IOException {
        System.out.println("Exercise 3");
        System.out.println("\ngroupByColour");
        groupByColour();
        System.out.println("\n");
    }

    public static void groupByColour() throws IOException {
        // I would like information for some cars returned in a specific way.
        // I'm looking for cars that are less than 20000 and made in 1995
        // Group the results together by their colour and print to the console


        List<Car> cars = MockData.getCars();

        Map<String, List<Car>> groupedCars = cars.stream()
                .filter(car -> car.price() < 20000 && car.year() == 1995)
                .collect(Collectors.groupingBy(Car::colour));

        // Print the grouped cars to the console
        groupedCars.forEach((color, carList) -> {
            System.out.println("Color: " + color);
            carList.forEach(System.out::println);
        });

    }
}
