package creational.abstractfactory.website;

import creational.abstractfactory.abstractFactoryImpl.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes Php code");
    }
}
