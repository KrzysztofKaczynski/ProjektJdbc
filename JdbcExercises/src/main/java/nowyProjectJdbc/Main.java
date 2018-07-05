package nowyProjectJdbc;

import nowyProjectJdbc.dao.PetDao;
import nowyProjectJdbc.model.Person;
import nowyProjectJdbc.config.Config;
import nowyProjectJdbc.dao.PersonDao;
import nowyProjectJdbc.model.Pet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //DODANIE OSOBY DO LISTY
        try (Connection h2connection = Config.getInstance().getConnection()) {
            PersonDao personDao = new PersonDao(h2connection);
            List<Person> personList = personDao.readAllPerson();

            for (Person p : personList) {
                System.out.println("Person read from db: ");
                System.out.println(p);
                System.out.println();
            }

            Person person2 = new Person("Wiesiek", "Żul", 500);
            personDao.addPersonToDao(person2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //DODANIE ZWIERZAKA DO LISTY
        try (Connection h2connection = Config.getInstance().getConnection()) {
            PetDao petDao = new PetDao(h2connection);
            List<Pet> listOfPets = petDao.readAllPets();

            for (Pet p : listOfPets) {
                System.out.println("Pet read from db: ");
                System.out.println(p);
                System.out.println();
            }

            Pet pet2 = new Pet("Dog", "Rysiek", 5);
            petDao.insertPetToDao(pet2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
