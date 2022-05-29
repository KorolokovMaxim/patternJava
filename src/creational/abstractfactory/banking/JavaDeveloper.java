package creational.abstractfactory.banking;

import creational.abstractfactory.abstractFactoryImpl.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java Code");
    }
}
