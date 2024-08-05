import Person.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("1", "Ram", "1996/05/05", "ram50@gmail.com", "Male", "Mississauge", "4125563256");
        displayPersonDetails(person);
    }

    public static void displayPersonDetails(Person person) {
        person.displayDetails();
    }
}