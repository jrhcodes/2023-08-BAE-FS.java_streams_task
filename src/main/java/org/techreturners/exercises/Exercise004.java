package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.data_models.PersonDTO;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise004 {

    public static void main(String[] args) throws IOException {
        System.out.println("Exercise 4");
        System.out.println("\nfindAverageCarPrice");
        findAverageCarPrice();
        System.out.println("\ndataFilteringAndTransformation");
        dataFilteringAndTransformation();
        System.out.println("\n");
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

        List<PersonDTO> dtoList = people.stream()
                .filter(person -> person.age() > 65)
                .map(person -> new PersonDTO(person.id(), "%s, %s".formatted(person.lastName(), person.firstName()), person.age())).toList();

        dtoList.forEach(dto -> System.out.printf("{id=%d,name=\"%s\",age=%d}%n", dto.getId(), dto.getName(), dto.getAge()));

    }


}
