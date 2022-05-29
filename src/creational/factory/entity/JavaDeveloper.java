package creational.factory.entity;

import creational.factory.entity.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java Code ");
    }
}
