package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise001 {


    public static void main(String[] args) throws Exception {
        System.out.println("Exercise 1");
        System.out.println("%nfilterCars");
        filterCars();
        System.out.println("%nfindPerson");
        findPerson();
        System.out.println("%n");
    }

    public static void filterCars() throws Exception {
        // I'm in the market to buy a new car, and I'm looking for something very particular:
        // It has to be made in or before 2001, cost 30000 or less, and be coloured Green.
        // I would like the results printed out to the console
        // I have provided you with the list of cars to find these from below:
        List<Car> cars = MockData.getCars();
        System.out.println("Cars: year <= 2001, price <= 30000, colour= Green");
        cars.stream()
                .filter(car -> car.year() <= 2001)
                .filter(car -> car.price() <= 30000)
                .filter(car -> car.colour().equals("Green"))
                .forEach(System.out::println);
        // write your solution here
    }

    public static void findPerson() throws IOException {
        // I'm looking for the details of someone in particular and I don't have much to go on
        // All I know is that it's a Male, older than 30, who's initials are A M.
        // Can you find people who match this to help whittle down my search?
        // Output your result to the console

        System.out.println("Cars: age >30, gender = Male, Initials=A.M.");

        List<Person> people = MockData.getPeople();
        people.stream().filter(person -> person.age() > 30)
                .filter(person -> person.gender().equals("Male"))
                .filter( person -> person.firstName().startsWith("A"))
                .filter( person -> person.lastName().startsWith("M"))
                .forEach(System.out::println);
        // write your solution here

    }
}
