package creational.factory.entity;

import creational.factory.entity.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code");
    }
}
