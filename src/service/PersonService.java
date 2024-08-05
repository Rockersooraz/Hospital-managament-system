package service;

import Person.Person;
import Person.Patient;

import java.util.List;

public class PersonService {

    public static void getPersonDetails(List<Person> personList) {
        for(Person person: personList){
            displayPersonDetails(person);
        }

    }

    public static void displayPersonDetails(Person person) {
        person.displayDetails();
    }

}