package creational.factory;

import creational.factory.entity.Developer;
import creational.factory.factory.CppDeveloperFactory;
import creational.factory.factory.DeveloperFactory;
import creational.factory.factory.JavaDeveloperFactory;
import creational.factory.factory.PhpDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown  specialty");
        }
    }
}
