import Person.Person;
import Person.Patient;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("1", "Ram", "1996/05/05", "ram50@gmail.com", "Male", "Mississauga", "4125563256"));
        person.add(new Patient("1", "JP", "2000/05/05", "jp09@gmail.com", "Male", "Toronto", "2589745", "Diabetic", "Insured"));
        PersonService.getPersonDetails(person);
    }

}