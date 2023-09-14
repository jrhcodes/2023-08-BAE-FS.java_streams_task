package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise004 {

    public static void main(String[] args) throws IOException {
        findAverageCarPrice();
        dataFilteringAndTransformation();
    }

    public static void findAverageCarPrice() throws IOException {
        // Using streams() API find the average car price (to the nearest whole number) from the list of cars
        // Output the resulting double value to the console
        List<Car> cars = MockData.getCars();

        double averagePrice = cars.stream()
                .mapToDouble(Car::price)
                .average()
                .orElse(0.0);

        System.out.printf("Average price %.2f%n", averagePrice);
    }

    public static void dataFilteringAndTransformation() throws IOException {
        // I would like to do some object transformation and see a list of PersonDTO objects
        // for all people over the age of 65
        // The PersonDTO can be found in /data_models
        // Print the result to the console

        List<Person> people = MockData.getPeople();

        // write your solution here
    }


}
